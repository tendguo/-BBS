<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>长春工业大学论坛</title>
        <script type="text/javascript">
            window.onload=function(){
                var tabS = document.getElementById("tabL");
                var tabA = document.getElementById("tabA");
                var stuL = document.getElementById("stuLoginF");
                var adminL = document.getElementById("adminLoginF");          
                
                tabS.onclick = function(){
                    if (adminL.style.display =="block") {
                        adminL.style.display ="none"
                    } 
                 if (tabA.style.backgroundColor!="") {
                tabA.style.backgroundColor="";
                }
                    tabS.style.backgroundColor="#2FB4D6";
                    stuL.style.display="block";
                }
                
                
                tabA.onclick = function(){
                    if (stuL.style.display=="block") {
                    stuL.style.display="none";
                }   
                if ( tabS.style.backgroundColor!="") {
                  tabS.style.backgroundColor="";
                 }       
                    tabA.style.backgroundColor  ="#2FB4D6";
                    adminL.style.display ="block";
                }
            }
           
        </script>
        <style type="text/css">
            #tabs{ height: 20px; width: 300px; margin: 0 auto; }
            #tabContent{ width: 400px; height: 200px;  border: 1px solid #CACACA;   margin-top: 10px;  border-radius:15px 15px 0px 0px; box-shadow:15px 2px 4px #000;   }
            ul{ float: left; list-style-type: none;  line-height: 25px; }
            li{ width: 120px; height: 30px; text-align: center; float: left; display: block;  cursor: pointer;  }
            #tabs{position:relative; left:-30px;}
            #tabs li { display:block;  border-radius:5px 35px 0px 0px;  }
            li:hover{  }
            .loginBtn{ border: none; width: 128px; height: 40px; background-color: #a82923;color: #fff;font-size: 14px;border-radius: 5px;}
            .loginBtn:hover{cursor: pointer;}
            .outerBorder{ width: 200px; height:25px; background-color: #F1FAFF; border: #C1C1C1 1px solid; }
            .tdLabel{ font-family:宋体; font-size: 14px;}
             td { padding-top: 15; }
             #login{margin-left:-30px;}
             b {
                 color: #FFF;
             }
        </style>
    </head>
    <body>
         
    <center>
       <h3>Sorry,您还未登录，请登录:</h3>
        <div id="tabs">
          <ul>
              <li id="tabL" style=" background-color:#a82923;" margin-right: 5px;" ><b>学生登录</b></li>
              <li id="tabA"><b>管理员登录</b></li>
           </ul>
        </div> 
       <div id="tabContent">
        <div id="stuLoginF" style="display: block;" >
            <s:form action="login">
                <s:textfield name="student.stuNum" label="学号" cssClass="outerBorder"></s:textfield>
                <s:password name="student.password" label="密码" cssClass="outerBorder"></s:password>
                <s:submit value="登录"  cssClass="loginBtn"></s:submit>
            </s:form>
            <s:actionmessage/>
        </div>
           <div id="adminLoginF" style="display: none;" >
              
            <s:form action="login!adminLogin.action">
                <s:textfield name="admin.account" label="账号" cssClass="outerBorder" ></s:textfield>
                <s:password name="admin.password" label="密码" cssClass="outerBorder"></s:password>
                <s:submit value="登录" cssClass="loginBtn" ></s:submit>
            </s:form>
           <s:actionmessage/>
        </div>
       </div>
   </center>
    </body>
</html>
