package com.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.orm.Admin;
import com.orm.Board;
import com.orm.Post;
import com.orm.Student;
import com.service.IBoardService;
import com.service.ILoginService;
import com.service.IPostService;
import com.service.IStudentService;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;

public class LogInAction extends ActionSupport {

    private Student student;
    private Admin admin;
    private String tip;
    private int pageNo; //当前页
    private int pageSize; //每页条数
    private int count;
    private List<Post> list;
    private int bid;
    private Board board;

    @Resource(name = "loginService")
    ILoginService loginService;
    @Resource(name = "postService")
    IPostService postService;
    @Resource(name="studentService")
    IStudentService studentService;
    @Resource(name="boardService")
    IBoardService boardService;
    
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public LogInAction() {
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }
    
    
    
    @Override
    public String execute() throws Exception {
        //登录前清空所有session
        ActionContext.getContext().getSession().clear();
        Student s = loginService.stuLogin(student);
        if (s != null) {
            ActionContext.getContext().getSession().put("student", s);
            List<Post> result = postService.allPost();
            setList(result);
            System.out.println("OK");
            return "loginSuccess";
        }
        addActionMessage("用户名或密码错误！");
        System.out.println("BAD");
        return INPUT;
    }

    public String adminLogin() throws Exception {
        //登录前清空所有session

        ActionContext.getContext().getSession().clear();

        Admin a = loginService.adminLogin(getAdmin());
        if (a != null) {
            ActionContext.getContext().getSession().put("admin", a);
            List<Post> result = postService.allPost();
            setList(result);
            return "loginSuccess";
        }
        addActionMessage("用户名或密码错误！");
        return INPUT;
    }

    //分页帖子列表
    public String showAll() {
        //设置每页条数
        setPageSize(15);
        
        HttpServletRequest request = ServletActionContext.getRequest();
        
        Student tempStudent = (Student) request.getSession().getAttribute("student");
        setBoard(boardService.loadBoard(getBid()));
        if (request.getParameter("page") != null) {
            setPageNo(Integer.parseInt(request.getParameter("page")));
            System.out.println(pageNo);
        } else {
            setPageNo(1);
        }
        
        if (request.getParameter("bid")!=null) {
            setBid(Integer.parseInt(request.getParameter("bid")));
        }
        
        
        try {
            setCount(postService.getPostsCount());
            setList(postService.pageAllPost(getBid(),getPageNo(), getPageSize()));
            if (tempStudent!=null) {
               setStudent(studentService.getStudentByStuNum(tempStudent.getStuNum()));
            }
            return SUCCESS;
        } catch (Exception e) {
            return ERROR;
        }

    }
    //注销登录

    public String exit() {
        ActionContext.getContext().getSession().clear();
        return "exit";
    }

}
