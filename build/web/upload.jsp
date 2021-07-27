<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head>
        <title>Struts 2文件上传</title>
        <link rel="stylesheet" type="text/css" href="Style.css">
    </head>
    <body>
        <center>
            <h3>头像上传</h3>
            <hr/>
            <s:form action="myUpload" enctype="multipart/form-data">
                <s:file name="doc" label="选择上传文件"/>
                <s:submit value="上传"/>
            </s:form>
        </center>
    </body>
</html>
