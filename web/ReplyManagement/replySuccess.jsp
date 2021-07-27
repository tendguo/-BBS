<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s"  uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=GBK">
        <title>回复成功</title>
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
             <h3>回复成功！<span id="jumpTo" style="color:orange;">5</span>&nbsp;秒后自动跳转到论坛首页</h3> 
            <script type="text/javascript">countDown(5,'login!index.action');</script>  
            <h3><a href="<%=request.getContextPath() %>/post!viewDetail.action?pid=%{#request.pid}">[若没有自动跳转，请点击这里]</a> </h3>
        </div>
    </center>
    </body>
</html>
