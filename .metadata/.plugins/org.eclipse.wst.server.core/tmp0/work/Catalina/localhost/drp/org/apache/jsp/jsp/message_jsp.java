/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.85
 * Generated at: 2018-03-22 13:18:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class message_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css\">  \r\n");
      out.write("   <script src=\"http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js\"></script>\r\n");
      out.write("   <script src=\"http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"jumbotron\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<h1>网站标题</h1>\r\n");
      out.write("\t\t<p>网站简介</p>\r\n");
      out.write("\t\t<p><a href=\"\" class=\"btn btn-default\">快速进入</a></p>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<br><br><br><br><br>\r\n");
      out.write("<h2>轮播图</h2>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\t<div id=\"myCarousel\" class=\"carousel slide\">\r\n");
      out.write("\t    <!-- 轮播（Carousel）指标 -->\r\n");
      out.write("\t    <ol class=\"carousel-indicators\">\r\n");
      out.write("\t        <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("\t        <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\r\n");
      out.write("\t        <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\r\n");
      out.write("\t    </ol>   \r\n");
      out.write("\t    <!-- 轮播（Carousel）项目 -->\r\n");
      out.write("\t    <div class=\"carousel-inner\" >\r\n");
      out.write("\t        <div class=\"item active\">\r\n");
      out.write("\t            <img src=\"C:\\Users\\zly11\\Pictures\\我的壁纸\\c027a64ejw1f2qqql5q2dj20qq0qo0wi.jpg\" alt=\"First slide\">\r\n");
      out.write("\t        </div>\r\n");
      out.write("\t        <div class=\"item\" >\r\n");
      out.write("\t            <img src=\"C:\\Users\\zly11\\Pictures\\我的壁纸\\c027a64ejw1f2qqql5q2dj20qq0qo0wi.jpg\" alt=\"Second slide\">\r\n");
      out.write("\t        </div>\r\n");
      out.write("\t        <div class=\"item\">\r\n");
      out.write("\t            <img src=\"C:\\Users\\zly11\\Pictures\\我的壁纸\\c027a64ejw1f2qqql5q2dj20qq0qo0wi.jpg\" alt=\"Third slide\">\r\n");
      out.write("\t        </div>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t    <!-- 轮播（Carousel）导航 -->\r\n");
      out.write("\t    <a class=\"carousel-control left\" href=\"#myCarousel\" \r\n");
      out.write("\t        data-slide=\"prev\">&lsaquo;\r\n");
      out.write("\t    </a>\r\n");
      out.write("\t    <a class=\"carousel-control right\" href=\"#myCarousel\" \r\n");
      out.write("\t        data-slide=\"next\">&rsaquo;\r\n");
      out.write("\t    </a>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>\r\n");
      out.write("<h1>响应式</h1>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("\t\t<div class=\"col-md-3 col-sm-4 col xs-6\">111</div>\r\n");
      out.write("\t\t<div class=\"col-md-3 col-sm-4 col xs-6\">111</div>\r\n");
      out.write("\t\t<div class=\"col-md-3 col-sm-4 col xs-6\">111</div>\r\n");
      out.write("\t\t<div class=\"col-md-3 col-sm-4 col xs-6\">111</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
