<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>搜索结果</title>
        <style type="text/css">
              table{ border-collapse: collapse; text-align: center; width: 98%; }
            th{ width: 150px;}
            tr,td{  border: 1px solid silver; line-height:20px; }
            th,tr, td{ border-left: none; border-right: none; padding-bottom:5px;}
            th:hover,td:hover,tr:hover{ background-color: #F0F0F0;}
        </style>
    </head>
    <body>
        <s:debug/>
        <s:property value="post.name"/>
        <h1>Hello World!</h1>
         <table>
                <tr style="background-color:#E7EFEF;">
                   <th style="text-align:left;">帖子标题</th>
                    <th>作者</th>
                    <th>回复 / 点击</th>
                    <th>发布时间</th>
                </tr> 
                <s:iterator value="list" status="st" id="row">
                    <tr>
                        <td style="text-align: left;" ><img src="<%=request.getContextPath()%>/images/folder_new.gif" style="display: inline-block; margin:4px 5px 0px 0px;" /><a href="post!viewDetail.action?pid=<s:property value="id" />"><s:property value="name" /></a></td>
                        <td><s:property value="#row.getStudent().getNickName()" /></td>
                        <td><s:property value="#row.getReplies().size()" /> / <s:property value="count" /></td>
                        
                        <td>
                            <!-- <s:property value="publishTime" /> -->  
                            <s:date format="yyyy-MM-dd hh:mm:ss" name="publishTime" />
                        </td>
                    </tr>
                </s:iterator>
            </table>     
    </center>
    </body>
</html>
