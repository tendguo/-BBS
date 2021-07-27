package com.service;

import com.orm.Post;
import java.util.List;


public interface IPostService {        
    public boolean saveOrUpdate(Post post);
    
    public List<Post> allPost();
    
    public List<Post> pageAllPost(int bid,int pageNo, int pageSize);
    
    public int getPostsCount();
    
    public Post loadPost(int id);
    
    public List<Post> allPostsByUser(Object user);
    
    public boolean deletePost(int id);
    
    public List<Post> searchPosts(String searchKey);
    
    public List<Post> rankPosts(int size);
    
    public int countTotalPost();
    
    public int countTodayPost();
    
    public int countYesteradyPost();
    
    public int countDayLargestPost();
}
