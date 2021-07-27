
package com.service;

import com.orm.Admin;
import com.orm.Student;


public interface ILoginService {
    /**
	 * 学生登录
	 * 
	 * @param student
	 */
	public Student stuLogin(Student student);

	/**
	 * 管理员登录
	 * 
	 * @param admin
	 */
	public Admin adminLogin(Admin admin);
}
