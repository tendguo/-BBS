 
package com.serviceImpl;

import com.dao.BaseDao;
import com.orm.Post;
import com.orm.Reply;
import com.orm.Student;
import com.service.IReplyService;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.annotation.Resource;

    
public class ReplyServiceImpl  implements IReplyService {
    
     @Resource(name="dao")
     BaseDao dao;

    @Override
    public boolean stuReplyPost(Student student,Post post,Reply reply) 
    {
        try 
        {
            reply.setStudent(student);
            reply.setPost(post);
            reply.setContent(reply.getContent());
            reply.setPublishTime(new Date());
            dao.saveOrUpdate(reply);
            return true;
        } 
        catch (Exception e)
        {
           return false;
        }
        
    }

    @Override
    public List<Reply> getReplysByPid(int pId) {
          try {
            List<Reply> replys = (List<Reply>) dao.loadObject("from reply as r where r.pid = '"+pId+"'   ");
            return replys;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public boolean modifyReply(Reply reply) {
        try {
            dao.saveOrUpdate(reply);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean delReply(int rid) {
        try {
            dao.delById(Reply.class, rid);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Reply loadReply(int rid) {
      return (Reply) dao.loadById(Reply.class, rid);
    }


    
    
    
}
