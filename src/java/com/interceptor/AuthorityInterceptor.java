/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interceptor;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import com.orm.Admin;
import com.orm.Student;
import java.util.Map;

/**
 *
 * @author Administrator
 */
public class AuthorityInterceptor extends MethodFilterInterceptor {

 
    @Override
    protected String doIntercept(ActionInvocation ai) throws Exception {
       ActionContext ctx = ai.getInvocationContext();
       Map session = ctx.getSession();
        if (session.get("student") == null && session.get("admin") == null ) {
            return Action.LOGIN;
        }
        else 
        {
           Student stu = (Student)session.get("student");
           Admin admin = (Admin)session.get("admin");
            if (stu!=null) {
                if (stu.getNickName() == null) {
                    return  "stuPersonalInfo";
                }
                return ai.invoke();
            }
            
            if (admin!=null) {
                if (admin.getNickName() == null) {
                    return "adminPersonalInfo";
                }
                return ai.invoke();
            }
        }
       return  Action.LOGIN;   
       
    }
    
}
