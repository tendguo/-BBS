<%@page import="com.orm.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style type="text/css">
            ul { list-style-type: none;}
            #po{}
            .img1{
                width: 350px;
                height: 120px;
            }
            .logo1{
                background-color: #a82923;
            }
            
            
        </style>

    </head>
    <body>
        <div id="wrap">
            <div id="Top"> 
                <div id="logo">
                    <div id="logo1">
                        <img src="<%=request.getContextPath()%>/images/ccut.png" alt="长春工业大学" class="img1"  border="0"  />
                    <!--<label style="font-size:30px; font-weight: bold;">郑州轻工业学院论坛</label>-->
                    </div>
<!--                    <div id="logRegist">
                        <s:if test="#session.student!=null">
                            <span id="po"><img style=" float: right;width:50px; height:50px;" src="<%=request.getContextPath()%>/upload/<s:property value="#session.student.photoPath" />" /></span>
                            <h4><a href="student!personalStuInfo.action"><s:property value="#session.student.nickName" /> </a>欢迎你！</h4>
                        </s:if> 
                        <s:else>    
                            <span id="po"><img style="float: right;width:50px; height:50px;" src="<%=request.getContextPath()%>/images/guanli.jpg" /></span>
                            <h4><a href="student!personalStuInfo.action"><s:property value="#session.student.nickName" /> </a></h4>
                        </s:else>  

                        <%if (request.getSession().getAttribute("admin") != null) {%>
                        <h4><a href="#">管理员</a>，欢迎您！</h4>
                        <%}
                            if (request.getSession().getAttribute("student") == null && request.getSession().getAttribute("admin") == null) {%>
                        <h4 style="color:#fff">您 好,请<a href="<%=request.getContextPath()%>/login.jsp" style="color:blue;">登 录</a></h4>
                        <%}
                        %>
                    </div>-->

                </div>
            </div>
            <div id="s_head">
                <div id="menu">
                    <ul id="menu_left">
                        <li id="m_01"><a id="a_01" href="<%=request.getContextPath()%>/index.action">首&nbsp;页</a></li>
                        <li class="menu_ge"></li>
                        <li id="m_03"><a href="post!viewPostsByUser.action">我的帖子</a></li>
                        <s:if test="#session.student!=null">
                            <li class="menu_ge"></li>
                        <li id="m_04"><a href="student!personalStuInfo.action">个人资料</a></li>
                        <li class="menu_ge"></li>
                         <li id="m_07"><a href="<%=request.getContextPath()%>/PersonalInfo/StuPswModify.jsp">修改密码</a></li>
                        </s:if>
                        <s:elseif test="#session.admin!=null">
                            <li class="menu_ge"></li>
                        <li id="m_04"><a href="admin!personalAdminInfo.action">个人资料</a></li>
                        </s:elseif>   
                        <li class="menu_ge"></li>
                        <%if (request.getSession().getAttribute("admin") != null) {%> 
                        <li id="m_07"><a href="post">帖子管理</a></li>
                        <li class="menu_ge"></li>
                        <li id="m_07"><a href="board!loadRootBoards.action">版块管理</a></li>
                          <li class="menu_ge"></li>
                          <li id="m_07"><a href="#">系统维护</a></li>
                          <li class="menu_ge"></li>
                        <%}%>
                      
                        <li id="m_08"><a href="login!exit.action">退出</a></li>
                    </ul>
                        <!--可能会有问题-->
                    <div id="logRegist">
                        <s:if test="#session.student!=null">
                            <span id="po"><img style=" float: right;width:50px; height:50px;" src="<%=request.getContextPath()%>/upload/<s:property value="#session.student.photoPath" />" /></span>
                            <h4><a href="student!personalStuInfo.action"><s:property value="#session.student.nickName" /> </a>欢迎你！</h4>
                        </s:if> 
                        <s:else>    
<!--                            <span id="po"><img style="float: right;width:50px; height:50px;" src="<%=request.getContextPath()%>/images/guanli.jpg" /></span>-->
                            <h4><a href="student!personalStuInfo.action"><s:property value="#session.student.nickName" /> </a></h4>
                        </s:else>  

                        <%if (request.getSession().getAttribute("admin") != null) {%>
                        <h4><a href="#">管理员</a>，欢迎您！</h4>
                        <%}
                            if (request.getSession().getAttribute("student") == null && request.getSession().getAttribute("admin") == null) {%>
                        <h4 style="color:#fff">您 好,请<a href="<%=request.getContextPath()%>/login.jsp" style="color:blue;">登 录</a></h4>
                        <%}
                        %>
                    </div>
                </div>
            </div>
        </div>

    </body>
</html>
