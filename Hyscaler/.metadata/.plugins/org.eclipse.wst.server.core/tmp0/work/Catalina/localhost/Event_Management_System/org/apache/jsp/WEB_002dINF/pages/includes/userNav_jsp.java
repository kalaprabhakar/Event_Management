/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.10
 * Generated at: 2024-05-12 15:46:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages.includes;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class userNav_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<nav id=\"sidebar\" class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\r\n");
      out.write("	<div class=\"container-fluid \">\r\n");
      out.write("\r\n");
      out.write("		<div class=\"collapse navbar-collapse\" id=\"navbarTogglerDemo02\">\r\n");
      out.write("			<div class=\"navbar-nav\">\r\n");
      out.write("\r\n");
      out.write("				<a class=\"nav-link \" aria-current=\"page\" href=\"user_home\"><img\r\n");
      out.write("					src=\"images/dashboard.png\" class=\"mr-2\" width=\"30\" height=\"30\">Dashboard</a>\r\n");
      out.write("				<a class=\"nav-link\" href=\"upcomingevents\"><img\r\n");
      out.write("					src=\"images/newbooking.png\" class=\"mr-2\" width=\"30\" height=\"30\">Upcoming\r\n");
      out.write("					Events</a> <a class=\"nav-link\" href=\"bookticket\"><img\r\n");
      out.write("					src=\"images/event.png\" class=\"mr-2\" width=\"30\" height=\"30\">Book\r\n");
      out.write("					Events</a> <a class=\"nav-link\" href=\"bookedticket\"><img\r\n");
      out.write("					src=\"images/bookingdetails.png\" class=\"mr-2\" width=\"30\" height=\"30\">Booking\r\n");
      out.write("					History</a> <a class=\"nav-link\" href=\"#\"><img\r\n");
      out.write("					src=\"images/hotel.png\" class=\"mr-2\" width=\"30\" height=\"30\">Feedback</a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("		<form class=\"form-inline ml-5 my-lg-0 mr-5 \" action=\"search\" method=\"post\">\r\n");
      out.write("			<input class=\"form-control mr-sm-2\" type=\"search\"\r\n");
      out.write("				placeholder=\"Search\" aria-label=\"Search\" name=\"search\">\r\n");
      out.write("			<button class=\"btn btn-outline-danger my-2 my-sm-0 \" type=\"submit\">Search</button>\r\n");
      out.write("		</form>\r\n");
      out.write("		<div>\r\n");
      out.write("			<a class=\"navbar-brand\" href=\"logoutuser\"><img\r\n");
      out.write("				src=\"images/logout.png\" class=\"mr-2\" width=\"30\" height=\"30\"><sapn>Logout</sapn></a>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</nav>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
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
