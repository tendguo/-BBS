package com.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.orm.Student;
import com.service.IStudentService;
import javax.annotation.Resource;


public class StudentManageAction extends ActionSupport {

    @Resource(name = "studentService")
    IStudentService studentService;
    private Student student;
    private String psw;
    private String newPsw;
    private String confirmPsw;
    
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String execute() throws Exception {
        return super.execute();
    }

     
    //显示个人信息
    public String personalStuInfo() throws Exception
    {
        Student sessionStudent = (Student) ActionContext.getContext().getSession().get("student");
        if (sessionStudent != null) {
            setStudent(studentService.getStudentByStuNum(sessionStudent.getStuNum()));
            return SUCCESS;
        }
        return ERROR;
    }
    
    //修改个人信息
    public String modifyStuInfo() throws  Exception
    {
         Student snStudent = (Student) ActionContext.getContext().getSession().get("student");
         Student s = studentService.getStudentByStuNum(snStudent.getStuNum());
         Student temp = getStudent();
         s.setNickName(temp.getNickName());
         s.setQq(temp.getQq());
         s.setEmail(temp.getEmail());
         
        if (studentService.modifyStudent(s)) {
            return "modifySuccess";
        }
        return ERROR;
    }
    
    //修改密码
    public String ModifyPsw() throws Exception
    {
        //获取当前学生信息
        Student sessionStudent = (Student) ActionContext.getContext().getSession().get("student");
        Student s = studentService.getStudentByStuNum(sessionStudent.getStuNum());
        if (getPsw().equals(s.getPassword()) && getNewPsw().equals(getConfirmPsw())  ) {
            s.setPassword(getNewPsw());
            studentService.modifyStudent(s);
            addActionMessage("密码修改成功！");
            return "modifyPswSuccess";
        }
        return ERROR;
    }

    /**
     * @return the psw
     */
    public String getPsw() {
        return psw;
    }

    /**
     * @param psw the psw to set
     */
    public void setPsw(String psw) {
        this.psw = psw;
    }

    /**
     * @return the newPsw
     */
    public String getNewPsw() {
        return newPsw;
    }

    /**
     * @param newPsw the newPsw to set
     */
    public void setNewPsw(String newPsw) {
        this.newPsw = newPsw;
    }

    /**
     * @return the confirmPsw
     */
    public String getConfirmPsw() {
        return confirmPsw;
    }

    /**
     * @param confirmPsw the confirmPsw to set
     */
    public void setConfirmPsw(String confirmPsw) {
        this.confirmPsw = confirmPsw;
    }

}
