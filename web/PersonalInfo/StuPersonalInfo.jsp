<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>个人信息</title>
        <style type="text/css"> 
            table{ border-collapse: collapse;}
            th,td{ height: 29px; }
            #profile_act{ margin-left:5%;}
            #profile_act > li { height: 20px;}
            #profile_act > li > a { padding-left: 20px; }
            #silder{float:left;}
            #info{float: left; margin-left: 5%; width: 200px;}
            #modifyInfo{ float: left; padding-left: 3%; }
        </style>
        <script type="text/javascript">
           function checkStu()
           {
               if (document.getElementById("nick").value=="") {
                   document.getElementById("msg").innerHTML="昵称不能为空！";
                    return false;
                }
                else{return true;}
                
           }
        </script>
    </head>
    <body>
        <div style="margin-left:2%;">
            <div id="silder">
                <s:if test="student.photoPath!=null">
                <p>
                    <img style="width:200px; height:200px; " src="<%=request.getContextPath()%>/upload/<s:property value="student.photoPath" />" />
                </p>
                </s:if>
                <s:else>
                 <p>
                    <img style="width:200px; height:200px; " src="<%=request.getContextPath()%>/images/bbsPhoto.jpg" />
                </p>
                </s:else>
                <br/>
                <ul id="profile_act">
                    <li><a href="#" style=" background: url('<%=request.getContextPath()%>/images/pmto.gif') no-repeat; " >发短消息</a></li>
                    <li><a href="#" style=" background: url('<%=request.getContextPath()%>/images/addbuddy.gif') no-repeat; " >加为好友</a></li>
                    <li><a href="#" style=" background: url('<%=request.getContextPath()%>/images/fastreply.gif') no-repeat; ">搜索帖子</a></li>
                    <li><a href="# " style=" background: url('<%=request.getContextPath()%>/images/home.gif') no-repeat ; ">个人空间</a></li>
                </ul>
            </div>
            <div id="info">
                <table>
                    <tr>
                        <th>昵称:</th>
                        <td><s:property value="student.nickName" /></td>
                    </tr>
                    <tr>
                        <th>姓名：</th>
                        <td><s:property value="student.realName" /></td>
                    </tr>
                    <tr>
                        <th>学号：</th>
                        <td>
                            <s:property value="student.stuNum" /> 
                        </td>
                    </tr>
                    <tr>
                        <th>QQ：</th>
                        <td style="word-break:all"><s:property value="student.qq" /> </td>
                    </tr>
                    <tr>
                        <th>邮箱：</th>
                        <td style="word-break:all"><s:property value="student.email" /></td>
                    </tr>
                    <tr>
                        <th>班级：</th>
                        <td style="word-break:all"><s:property value="student.className" /></td>
                    </tr>
                    <tr>
                        <th>专业：</th>
                        <td style="word-break:all"><s:property value="student.major" /></td>
                    </tr>
                </table>
            </div>
            
            <div id="modifyInfo">
               信息修改
               <s:form action="student!modifyStuInfo.action" onsubmit="return checkStu()" >
                 <!-- 姓名： <s:property value="%{student.realName}" /> <br/>
                    学号：<s:property value="%{student.stuNum}" /><br/>
                    专业：<s:property value="%{student.major}" /><br/>
                    班级：<s:property value="%{student.className}" /><br/>
                 -->
                    <s:textfield id="nick" name="student.nickName" value="%{student.nickName}" label="昵称" required="true"></s:textfield><br/>
                    <s:textfield  name="student.qq" value="%{student.qq}" label="QQ"></s:textfield><br/>
                    <s:textfield  name="student.email" value="%{student.email}" label="邮箱"></s:textfield><br/>
                    <em id="msg" style="color:red;"></em>
                    <s:submit value="提交" onsubmit="return checkModify()" />
                    </s:form>
            </div>
                    <h3><a href="<%=request.getContextPath()%>/upload.jsp">上传头像</a></h3>
           </div>
                <div style="clear: both;"></div>
            </body>
        </html>
