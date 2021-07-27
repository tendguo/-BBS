<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib  prefix="s" uri="/struts-tags" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>修改版块信息</title>
    </head>
    <body>
    <center>
           <h1>修改版块信息</h1>
           <s:form>
               <s:textfield label="版块标题" value="board.name"></s:textfield>
               <s:textarea label="版块描述" value="board.description"></s:textarea>
               <select name="board.parentId">
                   <s:iterator value="rootBoards.name" id="row">
                   <option></option>
                   </s:iterator>
               </select>
               <s:submit value="提交"></s:submit>
           </s:form>
    </center>
    </body>
</html>
