package com.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.orm.Board;
import com.orm.Student;
import com.service.IBoardService;
import com.service.IStudentService;
import java.io.*;

import javax.annotation.Resource;
import org.apache.struts2.ServletActionContext;

@SuppressWarnings("serial")
public class MyUpload extends ActionSupport {
    
    @Resource(name="studentService")
    IStudentService studentService;
    
    @Resource(name="boardService")
    IBoardService boardService;
    
    // 封装上传文件域的属性
    private File doc;
    // 封装上传文件的类型
    private String docContentType;
    // 封装上传文件名
    private String docFileName;
    private String path;

    public File getDoc() {
        return doc;
    }

    public void setDoc(File doc) {
        this.doc = doc;
    }

    public String getDocContentType() {
        return docContentType;
    }

    public void setDocContentType(String docContentType) {
        this.docContentType = docContentType;
    }

    public String getDocFileName() {
        return docFileName;
    }

    public void setDocFileName(String docFileName) {
        this.docFileName = docFileName;
    }

    public void setPath(String value) {
        this.path = value;
    }

    @SuppressWarnings("deprecation")
    public String getPath() throws Exception {
        return ServletActionContext.getServletContext().getRealPath(path);
    }

    @Override
    public String execute() throws Exception {
       
        docFileName = getFileName(docFileName);
        FileOutputStream fos = new FileOutputStream(getPath() + "\\" + docFileName);
        FileInputStream fis = new FileInputStream(doc);
        byte[] b = new byte[1024];
        int length = 0;
        while ((length = fis.read(b)) > 0) {
            fos.write(b, 0, length);
        }
        
        //将头像路径写入数据库
        Student stu  = (Student)ActionContext.getContext().getSession().get("student");
        if (stu!=null) {
            Student temp = studentService.getStudentByStuNum(stu.getStuNum());
            temp.setPhotoPath(getDocFileName());
            studentService.modifyStudent(temp);
        }
        
        return SUCCESS;
    }
    
    public String boardImgUpload() throws Exception
    {
        docFileName = getFileName(docFileName);
        FileOutputStream fos = new FileOutputStream(getPath() + "\\" + docFileName);
        FileInputStream fis = new FileInputStream(doc);
        byte[] b = new byte[1024];
        int length = 0;
        while ((length = fis.read(b)) > 0) {
            fos.write(b, 0, length);
        }
        if (ServletActionContext.getRequest().getParameter("bid")!=null) {
             int bid = Integer.valueOf(ServletActionContext.getRequest().getParameter("bid"));
                Board board = boardService.loadBoard(bid);
                board.setBoardImg(getDocFileName());
                if (boardService.saveOrUpdateBoard(board)) {
                return SUCCESS;
            }
                 return  ERROR;
        }
        return ERROR;
    }

    private String getFileName(String fileName) {
        int position = fileName.lastIndexOf(".");
        String extension = fileName.substring(position);
        return System.currentTimeMillis() + extension;
    }
    
    //学生上传头像
   /* public String stuUpload() throws Exception
    {
        Student stu  = (Student)ActionContext.getContext().getSession().get("student");
        if (stu!=null) {
            Student temp = studentService.getStudentByStuNum(stu.getStuNum());
            temp.setPhotoPath(path);
        }
        return ERROR;
    }*/
}
