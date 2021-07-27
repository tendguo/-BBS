<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>修改成功</title>
            <script type="text/javascript">     
            function countDown(secs,surl){     
                //alert(surl);     
                var jumpTo = document.getElementById('jumpTo');
                jumpTo.innerHTML=secs;  
                if(--secs>0){     
                    setTimeout("countDown("+secs+",'"+surl+"')",1000);     
                }     
                else{       
                    location.href=surl;     
                }     
            }     
        </script> 
    </head>
    <body>
      <center>
        <div style="margin-top:5%;">
            <div id="title" style="border-bottom:1px solid #C8DCEC; width: 50%;text-align: left; "><h3>论坛提示：</h3></div>
            <span style="position:relative; left: -180px; top:40px;"><img src="<%=request.getContextPath()%>/images/right_big.gif" /></span> 
             <h3>修改成功！<span id="jumpTo" style="color:orange;">5</span>&nbsp;秒后自动跳转</h3> 
            <script type="text/javascript">countDown(5,'<%=request.getContextPath()%>/student!personalStuInfo.action');</script>  
            <h3><a href="<%=request.getContextPath()%>/student!personalStuInfo.action">[若没有自动跳转，请点击这里]</a> </h3>
        </div>
    </center>
        
        
    </body>
</html>
