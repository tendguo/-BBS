
package com.service;

import com.orm.Post;
import com.orm.Reply;
import com.orm.Student;
import java.util.List;


public interface IReplyService {
    //加载一条回复
    public Reply loadReply(int rid);
    
    //获取回复
    public List<Reply> getReplysByPid(int pId);
    
    //学生回帖
    public boolean stuReplyPost(Student student,Post post,Reply reply);
    
    
    //修改回复
    public boolean modifyReply(Reply reply);
    
    //删除回复
    public boolean delReply(int rid);
    
    //查看回复数
 //   public int CountReplyByUser(Object user);
    
    //管理员回帖
    
}
