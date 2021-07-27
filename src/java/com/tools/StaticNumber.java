 
package com.tools;

import com.orm.Post;
import com.service.IPostService;
import com.serviceImpl.PostServiceImpl;
import java.util.List;
import javax.annotation.Resource;

public class StaticNumber   {
    static IPostService postService = new PostServiceImpl();
    
    static int total;
    //不能返回实例
    public static int totalPost()
    {
        return  1;
        //total = postService.totalPost();
        //return  postService.totalPost();
    }
    
    public static long give()
    {
        return System.currentTimeMillis();
    }
    
    public static List<Post> posts()
    {
        return postService.allPost();
    }
}
