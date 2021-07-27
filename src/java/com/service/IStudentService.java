/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.orm.Student;


public interface IStudentService {
    
    public Student getStudentByStuNum(String StuNum);
    
    public boolean modifyStudent(Student student);
    
}
