/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.10
 * Generated at: 2024-05-12 14:48:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class organizer_005fhome_jsp extends org.apache.jasper.runtime.HttpJspBase
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

if (session.getAttribute("Admin_email") == null) {response.sendRedirect("login"); } else {
      out.write(' ');
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/header.jsp", out, false);
      out.write("  \r\n");
      out.write("	\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/organizerNav.jsp", out, false);
      out.write("  \r\n");
      out.write("	\r\n");
      out.write("	<style>\r\n");
      out.write("    .card:hover {\r\n");
      out.write("      transform: scale(1.05);\r\n");
      out.write("      box-shadow: 0 10px 20px rgba(0, 0, 0, .12), 0 4px 8px rgba(0, 0, 0, .06);\r\n");
      out.write("      transition: 0.3s ease-in-out;\r\n");
      out.write("      cursor:pointer;\r\n");
      out.write("  }\r\n");
      out.write("    </style>\r\n");
      out.write("	    <!-- Page Content  -->\r\n");
      out.write("        <div id=\"content\">\r\n");
      out.write("\r\n");
      out.write("             <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\r\n");
      out.write("                <div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("                   <div>\r\n");
      out.write("                    	<h3 class=\"text-info\">ADMIN DASHBOARD</h3>\r\n");
      out.write("                    </div>\r\n");
      out.write("                   <div>\r\n");
      out.write("                    	<p>Welcome \r\n");
      out.write("                    	");
 if(session.getAttribute("Admin_gender").equals("male")){ 
      out.write(" \r\n");
      out.write("                    		Mr.\r\n");
      out.write("                    	");
}else{
      out.write(" \r\n");
      out.write("                    		Miss.\r\n");
      out.write("                    	");
}
      out.write(" \r\n");
      out.write("                    	<span class=\"font-weight-bold text-info\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Admin_firstname}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Admin_lastname}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span></p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"https://pixinvent.com/stack-responsive-bootstrap-4-admin-template/app-assets/css/bootstrap-extended.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"https://pixinvent.com/stack-responsive-bootstrap-4-admin-template/app-assets/fonts/simple-line-icons/style.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"https://pixinvent.com/stack-responsive-bootstrap-4-admin-template/app-assets/css/colors.min.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"grey-bg container-fluid\">\r\n");
      out.write("  <section id=\"minimal-statistics\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("      <div class=\"col-12 mt-3 mb-1\">\r\n");
      out.write("        \r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("      <div class=\"col-xl-3 col-sm-6 col-12\"> \r\n");
      out.write("        <div class=\"card\">\r\n");
      out.write("          <div class=\"card-content\">\r\n");
      out.write("            <div class=\"card-body\">\r\n");
      out.write("              <div class=\"media d-flex\">\r\n");
      out.write("                <div class=\"align-self-center\">\r\n");
      out.write("                  <i class=\"fas fa-users primary fa-3x\"></i>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"media-body text-right\">\r\n");
      out.write("                  <h3 class=\"success\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${totalEvents}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h3>\r\n");
      out.write("                  <span>VENUES</span>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col-xl-3 col-sm-6 col-12\">\r\n");
      out.write("        <div class=\"card\">\r\n");
      out.write("          <div class=\"card-content\">\r\n");
      out.write("            <div class=\"card-body\">\r\n");
      out.write("              <div class=\"media d-flex\">\r\n");
      out.write("                <div class=\"align-self-center\">\r\n");
      out.write("                  <i class=\"fas fa-birthday-cake success fa-3x\"></i>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"media-body text-right\">\r\n");
      out.write("                  <h3 class=\"primary\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bookings}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h3>\r\n");
      out.write("                  <span>UPCOMING BOOKINGS</span>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("  \r\n");
      out.write("      <div class=\"col-xl-3 col-sm-6 col-12\">\r\n");
      out.write("        <div class=\"card\">\r\n");
      out.write("          <div class=\"card-content\">\r\n");
      out.write("            <div class=\"card-body\">\r\n");
      out.write("              <div class=\"media d-flex\">\r\n");
      out.write("                <div class=\"media-body text-left\">\r\n");
      out.write("                  <h3 class=\"success\">3</h3>\r\n");
      out.write("                  <span>NOTIFICATIONS</span>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"align-self-center\">\r\n");
      out.write("                  <i class=\"fas fa-calendar-check info fa-3x\"></i>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col-xl-3 col-sm-6 col-12\">\r\n");
      out.write("        <div class=\"card\">\r\n");
      out.write("          <div class=\"card-content\">\r\n");
      out.write("            <div class=\"card-body\">\r\n");
      out.write("              <div class=\"media d-flex\">\r\n");
      out.write("                <div class=\"media-body text-left\">\r\n");
      out.write("                  <h3 class=\"warning\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bookings}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h3>\r\n");
      out.write("                  <span>PAST BOOKINGS</span>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"align-self-center\">\r\n");
      out.write("                  <i class=\"fab fa-paypal secondary fa-3x\"></i>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("</section>\r\n");
      out.write("</div>  \r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("  \r\n");
}
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
