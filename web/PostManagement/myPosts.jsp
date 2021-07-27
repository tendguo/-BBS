<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s"  uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>我的帖子</title>
        <style type="text/css">
           table{ border-collapse: collapse; text-align: center; width: 98%; }
            th{ width: 150px;}
            tr,td{  border: 1px solid silver; }
            th,tr, td{ border-left: none; border-right: none; padding-bottom:5px;}
            th:hover,td:hover,tr:hover{ background-color: #F0F0F0;}
        </style>
    </head>
    <body>
        <h3 style="padding-left:20px;"><s:property value="#session.student.nickName" />您好，欢迎查看您发布过的帖子：</h3>
    <center>
       
         <!-- 帖子列表 -->
             <table>
                 <tr style="background-color:#E7EFEF;">
                     <th style="width:10px;"></th><th style="text-align:left;">帖子标题</th>
                     <th>作者</th>
                     <th>查看</th>
                     <th>发布时间</th>
                 </tr> 
                 <s:iterator value="myPosts" status="st" id="row">
                <tr>
                    <td><img src="<%=request.getContextPath() %>/images/folder_new.gif" style="display: inline-block; margin:4px 5px 0px 0px;" /></td>
                    <td style="text-align: left;" ><a href="post!viewDetail.action?pid=<s:property value="id" />"><s:property value="name" /></a></td>
                    <td><s:property value="#row.getStudent().getNickName()" /></td>
                    <td><s:property value="count" /></td>
                     <td>
                       <!-- <s:property value="publishTime" /> -->  
                         <s:date format="yyyy年MM月dd日 HH时MM分" name="publishTime" />
                     </td>
                </tr>
                </s:iterator>
            </table>     
     </center>    
    </body>
</html>
