<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>帖子管理</title>
        <script type="text/javascript">
            function confirmDel()
            {
                if (!confirm("您确认要删除吗？此删除为级联删除？删除操作不可恢复！")) {
                    return false;
                }
                return true;
            }
        </script>
    </head>
    <body>
        <center>
            <s:if test="#request.result=='Mok'">
                <h4 style="color:red;"><em>修改成功,您可以继续操作...</em></h4>
            </s:if>
            <s:elseif test="#request.result=='Dok' ">
                  <h4 style="color:red;"><em>删除成功,您可以继续操作...</em></h4>
            </s:elseif>
        <div>
            <!-- 帖子列表 -->
            <table style="width:98%;">
                <tr style="background-color:#E7EFEF;">
                    <th style="width:10px;"></th><th style="text-align:left;">帖子标题</th>
                    <th>作者</th>
                    <th>回复 / 点击</th>
                    <th>发布时间</th>
                    <th>可选操作</th>
                </tr> 
                <s:iterator value="list" status="st" id="row">
                    <tr>
                        <td><img src="<%=request.getContextPath()%>/images/folder_new.gif" style="display: inline-block; margin:4px 5px 0px 0px;" /></td>
                        <td style="text-align: left;" ><a href="post!viewDetail.action?pid=<s:property value="id" />"><s:property value="name" /></a></td>
                        <td><s:property value="#row.getStudent().getNickName()" /></td>
                        <td><s:property value="#row.getReplies().size()" /> / <s:property value="count" /></td>
                        
                        <td>
                            <!-- <s:property value="publishTime" /> -->  
                            <s:date format="yyyy-MM-dd hh:mm:ss" name="publishTime" />
                        </td>
                        <td>
                            <a href="post!prepareModify.action?pid=<s:property value="#row.id"/>">修改</a>
                            <a href="post!deletePost.action?pid=<s:property value="#row.id"/>" onclick="return confirmDel()">删除</a>
                        </td>
                    </tr>
                </s:iterator>
            </table>     
    </center>
    <!-- 生成分页 -->
    <div style="padding-left:30px; margin-top: 20px;">
        <img src="<%=request.getContextPath()%>/images/pn_post.png" style="cursor: pointer;" onclick="javascript:location.href='<%=request.getContextPath()%>/post!preparePost.action?bid=<s:property value="%{#request.bid}" /> ' " />
    </div>
    <center>
        <div id="displayPagination">    
            <script type="text/javascript">
                var pg = new showPages('pg');
                var total = <s:property value="count" />;
                var pageSize = <s:property value="pageSize" />
                if (total%pageSize==0) {
                    pg.pageCount= total/pageSiz;
                }
                pg.pageCount = total / pageSize + 1 ;  // 定义总页数(必要)
                //pg.argName = 'p';  // 定义参数名(可选,默认为page)
     
                pg.printHtml(2);
                pg.printHtml(5);
            </script>
        </div>
    </center>
    </body>
</html>
