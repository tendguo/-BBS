<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s"  uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>上传版块图标</title>
    </head>
    <body>
    <center>
        <h2>版块图标上传</h2>
        <s:url id="b" action="myUpload!boardImgUpload.action">
            <s:param name="bid"><%=request.getParameter("bid")%> </s:param>
        </s:url>
       <s:form action="%{b}" enctype="multipart/form-data">
                <s:file name="doc" label="选择上传文件"/>
                <s:submit value="上传"/>
            </s:form>
      </center>  
    </body>
</html>
