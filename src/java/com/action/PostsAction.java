package com.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.orm.Admin;
import com.orm.Board;
import com.orm.Post;
import com.orm.Reply;
import com.orm.Student;
import com.service.IAdminService;
import com.service.IBoardService;
import com.service.IPostService;
import com.service.IStudentService;
import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;


public class PostsAction extends ActionSupport {

    private Post post;
    private List<Post> list;
    private Set<Reply> replies;
    private List<Post> myPosts;
    private Student student;
    private Admin admin;
    private String result;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
    

    @Resource(name="postService")
    IPostService postService;
    
    @Resource(name="boardService")
    IBoardService boardService;
    
    @Resource(name="studentService")
    IStudentService studentService;
    
    @Resource(name="adminService")
    IAdminService adminService;
    
    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
    

    public List<Post> getMyPosts() {
        return myPosts;
    }

    public void setMyPosts(List<Post> myPosts) {
        this.myPosts = myPosts;
    }

    
    public Set<Reply> getReplies() {
        return replies;
    }

    public void setReplies(Set<Reply> replies) {
        this.replies = replies;
    }
       
    public List<Post> getList() {
        return list;
    }

    public void setList(List<Post> list) {
        this.list = list;
    }

    
    
    //默认执行 
   @Override
    public String execute() throws Exception {
        setList(postService.allPost());
        return SUCCESS;
    }
   
   //跳转发帖
   public String preparePost() throws Exception
   {
        HttpServletRequest request = ServletActionContext.getRequest();
        Student s = (Student) request.getSession().getAttribute("student");
        if (s!=null) {
       setStudent(studentService.getStudentByStuNum(s.getStuNum()));
       }
       
       return "preparePost";
   }
   
    //发帖
    public String addPost() throws Exception
    {
         HttpServletRequest request = ServletActionContext.getRequest();
        int bid=0;
        if (request.getParameter("bid")!=null) {
            bid = Integer.valueOf(request.getParameter("bid"));
        }
        Post p = getPost();
        Board b = boardService.loadBoard(bid);
        Student s = (Student) ActionContext.getContext().getSession().get("student");
        Admin a  = (Admin) ActionContext.getContext().getSession().get("admin");
        if (s!=null) 
        {
            p.setStudent(s);
            p.setBoard(b);
            p.setContent(getPost().getContent());
            p.setPublishTime(new Date());
            p.setCount(0);
            if (postService.saveOrUpdate(getPost())) 
            {
                post = p;
                return "postSuccess";
            }
            return ERROR;
        }
        if (a!=null) {
            p.setAdmin(a);
            p.setBoard(b);
            p.setContent(getPost().getContent());
            p.setPublishTime(new Date());
            p.setCount(0);
            if (postService.saveOrUpdate(getPost())) 
            {
                post = p;
                return "postSuccess";
            }
            return ERROR;
        }
        return ERROR;
       
       
    }
    
   //查看帖子
    public String viewDetail()
    {
       HttpServletRequest request = ServletActionContext.getRequest();
       //学生登录
        if (request.getSession().getAttribute("student")!=null) {
              Student s = (Student) request.getSession().getAttribute("student");
               setStudent(studentService.getStudentByStuNum(s.getStuNum()));
        }
        //管理员登陆
        if (request.getSession().getAttribute("admin")!=null) {
            Admin a = (Admin) request.getSession().getAttribute("admin");
            setAdmin(admin);
        }
     
       int pid =Integer.parseInt(request.getParameter("pid"));
       Post p = postService.loadPost(pid);
       //设置点击量+1
       p.setCount(p.getCount() ==null?0:p.getCount()+1);
       postService.saveOrUpdate(p);
       setPost(postService.loadPost(pid));
        if (getPost()!=null) {
            setReplies(postService.loadPost(pid).getReplies());
            return "viewDetail";
        }
       return  ERROR;
    }
    
    //带分页的
    public void viewAll(int pageNo, int pageSize)
    {   
        int bid = Integer.valueOf(ServletActionContext.getRequest().getParameter("bid"));
        setList(postService.pageAllPost(bid,pageNo, pageSize));
    }

    //查看我的帖子
    public String viewPostsByUser()
    {
        Student s = (Student) ActionContext.getContext().getSession().get("student");
        Admin a = (Admin) ActionContext.getContext().getSession().get("admin");
        if (s!=null) {
              setMyPosts(postService.allPostsByUser(s));
              setStudent(studentService.getStudentByStuNum(s.getStuNum()));
             return "myposts";
        }
        if (a!=null) {
               setMyPosts(postService.allPostsByUser(a));
               setAdmin(adminService.loadAdmin(a.getId()));
              return "myposts";
        }
        return ERROR;
    }
    //准备修改
    public String prepareModify() throws Exception
    {
        int pid = -1;
         if (ServletActionContext.getRequest().getParameter("pid")!=null) {
            pid = Integer.valueOf(ServletActionContext.getRequest().getParameter("pid"));
        }
        setPost(postService.loadPost(pid));
        return "prepareSuccess";
    }
    
    //修改帖子
    public String modifyPost() throws Exception
    {
         int pid = -1;
         if (ServletActionContext.getRequest().getParameter("pid")!=null) {
            pid = Integer.valueOf(ServletActionContext.getRequest().getParameter("pid"));
            Post tempPost = postService.loadPost(pid);
            tempPost.setName(getPost().getName());
            tempPost.setContent(getPost().getContent());
             if (postService.saveOrUpdate(tempPost)) {
                 setResult("Mok");
                 return "modifySuccess";
             }
             return ERROR;
        }
       return ERROR;
         
    }
    //删除帖子 
    public String deletePost() throws Exception
    {
          int pid = -1;
         if (ServletActionContext.getRequest().getParameter("pid")!=null) {
            pid = Integer.valueOf(ServletActionContext.getRequest().getParameter("pid"));
             if (postService.deletePost(pid)) {
                 setResult("Dok");
                 return "deleteSuccess";
             }
            return ERROR;
        }
       return ERROR;
    }
              
    //搜索帖子 按帖子名搜索
    public  String searchPost() throws Exception
    {
        //TO 搜索帖子 要执行搜索函数
        //要执行搜索函数 需要键入关键字
        try {
        String searchKey = getPost().getName().trim();
            if (searchKey!="") {
             setList(postService.searchPosts(searchKey));
             return "searchSuccess";
            }
            return ERROR;
        } catch (Exception e) {
            e.printStackTrace();
            return ERROR;
        }
        
    }
    /**
     * @return the post
     */
    public Post getPost() {
        return post;
    }

    /**
     * @param post the post to set
     */
    public void setPost(Post post) {
        this.post = post;
    }
}
