<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>长春工业大学论坛</title>
        <script type="text/javascript" src="js/jquery-1.2.6.pack.js"></script>
        <style type="text/css">
            #Lboard{    }
            .subBoard{ min-height:100px;   }
            .btitle{ padding-left:10px; text-align:left; line-height:30px;  color: #1B72AF; border:1px solid #D6E8F4; background: url('<%=request.getContextPath()%>/images/h.png') repeat-x;}
            #Lboard ul li { float:left; width:250px; margin:5px; padding:5px; }
            #Lboard ul li a{ text-decoration:none;}
            #Lboard ul li a:hover{ text-decoration:underline;}
            #Lboard .bimg{ float:left;}
            #Lboard strong { margin-left:15px; height:24px; font-size:18px;}
            #Lboard p { padding-left:60px;}
            .clear{clear:both;}
            #rank{float:left;display:block; margin-left:30px; position:relative; bottom:45px; top:5px; }

            #rank li{ margin:7px;}
            /**/
            #banner {position:relative; float:left; width:378px; height:256px; margin-left:20px; margin-bottom:15px; border:1px solid #666; overflow:hidden;}
            #banner_list img {border:0px;}
            #banner_bg {position:absolute; bottom:0;background-color:#000;height:30px;filter: Alpha(Opacity=30);opacity:0.3;z-index:1000;cursor:pointer; width:478px; }
            #banner_info{position:absolute; bottom:0; left:5px;height:22px;color:#fff;z-index:1001;cursor:pointer}
            #banner_text {position:absolute;width:120px;z-index:1002; right:3px; bottom:3px;}
            #banner ul {position:absolute;list-style-type:none;filter: Alpha(Opacity=80);opacity:0.8; border:1px solid #fff;z-index:1002;
                        margin:0; padding:0; bottom:3px; right:5px;}
            #banner ul li { padding:0px 8px;  float:left;display:block;color:#FFF;border:#e5eaff 1px solid;background:#6f4f67;cursor:pointer}
            #banner ul li.on { background:#900}
            #banner_list a{position:absolute;} /*让四张图片都可以重叠在一起*/

        </style>

        <script type="text/javascript">
            var t = n = 0, count;
            $(document).ready(function(){	
                count=$("#banner_list a").length;
                $("#banner_list a:not(:first-child)").hide();
                $("#banner_info").html($("#banner_list a:first-child").find("img").attr('alt'));
                $("#banner_info").click(function(){window.open($("#banner_list a:first-child").attr('href'), "_blank")});
                $("#banner li").click(function() {
                    var i = $(this).text() - 1;//获取Li元素内的值，即1，2，3，4
                    n = i;
                    if (i >= count) return;
                    $("#banner_info").html($("#banner_list a").eq(i).find("img").attr('alt'));
                    $("#banner_info").unbind().click(function(){window.open($("#banner_list a").eq(i).attr('href'), "_blank")})
                    $("#banner_list a").filter(":visible").fadeOut(2000).parent().children().eq(i).fadeIn(2000);
                    document.getElementById("banner").style.background="";
                    $(this).toggleClass("on");
                    $(this).siblings().removeAttr("class");
                });
                t = setInterval("showAuto()", 3000);
                $("#banner").hover(function(){clearInterval(t)}, function(){t = setInterval("showAuto()", 3000);});
            })
	
            function showAuto()
            {
                n = n >=(count - 1) ? 0 : ++n;
                $("#banner li").eq(n).trigger('click');
            }
        </script>

    </head>
    <body>
        <s:set name="total" value="total" scope="application"></s:set>
        <s:set name="yestNum" value="yestNum" scope="application"></s:set>
        <s:set name="todayNum" value="todayNum" scope="application" ></s:set>
        <s:set name="student" value="student" scope="session" ></s:set>
            <div id="banner">	
                <div id="banner_bg"></div>  <!--标题背景-->
                <div id="banner_info"></div> <!--标题-->
                <ul>
                    <li class="on">1</li>
                    <li>2</li>
                    <li>3</li>
                    <li>4</li>
                </ul>
                <div id="banner_list">
                    <a href="#" target="_blank"><img src="images/imgs/10794203.jpg" title="郑州轻工业学院" alt="郑州轻工业学院" /></a>
                    <a href="#" target="_blank"><img src="images/imgs/p5.jpg" title="橡树小屋的blog" alt="橡树小屋的blog" /></a>
                    <a href="#" target="_blank"><img src="images/imgs/p3.jpg" title="橡树小屋的blog" alt="橡树小屋的blog" /></a>
                    <a href="#" target="_blank"><img src="images/imgs/p4.jpg" title="橡树小屋的blog" alt="橡树小屋的blog" /></a>
                </div>
            </div>

            <div id="rank">
                <h3 style="color:red;"> 帖子排行榜:</h3>

                <ul>
                <s:iterator value="hotPosts" id="row" status="st">
                    <li><a href="post!viewDetail.action?pid=<s:property value="id" />"><s:property value="#row.name" />&nbsp; &nbsp;</a>【点击量<s:property value="#row.count" />】</li>
                </s:iterator>
            </ul>
        </div>
        <div class="clear" ></div>
        <div id="Lboard">
            <s:iterator value="rootBoard" id="row">
                <div class="btitle"><s:property value="#row.name" /></div>
                <div class="subBoard">
                    <ul>  
                        <s:iterator value="#row.boards" id="sub">  
                            <li>
                                <a href="login!showAll.action?bid=<s:property value="#sub.id" /> ">
                                    <s:if test="#sub.boardImg!=null">
                                        <img width="60" height="60" src="<%=request.getContextPath()%>/upload/<s:property value="#sub.boardImg" />" class="bimg" ></img>
                                    </s:if>
                                    <s:else>
                                        <img width="60" height="60" src="<%=request.getContextPath()%>/images/bimg.gif" class="bimg" ></img>
                                    </s:else>
                                    <h4><s:property value="#sub.name" /></h4>
                                </a>
                            </li>
                        </s:iterator>
                    </ul> 
                </div> 
                <div class="clear" ></div>
            </s:iterator>

        </div> 
        <div class="btitle">友情链接</div>
        <div class="subBoard">
            <ul>
                <li><a href="http://www.ccut.edu.cn/">长春工业大学</a></li>
    
            </ul>

        </div>

    </body>
</html>
