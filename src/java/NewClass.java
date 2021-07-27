
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class NewClass {
    public static void main(String args[])
    {
       // Date d=new Date(System.currentTimeMillis()-1000*60*60*24);
         Date d=new Date(System.currentTimeMillis());
 SimpleDateFormat sp=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
String ZUOTIAN=sp.format(d);//获取昨天日期


System.out.println(ZUOTIAN);
    }
}
