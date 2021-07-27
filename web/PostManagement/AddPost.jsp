<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s"  uri="/struts-tags" %> %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>发表帖子</title>
        <script type="text/javascript" src="<%=request.getContextPath() %>/ckeditor_3.6.2/ckeditor/ckeditor.js"></script>      
    
    </head>
    <body>
    <center>
        <s:url id="addPost" action="post!addPost.action" >
            <s:param name="bid"><%=request.getParameter("bid") %></s:param>
        </s:url>
        <s:form action="%{addPost}">
        <table>
            <tr>
                <td><b>帖子标题：</b></td><td> <input type="text" name="post.name" size="50" /></td>
            </tr>
            <tr>
                <td valign="top"><b>帖子内容：</b></td><td> <textarea id="context" name="post.content" ></textarea>  </td>
            </tr>
            <tr>
                <td></td><td><input type="submit"  value="发表" /></td>
            </tr>
        </table>
        </s:form>
        <script type="text/javascript">
            //<![CDATA[
            // Replace the <textarea id="editor1"> with a CKEditor instance using default configuration.
            CKEDITOR.replace( 'context',
            {
            filebrowserImageUploadUrl  :'uploadImg.action',
            filebrowserImageBrowseUrl  :'showImage.jsp?type=image',
            toolbar :'Full',
            width:'700',
            filebrowserWindowWidth  : 700,
            filebrowserWindowHeight : 500
            });
            //]]>
        </script>  
       </center>
    </body>
</html>
