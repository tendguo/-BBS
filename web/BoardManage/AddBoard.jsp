<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>添加版块</title>
        <style type="text/css">
            li{ margin: 10px;}
        </style>
    </head>
    <body>
    <center>
           <h1>添加版块</h1>
        <s:form action="board!addBoard.action">
            <ul>
           <li>上级版块:<select name="board.id">
            <option value="-1">无上级版块</option>
            <s:iterator value="boardList" id="row">
                <option value="<s:property value="#row.id" />"><s:property value="#row.name" /></option>
            </s:iterator>
        </select></li> 
        <li>版块名称:<input type="text" name="board.name"></input></li>
         <li>版块描述：<textarea type="text" name="board.description"></textarea></li>
         <li><s:submit value="确定" ></s:submit></li>
            </ul>
        </s:form>
    </center>   
    </body>
</html>
