package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.orm.Student;

public final class top_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_elseif_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_property_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_else;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_elseif_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_property_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_else = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_elseif_test.release();
    _jspx_tagPool_s_if_test.release();
    _jspx_tagPool_s_property_value_nobody.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            ul { list-style-type: none;}\n");
      out.write("            #po{}\n");
      out.write("            .img1{\n");
      out.write("                width: 350px;\n");
      out.write("                height: 120px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"wrap\">\n");
      out.write("            <div id=\"Top\"> \n");
      out.write("                <div id=\"logo\">\n");
      out.write("                    <img src=\"");
      out.print(request.getContextPath());
      out.write("/images/ccut.jpg\" alt=\"长春工业大学\" class=\"img1\"  border=\"0\"  />\n");
      out.write("                    <!--<label style=\"font-size:30px; font-weight: bold;\">郑州轻工业学院论坛</label>-->\n");
      out.write("                    <div id=\"logRegist\">\n");
      out.write("                        ");
      //  s:if
      org.apache.struts2.views.jsp.IfTag _jspx_th_s_if_0 = (org.apache.struts2.views.jsp.IfTag) _jspx_tagPool_s_if_test.get(org.apache.struts2.views.jsp.IfTag.class);
      _jspx_th_s_if_0.setPageContext(_jspx_page_context);
      _jspx_th_s_if_0.setParent(null);
      _jspx_th_s_if_0.setTest("#session.student!=null");
      int _jspx_eval_s_if_0 = _jspx_th_s_if_0.doStartTag();
      if (_jspx_eval_s_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_s_if_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_s_if_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_s_if_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("                            <span id=\"po\"><img style=\" float: right;width:50px; height:50px;\" src=\"");
          out.print(request.getContextPath());
          out.write("/upload/");
          if (_jspx_meth_s_property_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_if_0, _jspx_page_context))
            return;
          out.write("\" /></span>\n");
          out.write("                            <h4><a href=\"student!personalStuInfo.action\">");
          if (_jspx_meth_s_property_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_if_0, _jspx_page_context))
            return;
          out.write(" </a>欢迎你！</h4>\n");
          out.write("                        ");
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
      out.write(" \n");
      out.write("                        ");
      //  s:else
      org.apache.struts2.views.jsp.ElseTag _jspx_th_s_else_0 = (org.apache.struts2.views.jsp.ElseTag) _jspx_tagPool_s_else.get(org.apache.struts2.views.jsp.ElseTag.class);
      _jspx_th_s_else_0.setPageContext(_jspx_page_context);
      _jspx_th_s_else_0.setParent(null);
      int _jspx_eval_s_else_0 = _jspx_th_s_else_0.doStartTag();
      if (_jspx_eval_s_else_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_s_else_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_s_else_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_s_else_0.doInitBody();
        }
        do {
          out.write("    \n");
          out.write("                            <span id=\"po\"><img style=\"float: right;width:50px; height:50px;\" src=\"");
          out.print(request.getContextPath());
          out.write("/images/guanli.jpg\" /></span>\n");
          out.write("                            <h4><a href=\"student!personalStuInfo.action\">");
          if (_jspx_meth_s_property_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_else_0, _jspx_page_context))
            return;
          out.write(" </a></h4>\n");
          out.write("                        ");
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
      out.write("  \n");
      out.write("\n");
      out.write("                        ");
