
package com.serviceImpl;

import com.dao.BaseDao;
import com.orm.Admin;
import com.orm.Post;
import com.orm.Student;
import com.service.IPostService;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.Resource;


public class PostServiceImpl implements IPostService {
    @Resource(name="dao")
     BaseDao dao;

    @Override
    public boolean saveOrUpdate(Post post) {
        try {
            dao.saveOrUpdate(post);
            return  true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<Post> allPost() {
         List<Post> list = dao.listAll("Post");
         return list;
    }

    @Override
    public Post loadPost(int id) {
       return  (Post) dao.loadById(Post.class, new Integer(id));
    }

    @Override
    public List<Post> allPostsByUser(Object user) {
        if (user instanceof Student ) {
            Student s = (Student)user;
            List<Post> list = (List<Post>) dao.query("from Post as p where p.student = "+s.getId()+" order by p.publishTime desc  ");
            return list;
        }
        if (user instanceof Admin) {
            Admin a = (Admin)user;
            List<Post> list = dao.query("from Post as p where p.admin.id ='"+a.getId()+"'  ");
            return list;
        }
        return null;
    }

    @Override
    public List<Post> pageAllPost(int bid,int pageNo, int pageSize) {
        return dao.query("from Post as p where p.board ='"+bid+"' order by p.publishTime desc   ", pageNo, pageSize);
    }

    @Override
    public int getPostsCount() {
        return  dao.countAll("Post");
    }

    @Override
    public boolean deletePost(int id) {
        try 
        {
            dao.delById(Post.class, id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<Post> searchPosts(String searchKey) {
        return dao.query("from Post as p where p.name like '%"+searchKey+"%' ");
    }

    @Override
    public List<Post> rankPosts(int size) {
        List<Post> list = dao.query("from Post as p order by p.count desc "); 
        List<Post> result = new ArrayList<Post>();

        for (int i = 0; i < size; i++) {
            result.add(list.get(i));
        }
        return result;
    }

    @Override
    public int countTotalPost() {
       return dao.countAll("Post");
    }

    @Override
    public int countYesteradyPost() {
        Date todayDate = new Date();
        Date ysterDate = new Date(System.currentTimeMillis()-1000*60*60*24);
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        String today = sf.format(todayDate)+" 00:00:00";
        String yesterday = sf.format(ysterDate)+" 00:00:00";
       return dao.countQuery("select count(*) from Post as p where p.publishTime between '"+yesterday+"' and '"+today+"'     " );
       //return dao.countQuery("select count(*) from Post as p where p.publishTime > '"+today+"' ");
    }

    @Override
    public int countDayLargestPost() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int countTodayPost() {
        Date todayDate = new Date();
        Date tomorrowDate = new Date(System.currentTimeMillis() + 1000*60*60*24);
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        String today = sf.format(todayDate)+" 00:00:00";
        String tomorrow = sf.format(tomorrowDate)+" 00:00:00";
       return dao.countQuery("select count(*) from Post as p where p.publishTime between '"+today+"' and '"+tomorrow+"'     " );
    }
}
