<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head>

        <title>文件上传成功</title>
        <link rel="stylesheet" type="text/css" href="Style.css">

    </head>

    <body>
        <center>
          
            <h3>文件上传成功</h3>
            <hr/>
            <img src="<%=request.getContextPath()%>/upload/<s:property value="docFileName"/>"/>
            <br/>
            <s:property value="docFileName"/>
        </center>
    </body>
</html>
