package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_iterator_value_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_iterator_value_status_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_set_value_scope_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_property_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_else;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_iterator_value_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_iterator_value_status_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_set_value_scope_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_property_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_else = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_iterator_value_id.release();
    _jspx_tagPool_s_iterator_value_status_id.release();
    _jspx_tagPool_s_set_value_scope_name_nobody.release();
    _jspx_tagPool_s_property_value_nobody.release();
    _jspx_tagPool_s_if_test.release();
    _jspx_tagPool_s_else.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>长春工业大学论坛</title>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-1.2.6.pack.js\"></script>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            #Lboard{    }\n");
      out.write("            .subBoard{ min-height:100px;   }\n");
      out.write("            .btitle{ padding-left:10px; text-align:left; line-height:30px;  color: #1B72AF; border:1px solid #D6E8F4; background: url('");
      out.print(request.getContextPath());
      out.write("/images/h.png') repeat-x;}\n");
      out.write("            #Lboard ul li { float:left; width:250px; margin:5px; padding:5px; }\n");
      out.write("            #Lboard ul li a{ text-decoration:none;}\n");
      out.write("            #Lboard ul li a:hover{ text-decoration:underline;}\n");
      out.write("            #Lboard .bimg{ float:left;}\n");
      out.write("            #Lboard strong { margin-left:15px; height:24px; font-size:18px;}\n");
      out.write("            #Lboard p { padding-left:60px;}\n");
      out.write("            .clear{clear:both;}\n");
      out.write("            #rank{float:left;display:block; margin-left:30px; position:relative; bottom:45px; top:5px; }\n");
      out.write("\n");
      out.write("            #rank li{ margin:7px;}\n");
      out.write("            /**/\n");
      out.write("            #banner {position:relative; float:left; width:378px; height:256px; margin-left:20px; margin-bottom:15px; border:1px solid #666; overflow:hidden;}\n");
      out.write("            #banner_list img {border:0px;}\n");
      out.write("            #banner_bg {position:absolute; bottom:0;background-color:#000;height:30px;filter: Alpha(Opacity=30);opacity:0.3;z-index:1000;cursor:pointer; width:478px; }\n");
      out.write("            #banner_info{position:absolute; bottom:0; left:5px;height:22px;color:#fff;z-index:1001;cursor:pointer}\n");
      out.write("            #banner_text {position:absolute;width:120px;z-index:1002; right:3px; bottom:3px;}\n");
      out.write("            #banner ul {position:absolute;list-style-type:none;filter: Alpha(Opacity=80);opacity:0.8; border:1px solid #fff;z-index:1002;\n");
      out.write("                        margin:0; padding:0; bottom:3px; right:5px;}\n");
      out.write("            #banner ul li { padding:0px 8px;  float:left;display:block;color:#FFF;border:#e5eaff 1px solid;background:#6f4f67;cursor:pointer}\n");
      out.write("            #banner ul li.on { background:#900}\n");
      out.write("            #banner_list a{position:absolute;} /*让四张图片都可以重叠在一起*/\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            var t = n = 0, count;\n");
      out.write("            $(document).ready(function(){\t\n");
      out.write("                count=$(\"#banner_list a\").length;\n");
      out.write("                $(\"#banner_list a:not(:first-child)\").hide();\n");
      out.write("                $(\"#banner_info\").html($(\"#banner_list a:first-child\").find(\"img\").attr('alt'));\n");
      out.write("                $(\"#banner_info\").click(function(){window.open($(\"#banner_list a:first-child\").attr('href'), \"_blank\")});\n");
      out.write("                $(\"#banner li\").click(function() {\n");
      out.write("                    var i = $(this).text() - 1;//获取Li元素内的值，即1，2，3，4\n");
      out.write("                    n = i;\n");
      out.write("                    if (i >= count) return;\n");
      out.write("                    $(\"#banner_info\").html($(\"#banner_list a\").eq(i).find(\"img\").attr('alt'));\n");
      out.write("                    $(\"#banner_info\").unbind().click(function(){window.open($(\"#banner_list a\").eq(i).attr('href'), \"_blank\")})\n");
      out.write("                    $(\"#banner_list a\").filter(\":visible\").fadeOut(2000).parent().children().eq(i).fadeIn(2000);\n");
      out.write("                    document.getElementById(\"banner\").style.background=\"\";\n");
      out.write("                    $(this).toggleClass(\"on\");\n");
      out.write("                    $(this).siblings().removeAttr(\"class\");\n");
      out.write("                });\n");
      out.write("                t = setInterval(\"showAuto()\", 3000);\n");
      out.write("                $(\"#banner\").hover(function(){clearInterval(t)}, function(){t = setInterval(\"showAuto()\", 3000);});\n");
      out.write("            })\n");
      out.write("\t\n");
      out.write("            function showAuto()\n");
      out.write("            {\n");
      out.write("                n = n >=(count - 1) ? 0 : ++n;\n");
      out.write("                $(\"#banner li\").eq(n).trigger('click');\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      if (_jspx_meth_s_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_s_set_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_s_set_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_s_set_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            <div id=\"banner\">\t\n");
      out.write("                <div id=\"banner_bg\"></div>  <!--标题背景-->\n");
      out.write("                <div id=\"banner_info\"></div> <!--标题-->\n");
      out.write("                <ul>\n");
      out.write("                    <li class=\"on\">1</li>\n");
      out.write("                    <li>2</li>\n");
      out.write("                    <li>3</li>\n");
      out.write("                    <li>4</li>\n");
      out.write("                </ul>\n");
      out.write("                <div id=\"banner_list\">\n");
      out.write("                    <a href=\"#\" target=\"_blank\"><img src=\"images/imgs/10794203.jpg\" title=\"郑州轻工业学院\" alt=\"郑州轻工业学院\" /></a>\n");
      out.write("                    <a href=\"#\" target=\"_blank\"><img src=\"images/imgs/p5.jpg\" title=\"橡树小屋的blog\" alt=\"橡树小屋的blog\" /></a>\n");
      out.write("                    <a href=\"#\" target=\"_blank\"><img src=\"images/imgs/p3.jpg\" title=\"橡树小屋的blog\" alt=\"橡树小屋的blog\" /></a>\n");
      out.write("                    <a href=\"#\" target=\"_blank\"><img src=\"images/imgs/p4.jpg\" title=\"橡树小屋的blog\" alt=\"橡树小屋的blog\" /></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"rank\">\n");
      out.write("                <h3 style=\"color:red;\"> 帖子排行榜:</h3>\n");
      out.write("\n");
      out.write("                <ul>\n");
      out.write("                ");
      if (_jspx_meth_s_iterator_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"clear\" ></div>\n");
      out.write("        <div id=\"Lboard\">\n");
      out.write("            ");
      //  s:iterator
      org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_iterator_1 = (org.apache.struts2.views.jsp.IteratorTag) _jspx_tagPool_s_iterator_value_id.get(org.apache.struts2.views.jsp.IteratorTag.class);
      _jspx_th_s_iterator_1.setPageContext(_jspx_page_context);
      _jspx_th_s_iterator_1.setParent(null);
      _jspx_th_s_iterator_1.setValue("rootBoard");
      _jspx_th_s_iterator_1.setId("row");
      int _jspx_eval_s_iterator_1 = _jspx_th_s_iterator_1.doStartTag();
      if (_jspx_eval_s_iterator_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_s_iterator_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_s_iterator_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_s_iterator_1.doInitBody();
        }
        do {
          out.write("\n");
          out.write("                <div class=\"btitle\">");
          if (_jspx_meth_s_property_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_1, _jspx_page_context))
            return;
          out.write("</div>\n");
          out.write("                <div class=\"subBoard\">\n");
          out.write("                    <ul>  \n");
          out.write("                        ");
          //  s:iterator
          org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_iterator_2 = (org.apache.struts2.views.jsp.IteratorTag) _jspx_tagPool_s_iterator_value_id.get(org.apache.struts2.views.jsp.IteratorTag.class);
          _jspx_th_s_iterator_2.setPageContext(_jspx_page_context);
          _jspx_th_s_iterator_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_1);
          _jspx_th_s_iterator_2.setValue("#row.boards");
          _jspx_th_s_iterator_2.setId("sub");
          int _jspx_eval_s_iterator_2 = _jspx_th_s_iterator_2.doStartTag();
          if (_jspx_eval_s_iterator_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_s_iterator_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_s_iterator_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_s_iterator_2.doInitBody();
            }
            do {
              out.write("  \n");
              out.write("                            <li>\n");
              out.write("                                <a href=\"login!showAll.action?bid=");
              if (_jspx_meth_s_property_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_2, _jspx_page_context))
                return;
              out.write(" \">\n");
              out.write("                                    ");
              //  s:if
              org.apache.struts2.views.jsp.IfTag _jspx_th_s_if_0 = (org.apache.struts2.views.jsp.IfTag) _jspx_tagPool_s_if_test.get(org.apache.struts2.views.jsp.IfTag.class);
              _jspx_th_s_if_0.setPageContext(_jspx_page_context);
              _jspx_th_s_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_2);
              _jspx_th_s_if_0.setTest("#sub.boardImg!=null");
              int _jspx_eval_s_if_0 = _jspx_th_s_if_0.doStartTag();
              if (_jspx_eval_s_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_s_if_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_s_if_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_s_if_0.doInitBody();
                }
                do {
                  out.write("\n");
                  out.write("                                        <img width=\"60\" height=\"60\" src=\"");
                  out.print(request.getContextPath());
                  out.write("/upload/");
                  if (_jspx_meth_s_property_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_if_0, _jspx_page_context))
                    return;
                  out.write("\" class=\"bimg\" ></img>\n");
                  out.write("                                    ");
                  int evalDoAfterBody = _jspx_th_s_if_0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_s_if_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                  out = _jspx_page_context.popBody();
              }
              if (_jspx_th_s_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_0);
                return;
              }
              _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_0);
              out.write("\n");
              out.write("                                    ");
              //  s:else
              org.apache.struts2.views.jsp.ElseTag _jspx_th_s_else_0 = (org.apache.struts2.views.jsp.ElseTag) _jspx_tagPool_s_else.get(org.apache.struts2.views.jsp.ElseTag.class);
              _jspx_th_s_else_0.setPageContext(_jspx_page_context);
              _jspx_th_s_else_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_2);
              int _jspx_eval_s_else_0 = _jspx_th_s_else_0.doStartTag();
              if (_jspx_eval_s_else_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_s_else_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_s_else_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_s_else_0.doInitBody();
                }
                do {
                  out.write("\n");
                  out.write("                                        <img width=\"60\" height=\"60\" src=\"");
                  out.print(request.getContextPath());
                  out.write("/images/bimg.gif\" class=\"bimg\" ></img>\n");
                  out.write("                                    ");
                  int evalDoAfterBody = _jspx_th_s_else_0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_s_else_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                  out = _jspx_page_context.popBody();
              }
              if (_jspx_th_s_else_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_s_else.reuse(_jspx_th_s_else_0);
                return;
              }
              _jspx_tagPool_s_else.reuse(_jspx_th_s_else_0);
              out.write("\n");
              out.write("                                    <h4>");
              if (_jspx_meth_s_property_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_2, _jspx_page_context))
                return;
              out.write("</h4>\n");
              out.write("                                </a>\n");
              out.write("                            </li>\n");
              out.write("                        ");
              int evalDoAfterBody = _jspx_th_s_iterator_2.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_s_iterator_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_s_iterator_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_s_iterator_value_id.reuse(_jspx_th_s_iterator_2);
            return;
          }
          _jspx_tagPool_s_iterator_value_id.reuse(_jspx_th_s_iterator_2);
          out.write("\n");
          out.write("                    </ul> \n");
          out.write("                </div> \n");
          out.write("                <div class=\"clear\" ></div>\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_s_iterator_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_s_iterator_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_s_iterator_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_s_iterator_value_id.reuse(_jspx_th_s_iterator_1);
        return;
      }
      _jspx_tagPool_s_iterator_value_id.reuse(_jspx_th_s_iterator_1);
      out.write("\n");
      out.write("\n");
      out.write("        </div> \n");
      out.write("        <div class=\"btitle\">友情链接</div>\n");
      out.write("        <div class=\"subBoard\">\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"http://www.ccut.edu.cn/\">长春工业大学</a></li>\n");
      out.write("    \n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_s_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:set
    org.apache.struts2.views.jsp.SetTag _jspx_th_s_set_0 = (org.apache.struts2.views.jsp.SetTag) _jspx_tagPool_s_set_value_scope_name_nobody.get(org.apache.struts2.views.jsp.SetTag.class);
    _jspx_th_s_set_0.setPageContext(_jspx_page_context);
    _jspx_th_s_set_0.setParent(null);
    _jspx_th_s_set_0.setName("total");
    _jspx_th_s_set_0.setValue("total");
    _jspx_th_s_set_0.setScope("application");
    int _jspx_eval_s_set_0 = _jspx_th_s_set_0.doStartTag();
    if (_jspx_th_s_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_set_value_scope_name_nobody.reuse(_jspx_th_s_set_0);
      return true;
    }
    _jspx_tagPool_s_set_value_scope_name_nobody.reuse(_jspx_th_s_set_0);
    return false;
  }

  private boolean _jspx_meth_s_set_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:set
    org.apache.struts2.views.jsp.SetTag _jspx_th_s_set_1 = (org.apache.struts2.views.jsp.SetTag) _jspx_tagPool_s_set_value_scope_name_nobody.get(org.apache.struts2.views.jsp.SetTag.class);
    _jspx_th_s_set_1.setPageContext(_jspx_page_context);
    _jspx_th_s_set_1.setParent(null);
    _jspx_th_s_set_1.setName("yestNum");
    _jspx_th_s_set_1.setValue("yestNum");
    _jspx_th_s_set_1.setScope("application");
    int _jspx_eval_s_set_1 = _jspx_th_s_set_1.doStartTag();
    if (_jspx_th_s_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_set_value_scope_name_nobody.reuse(_jspx_th_s_set_1);
      return true;
    }
    _jspx_tagPool_s_set_value_scope_name_nobody.reuse(_jspx_th_s_set_1);
    return false;
  }

  private boolean _jspx_meth_s_set_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:set
    org.apache.struts2.views.jsp.SetTag _jspx_th_s_set_2 = (org.apache.struts2.views.jsp.SetTag) _jspx_tagPool_s_set_value_scope_name_nobody.get(org.apache.struts2.views.jsp.SetTag.class);
    _jspx_th_s_set_2.setPageContext(_jspx_page_context);
    _jspx_th_s_set_2.setParent(null);
    _jspx_th_s_set_2.setName("todayNum");
    _jspx_th_s_set_2.setValue("todayNum");
    _jspx_th_s_set_2.setScope("application");
    int _jspx_eval_s_set_2 = _jspx_th_s_set_2.doStartTag();
    if (_jspx_th_s_set_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_set_value_scope_name_nobody.reuse(_jspx_th_s_set_2);
      return true;
    }
    _jspx_tagPool_s_set_value_scope_name_nobody.reuse(_jspx_th_s_set_2);
    return false;
  }

  private boolean _jspx_meth_s_set_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:set
    org.apache.struts2.views.jsp.SetTag _jspx_th_s_set_3 = (org.apache.struts2.views.jsp.SetTag) _jspx_tagPool_s_set_value_scope_name_nobody.get(org.apache.struts2.views.jsp.SetTag.class);
    _jspx_th_s_set_3.setPageContext(_jspx_page_context);
    _jspx_th_s_set_3.setParent(null);
    _jspx_th_s_set_3.setName("student");
    _jspx_th_s_set_3.setValue("student");
    _jspx_th_s_set_3.setScope("session");
    int _jspx_eval_s_set_3 = _jspx_th_s_set_3.doStartTag();
    if (_jspx_th_s_set_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_set_value_scope_name_nobody.reuse(_jspx_th_s_set_3);
      return true;
    }
    _jspx_tagPool_s_set_value_scope_name_nobody.reuse(_jspx_th_s_set_3);
    return false;
  }

  private boolean _jspx_meth_s_iterator_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_iterator_0 = (org.apache.struts2.views.jsp.IteratorTag) _jspx_tagPool_s_iterator_value_status_id.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_iterator_0.setPageContext(_jspx_page_context);
    _jspx_th_s_iterator_0.setParent(null);
    _jspx_th_s_iterator_0.setValue("hotPosts");
    _jspx_th_s_iterator_0.setId("row");
    _jspx_th_s_iterator_0.setStatus("st");
    int _jspx_eval_s_iterator_0 = _jspx_th_s_iterator_0.doStartTag();
    if (_jspx_eval_s_iterator_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_iterator_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_iterator_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_iterator_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                    <li><a href=\"post!viewDetail.action?pid=");
        if (_jspx_meth_s_property_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write('"');
        out.write('>');
        if (_jspx_meth_s_property_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("&nbsp; &nbsp;</a>【点击量");
        if (_jspx_meth_s_property_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("】</li>\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_s_iterator_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_iterator_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_iterator_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_iterator_value_status_id.reuse(_jspx_th_s_iterator_0);
      return true;
    }
    _jspx_tagPool_s_iterator_value_status_id.reuse(_jspx_th_s_iterator_0);
    return false;
  }

  private boolean _jspx_meth_s_property_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_0 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_0.setPageContext(_jspx_page_context);
    _jspx_th_s_property_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_property_0.setValue("id");
    int _jspx_eval_s_property_0 = _jspx_th_s_property_0.doStartTag();
    if (_jspx_th_s_property_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_0);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_0);
    return false;
  }

  private boolean _jspx_meth_s_property_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_1 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_1.setPageContext(_jspx_page_context);
    _jspx_th_s_property_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_property_1.setValue("#row.name");
    int _jspx_eval_s_property_1 = _jspx_th_s_property_1.doStartTag();
    if (_jspx_th_s_property_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_1);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_1);
    return false;
  }

  private boolean _jspx_meth_s_property_2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_2 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_2.setPageContext(_jspx_page_context);
    _jspx_th_s_property_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_property_2.setValue("#row.count");
    int _jspx_eval_s_property_2 = _jspx_th_s_property_2.doStartTag();
    if (_jspx_th_s_property_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_2);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_2);
    return false;
  }

  private boolean _jspx_meth_s_property_3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_3 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_3.setPageContext(_jspx_page_context);
    _jspx_th_s_property_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_1);
    _jspx_th_s_property_3.setValue("#row.name");
    int _jspx_eval_s_property_3 = _jspx_th_s_property_3.doStartTag();
    if (_jspx_th_s_property_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_3);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_3);
    return false;
  }

  private boolean _jspx_meth_s_property_4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_4 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_4.setPageContext(_jspx_page_context);
    _jspx_th_s_property_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_2);
    _jspx_th_s_property_4.setValue("#sub.id");
    int _jspx_eval_s_property_4 = _jspx_th_s_property_4.doStartTag();
    if (_jspx_th_s_property_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_4);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_4);
    return false;
  }

  private boolean _jspx_meth_s_property_5(javax.servlet.jsp.tagext.JspTag _jspx_th_s_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_5 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_5.setPageContext(_jspx_page_context);
    _jspx_th_s_property_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_if_0);
    _jspx_th_s_property_5.setValue("#sub.boardImg");
    int _jspx_eval_s_property_5 = _jspx_th_s_property_5.doStartTag();
    if (_jspx_th_s_property_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_5);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_5);
    return false;
  }

  private boolean _jspx_meth_s_property_6(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_6 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_6.setPageContext(_jspx_page_context);
    _jspx_th_s_property_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_2);
    _jspx_th_s_property_6.setValue("#sub.name");
    int _jspx_eval_s_property_6 = _jspx_th_s_property_6.doStartTag();
    if (_jspx_th_s_property_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_6);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_6);
    return false;
  }
}
