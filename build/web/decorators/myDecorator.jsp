<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@ taglib prefix="page" uri="http://www.opensymphony.com/sitemesh/page" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    
	<title><decorator:title default="装饰器页面"/></title>
	<decorator:head/>
	<link rel="stylesheet" type="text/css" href="../Style.css">
        <style type="text/css">
            *{ margin: 0; padding: 0; font-size: 13px;}
            #outer{ width: 980px; margin: 0 auto;  margin-left: 15%\9; }
            #main{ border: 1px solid #A6CBE7; border-top: none; min-height: 500px; height: auto; overflow:visible; padding-top: 15px; }
            #searchBar{height:50px; margin-top: 5px; border:1px solid #D0E3F4; border-top:none; background-color: #F4F9FF;  }
            #searchKey{ border:1px solid sliver; height:25px; line-height:30px; width:200px;}
            #searchBar ul{ float: left; margin-top: 15px; margin-left: 5%;}
            #searchBar ul li{float: left; width: 310px;}
        </style>
          <script type="text/javascript">
            function checkForm()
            {
                if (document.getElementById("searchKey").value=="") {
                    return false;
                }
                else{return true;}
            }
        </script>
</head>
  
<body>
   
    <div id="outer">
    <%@ include file="../top.jsp" %>
    <div id="searchBar"  >
        <form action="post!searchPost.action" id="searchForm" style="float:left;" >
                <span> 
                    <img style="position:relative; top:10px;" src="<%=request.getContextPath()%>/images/search_1.png" />  <input id="searchKey" type="text" name="post.name"  placeholder="搜索其实很简单" ></input><input type="submit" value="搜索" style=" border: none; background: url(images/search_btn.png) no-repeat; width: 45px; text-align: left; text-indent: 10px;  height: 25px; margin-left: 15px; line-height: 30px; position: relative; top:0px; cursor: pointer; "  onclick="return checkForm()" ></input>
                </span>
            </form>
        <!--<s:property value="@com.tools.StaticNumber@give()" />a-->
       
        <ul>
            <li>昨日帖子： <%=application.getAttribute("yestNum")%>  今日帖子： <%=application.getAttribute("todayNum")%> &nbsp; 共：<s:property value="#application.total" />&nbsp;&nbsp;&nbsp;&nbsp; </li>
            <li id="time"></li>
             <script>
                function show() 
                { 
                    now=new Date(); 
                    year=now.getFullYear(); 
                    month=now.getMonth()+1; 
                    date=now.getDate(); 
                    hours=now.getHours(); 
                    minutes=now.getMinutes(); 
                    seconds=now.getSeconds(); 
                    if(minutes<=9) 
                        minutes="0"+minutes 
                    if(seconds<=9) 
                        seconds="0"+seconds
                    time.innerHTML=year+"年"+month+"月"+date+"日"+"  现在时间："+hours+":"+minutes+":"+seconds;

                    setTimeout("show()",1000); 
                }
                show();
            </script> 
        </ul>
        </div>
    <div id="main"  >
        <decorator:body/>
    </div>
    <hr />
    <div>
        <center>
        <%@ include file="../bottom.html" %>
        </center>
    </div>
</div>
</body>
</html>
