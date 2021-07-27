<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <script type="text/javascript" src="<%=request.getContextPath() %>/ckeditor_3.6.2/ckeditor/ckeditor.js"></script>      
    </head>
    <body>
       <center>
        <s:url id="modifyReply" action="reply!modifyReply.action" >
            <s:param name="rid"><%=request.getParameter("bid") %></s:param>
        </s:url>
        <s:form action="%{modifyReply}">
        <table>
            <tr>
                <td valign="top"><b>帖子内容：</b></td><td> <textarea id="context" name="reply.content" ></textarea>  </td>
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
