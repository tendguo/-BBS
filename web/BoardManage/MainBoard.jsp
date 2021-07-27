<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>版块管理</title>
        <style type="text/css">
        #Lboard{ margin-left:24px; width:90%; border: 1px solid #A6CBE7;   }
        .subBoard{}
        .btitle{ padding-left:10px; text-align:left; line-height:30px;  color: #1B72AF; border:1px solid #D6E8F4; background: url('<%=request.getContextPath()%>/images/h.png') repeat-x;}
        #Lboard  ul li{  height:30px; margin:5px; display:block; width:250px;  height:60px;  float:left; padding:5px;}
        #Lboard ul li a{ text-decoration:none;}
        #Lboard ul li a:hover{ text-decoration:underline;}
        #Lboard .bimg{ float:left;}
        #Lboard strong { margin-left:15px; height:24px; font-size:18px;}
        #Lboard p { padding-left:60px;}
        .clear{clear:both;}
        </style>
    </head>
    <body>
        <s:debug/>
    <center><h2> <a href="<%=request.getContextPath() %>/board!prepareAddBoard.action">添加版块</a></h2>
</center>
      <div id="Lboard">
          
      <s:iterator value="rootBoards" id="row">
      <div class="btitle"><s:property value="#row.name" /></div>
        <div class="subBoard">
       <s:iterator value="#row.boards" id="sub">  
      <ul>   
          <li>
              <a href="login!showAll.action?bid=<s:property value="#sub.id" /> ">
                  <s:if test="#sub.boardImg!=null">
                  <img width="50" height="50" src="<%=request.getContextPath()%>/upload/<s:property value="#sub.boardImg" />" class="bimg" ></img>
                  </s:if>
                  <s:else>
                      <img width="50" height="50" src="<%=request.getContextPath()%>/images/bimg.gif" class="bimg" ></img>
                  </s:else>
              <strong><s:property value="#sub.name" /></strong> 
              <em> <a href="<%=request.getContextPath()%>/BoardManage/modifyBoardImg.jsp?bid=<s:property value="#sub.id" />">上传图标</a</em>
              </a>
          </li>
     </s:iterator>
     </ul> 
   </div> 
        <div class="clear" ></div>
      </s:iterator>
   
    </div> 
       
        <div style="clear:both;"></div>
    </body>
</html>