if (request.getSession().getAttribute("admin") != null) {
      out.write("\n");
      out.write("                        <h4><a href=\"#\">管理员</a>，欢迎您！</h4>\n");
      out.write("                        ");
}
                            if (request.getSession().getAttribute("student") == null && request.getSession().getAttribute("admin") == null) {
      out.write("\n");
      out.write("                        <h4>您 好,请<a href=\"");
      out.print(request.getContextPath());
      out.write("/login.jsp\" style=\"color:orange;\">登 录</a></h4>\n");
      out.write("                        ");
}
                        
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"s_head\">\n");
      out.write("                <div id=\"menu\">\n");
      out.write("                    <ul id=\"menu_left\">\n");
      out.write("                        <li id=\"m_01\"><a id=\"a_01\" href=\"");
      out.print(request.getContextPath());
      out.write("/index.action\">首&nbsp;页</a></li>\n");
      out.write("                        <li class=\"menu_ge\"></li>\n");
      out.write("                        <li id=\"m_03\"><a href=\"post!viewPostsByUser.action\">我的帖子</a></li>\n");
      out.write("                        ");
      //  s:if
      org.apache.struts2.views.jsp.IfTag _jspx_th_s_if_1 = (org.apache.struts2.views.jsp.IfTag) _jspx_tagPool_s_if_test.get(org.apache.struts2.views.jsp.IfTag.class);
      _jspx_th_s_if_1.setPageContext(_jspx_page_context);
      _jspx_th_s_if_1.setParent(null);
      _jspx_th_s_if_1.setTest("#session.student!=null");
      int _jspx_eval_s_if_1 = _jspx_th_s_if_1.doStartTag();
      if (_jspx_eval_s_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_s_if_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_s_if_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_s_if_1.doInitBody();
        }
        do {
          out.write("\n");
          out.write("                            <li class=\"menu_ge\"></li>\n");
          out.write("                        <li id=\"m_04\"><a href=\"student!personalStuInfo.action\">个人资料</a></li>\n");
          out.write("                        <li class=\"menu_ge\"></li>\n");
          out.write("                         <li id=\"m_07\"><a href=\"");
          out.print(request.getContextPath());
          out.write("/PersonalInfo/StuPswModify.jsp\">修改密码</a></li>\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_s_if_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_s_if_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_s_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_1);
        return;
      }
      _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_1);
      out.write("\n");
      out.write("                        ");
      if (_jspx_meth_s_elseif_0(_jspx_page_context))
        return;
      out.write("   \n");
      out.write("                        <li class=\"menu_ge\"></li>\n");
      out.write("                        ");
if (request.getSession().getAttribute("admin") != null) {
      out.write(" \n");
      out.write("                        <li id=\"m_07\"><a href=\"post\">帖子管理</a></li>\n");
      out.write("                        <li class=\"menu_ge\"></li>\n");
      out.write("                        <li id=\"m_07\"><a href=\"board!loadRootBoards.action\">版块管理</a></li>\n");
      out.write("                          <li class=\"menu_ge\"></li>\n");
      out.write("                          <li id=\"m_07\"><a href=\"#\">系统维护</a></li>\n");
      out.write("                          <li class=\"menu_ge\"></li>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                      \n");
      out.write("                        <li id=\"m_08\"><a href=\"login!exit.action\">退出</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
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

  private boolean _jspx_meth_s_property_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_0 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_0.setPageContext(_jspx_page_context);
    _jspx_th_s_property_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_if_0);
    _jspx_th_s_property_0.setValue("#session.student.photoPath");
    int _jspx_eval_s_property_0 = _jspx_th_s_property_0.doStartTag();
    if (_jspx_th_s_property_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_0);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_0);
    return false;
  }

  private boolean _jspx_meth_s_property_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_1 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_1.setPageContext(_jspx_page_context);
    _jspx_th_s_property_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_if_0);
    _jspx_th_s_property_1.setValue("#session.student.nickName");
    int _jspx_eval_s_property_1 = _jspx_th_s_property_1.doStartTag();
    if (_jspx_th_s_property_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_1);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_1);
    return false;
  }

  private boolean _jspx_meth_s_property_2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_else_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_2 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_2.setPageContext(_jspx_page_context);
    _jspx_th_s_property_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_else_0);
    _jspx_th_s_property_2.setValue("#session.student.nickName");
    int _jspx_eval_s_property_2 = _jspx_th_s_property_2.doStartTag();
    if (_jspx_th_s_property_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_2);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_2);
    return false;
  }

  private boolean _jspx_meth_s_elseif_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:elseif
    org.apache.struts2.views.jsp.ElseIfTag _jspx_th_s_elseif_0 = (org.apache.struts2.views.jsp.ElseIfTag) _jspx_tagPool_s_elseif_test.get(org.apache.struts2.views.jsp.ElseIfTag.class);
    _jspx_th_s_elseif_0.setPageContext(_jspx_page_context);
    _jspx_th_s_elseif_0.setParent(null);
    _jspx_th_s_elseif_0.setTest("#session.admin!=null");
    int _jspx_eval_s_elseif_0 = _jspx_th_s_elseif_0.doStartTag();
    if (_jspx_eval_s_elseif_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_elseif_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_elseif_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_elseif_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                            <li class=\"menu_ge\"></li>\n");
        out.write("                        <li id=\"m_04\"><a href=\"admin!personalAdminInfo.action\">个人资料</a></li>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_s_elseif_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_elseif_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_elseif_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_elseif_test.reuse(_jspx_th_s_elseif_0);
      return true;
    }
    _jspx_tagPool_s_elseif_test.reuse(_jspx_th_s_elseif_0);
    return false;
  }
}
