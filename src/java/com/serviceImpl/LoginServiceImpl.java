package com.serviceImpl;

import com.dao.BaseDao;
import com.orm.Admin;
import com.orm.Student;
import com.service.ILoginService;
import javax.annotation.Resource;


public class LoginServiceImpl implements ILoginService {
     
     @Resource(name="dao")
     BaseDao dao ;
    
    @Override
    public Student stuLogin(Student student) {
         //判断学号和密码是否与数据库相等
        Student stu = (Student) dao.loadObject("from Student as s where s.stuNum = '"+student.getStuNum()+"' and s.password= '"+student.getPassword()+"' ");
        if (stu!=null) {
            return  stu;
        }
        return  null;
    }

    @Override
    public Admin adminLogin(Admin admin) {
        //管理员登录验证
        Admin a = (Admin) dao.loadObject("from Admin as a where a.account = '"+admin.getAccount()+"' and a.password = '"+admin.getPassword()+"' ");
        if (a!=null) {
            return  a;
        }
        return  null;
    }
    
}
