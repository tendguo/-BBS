<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>个人信息完善</title>
    </head>
    <body>
    <center>
        <div style="margin-top:5%;">
            <div id="title" style="border-bottom:1px solid #C8DCEC; width: 50%;text-align: left; "><h3>论坛提示：</h3></div>
            <span style="position:relative; left: -180px; top:40px;"><img src="<%=request.getContextPath()%>/images/error_big.gif" /></span> 
            <h3>您还没有完善您的个人信息！</h3> 
            <h2>将无法在论坛内发帖</h2>
            您可以<a href="<%=request.getContextPath()%>/student!personalStuInfo.action">现在就去完善</a> .
        </div>
    </center>
</body>
</html>
