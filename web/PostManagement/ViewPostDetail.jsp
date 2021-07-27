<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>帖子</title>
        <script type="text/javascript" src="<%=request.getContextPath()%>/ckeditor_3.6.2/ckeditor/ckeditor.js"></script>  
        <script type="text/javascript">
            window.onload = function(){
            
                var replyBtn = document.getElementById("replyBtn");
                var replyDiv = document.getElementById("replyDiv");
                replyBtn.onclick =function(){
                 
                    if (replyDiv.style.display=="none") {
                        replyDiv.style.display="block";
                    }
                    else if (replyDiv.style.display=="block") {
                        replyDiv.style.display="none";
                    }
                }
             
            }
            
        </script>
        <style type="text/css">
            table{ border-collapse: collapse; width: 95%;}
            th, tr,td{ border: 1px solid silver; background-color: #E3F2E1;}
            th{ height: 32px;}
            #nav{ margin:10px 0 10px 30px; font-size: 15px; }
            .left_td{width:15%; text-align: left; padding-left:30px;  }
            .right_td{width:70%; text-align: left;  padding-left: 30px; vertical-align: text-top; background-color: white;}
            #replyDiv{display: block; margin-left: 50px;  }
            #myImg{ width: 128px; height:128px; }
            #pmain li{ margin: 8px ;}
            #fastReply{ margin-top: 30px;}
        </style>
    </head>
    <body>
        <div id="nav">
          当前位置：&nbsp;  <a href="index.action">首页 </a>&nbsp; >>&nbsp;&nbsp; <s:property value="%{post.board.name}" />&nbsp; >>&nbsp;  <s:property value="%{post.name}" /> 
        </div>
        <!-- 帖子主题 -->
    <center>
        <div id="pmain">
        <table>
            <th>作者</th><th>正文</th>
            <tr>
                <td class="left_td" valign="top">
                    <br/>
                    <s:if test="%{post.student.photoPath!=null}">
                        <img id="myImg" src="<%=request.getContextPath()%>/upload/<s:property value="%{post.student.photoPath}"  />" />
                    </s:if>
                    <s:else>
                        <img src="<%=request.getContextPath()%>/images/bbsPhoto.jpg" />
                    </s:else>
                    <br/>
                    <ul>
                    <s:if test="#session.student!=null">
                        <li>  <h5>
                            <b>昵称：<s:property value="%{post.getStudent().getNickName()}" /></b>
                        </h5>
                        </li>
                        
                        <li><h5>
                            <b>专业：<s:property value="%{post.getStudent().major}" /></b>
                        </h5>
                        </li>
                        <li>
                        <h5>
                            <b>班级：<s:property value="%{post.getStudent().className}" /></b>
                        </h5>
                        </li>
                    </s:if>
                    <s:elseif test="#session.admin!=null">
                        <li><h5>
                            管理员
                        </h5>
                            </li>
                        <li><h5>
                            <b>姓名：<s:property value="%{post.admin.name}" /></b>
                        </h5>
                        </li>
                    </s:elseif>
                        </ul>
                </td>
                <td class="right_td">
                    <h5>发帖时间： <s:date format="yyyy-MM-dd hh:mm:ss" name="%{post.publishTime}" /></h5>
                    <s:property value="%{post.content}" escape="false" />
                    <s:if test="#session.admin!=null">
                         <h5><a href="reply!prepareModify.action">修改</a></h5>
                         <h5><a href="#">删除</a></h5>
                    </s:if>
               </td>
            </tr>
            <!-- 回帖列表,循环tr，你懂得。。 -->  
            <s:iterator value="replies" id="row" status="st">
                <tr>
                    <td class="left_td" align="top" valign="top">
                        <br/>
                        <s:if test="#row.getStudent().photoPath!=null">
                            <img id="myImg" src="<%=request.getContextPath()%>/upload/<s:property value="#row.student.photoPath"  />" />
                        </s:if>
                        <s:else>
                            <img src="<%=request.getContextPath()%>/images/bbsPhoto.jpg" />
                        </s:else>
                        <br/>
                        <h5>
                            <b>昵称：<s:property value="#row.getStudent().nickName" /></b>
                        </h5>
                        <h5>
                            <b>专业：<s:property value="#row.getStudent().major" /></b>
                        </h5>
                        <h5>
                            <b>班级：<s:property value="#row.getStudent().className" /></b>
                        </h5>
                    </td>
                    <td class="right_td">
                        <h5>回复时间： <s:date format="yyyy-MM-dd hh:mm:ss" name="#row.getPublishTime()" /></h5>
                        <s:property value="#row.getContent()" escape="false"/>
                    </td>
                </tr>
            </s:iterator> 
        </table>
       <div id="fastReply">
            <s:form action="reply!stuReply.action?pid=%{post.id} ">
                <tr>
                    <td style="width:19.5%;"  valign="middle" align="center">
                        <s:if test="#session.admin==null">
                          <img id="myImg" src="<%=request.getContextPath()%>/upload/<s:property value="%{student.photoPath}"  />" />
                          </s:if>
                        <h2>回复：</h2></td><td> <textarea id="context" name="reply.content" ></textarea>  </td>
                </tr>
                <tr>
                    <td></td><td><input type="submit"   value="" style=" border: none; cursor: pointer; width: 74px; height: 31px; background: url('<%=request.getContextPath()%>/images/btn_reply.png') no-repeat;" /></td>
                </tr>
            </s:form>
            <script type="text/javascript">
                //<![CDATA[
                // Replace the <textarea id="editor1"> with a CKEditor instance using default configuration.
                CKEDITOR.replace( 'context',
                {
                    filebrowserImageUploadUrl  :'uploadImg.action',
                    filebrowserImageBrowseUrl  :'showImage.jsp?type=image',
                    toolbar :'Full',
                    width:'100%',
                    height:'50%',
                    filebrowserWindowWidth  : 700,
                    filebrowserWindowHeight : 500
                });
                //]]>
            </script>  
          </div>
    </center>
</div>


</body>
</html>
