/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.10
 * Generated at: 2024-05-13 12:14:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/lib/jakarta.servlet.jsp.jstl-2.0.0.jar", Long.valueOf(1602874032000L));
    _jspx_dependants.put("jar:file:/F:/Hyscaler/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Event_Management_System/WEB-INF/lib/jakarta.servlet.jsp.jstl-2.0.0.jar!/META-INF/c.tld", Long.valueOf(1602854172000L));
    _jspx_dependants.put("jar:file:/F:/Hyscaler/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Event_Management_System/WEB-INF/lib/spring-webmvc-6.1.6.jar!/META-INF/spring-form.tld", Long.valueOf(1712803546000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-6.1.6.jar", Long.valueOf(1712825153000L));
  }

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-expand-md navbar-dark  bg-dark\">\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("      <a class=\"navbar-brand\" href=\"./\"><i class=\"fas fa-backward\"></i> Back</a>\r\n");
      out.write("      <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarCollapse\" aria-controls=\"navbarCollapse\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("      </button>\r\n");
      out.write("     </div>\r\n");
      out.write("  </nav>\r\n");
      out.write("  \r\n");
      out.write("  <section class=\"container \">\r\n");
      out.write("  		<div class=\"container\">\r\n");
      out.write("    			<div class=\"row align-items-center my-5\">\r\n");
      out.write("        				\r\n");
      out.write("        				<div class=\"col-md-12 col-lg-6 col-sm-12 mb-5\">\r\n");
      out.write("            			<img src=\"images/register.png\" alt=\"\" class=\"img-fluid mb-3 d-none d-md-block\">   \r\n");
      out.write("       						<h1>Create an Account</h1>\r\n");
      out.write("           					<p class=\"font-italic text-muted mb-0\">Fill out the Information provided here to sign in</p>\r\n");
      out.write("           			    	<div c:if=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reg_error != null}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("								<p class=\"text-danger\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reg_error}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("							</div>\r\n");
      out.write("           			    </div>\r\n");
      out.write("\r\n");
      out.write("				        <!-- Registeration Form -->\r\n");
      out.write("				        <div class=\"col-md-12 col-lg-6 col-sm-12 mt-3\">\r\n");
      out.write("				           <form  modelAttribute=\"user\" method=\"POST\">\r\n");
      out.write("				             \r\n");
      out.write("				             <!-- Role -->\r\n");
      out.write("				                    <div class=\"input-group col-lg-12 mb-4\">\r\n");
      out.write("				                        <div class=\"input-group-prepend\">\r\n");
      out.write("				                            <span class=\"input-group-text bg-white px-4 border-md border-right-0\">\r\n");
      out.write("				                                <i class=\"fa-solid fa-user\"></i>\r\n");
      out.write("				                            </span>\r\n");
      out.write("				                        </div>\r\n");
      out.write("				                        <select id=\"type\" name=\"role\" class=\"form-control custom-select bg-white border-left-0 border-md\" required>\r\n");
      out.write("				                            <option value=\"\">Select Role</option>\r\n");
      out.write("				                            <option value=\"user\">User</option>\r\n");
      out.write("				                            <option value=\"organizer\">Organizer</option>\r\n");
      out.write("				                        </select>\r\n");
      out.write("				                    </div>\r\n");
      out.write("				                <div class=\"row\">\r\n");
      out.write("				                    <!-- First Name -->\r\n");
      out.write("				                    <div class=\"input-group col-lg-6 mb-4\">\r\n");
      out.write("				                        <div class=\"input-group-prepend\">\r\n");
      out.write("				                            <span class=\"input-group-text bg-white px-4 border-md border-right-0\">\r\n");
      out.write("				                                <i class=\"fa fa-user text-muted\"></i>\r\n");
      out.write("				                            </span>\r\n");
      out.write("				                        </div>\r\n");
      out.write("				                        <input id=\"firstName\" type=\"text\" name=\"firstName\" placeholder=\"First Name\" class=\"form-control bg-white border-left-0 border-md\" required>\r\n");
      out.write("				                    </div>\r\n");
      out.write("\r\n");
      out.write("				                    <!-- Last Name -->\r\n");
      out.write("				                    <div class=\"input-group col-lg-6 mb-4\">\r\n");
      out.write("				                        <div class=\"input-group-prepend\">\r\n");
      out.write("				                            <span class=\"input-group-text bg-white px-4 border-md border-right-0\">\r\n");
      out.write("				                                <i class=\"fa fa-user text-muted\"></i>\r\n");
      out.write("				                            </span>\r\n");
      out.write("				                        </div>\r\n");
      out.write("				                        <input id=\"lastName\" type=\"text\" name=\"lastName\" placeholder=\"Last Name\" class=\"form-control bg-white border-left-0 border-md\" required>\r\n");
      out.write("				                    </div>\r\n");
      out.write("\r\n");
      out.write("				                    <!-- Email Address -->\r\n");
      out.write("				                    <div class=\"input-group col-lg-12 mb-4\">\r\n");
      out.write("				                        <div class=\"input-group-prepend\">\r\n");
      out.write("				                            <span class=\"input-group-text bg-white px-4 border-md border-right-0\" >\r\n");
      out.write("				                                <i class=\"fa fa-envelope text-muted\"></i>\r\n");
      out.write("				                            </span>\r\n");
      out.write("				                        </div>\r\n");
      out.write("				                        <input id=\"email\" type=\"email\" name=\"email\" placeholder=\"Email Address\" class=\"form-control bg-white border-left-0 border-md\" required>\r\n");
      out.write("				                    </div>\r\n");
      out.write("                   \r\n");
      out.write("				                    <!-- Phone Number -->\r\n");
      out.write("				                    <div class=\"input-group col-lg-12 mb-4\">\r\n");
      out.write("				                        <div class=\"input-group-prepend\">\r\n");
      out.write("				                            <span class=\"input-group-text bg-white px-4 border-md border-right-0\">\r\n");
      out.write("				                                <i class=\"fa fa-phone-square text-muted\"></i>\r\n");
      out.write("				                            </span>\r\n");
      out.write("				                        </div>\r\n");
      out.write("				                      \r\n");
      out.write("				                        <input id=\"phoneNumber\" type=\"tel\" name=\"contactNo\" pattern=\"[6789][0-9]{9}\" placeholder=\"Phone Number\" class=\"form-control bg-white border-md border-left-0 pl-3\" required>\r\n");
      out.write("				                    </div>\r\n");
      out.write("\r\n");
      out.write("									<!-- Address -->\r\n");
      out.write("				                    <div class=\"input-group col-lg-12 mb-4\">\r\n");
      out.write("				                        <div class=\"input-group-prepend\">\r\n");
      out.write("				                            <span class=\"input-group-text bg-white px-4 border-md border-right-0\">\r\n");
      out.write("				                                <i class=\"fas fa-map-marker-alt text-muted\"></i>\r\n");
      out.write("				                            </span>\r\n");
      out.write("				                        </div>\r\n");
      out.write("										<textarea class=\"form-control\" name=\"address\" placeholder=\"Address\" id=\"floatingTextarea\"></textarea>\r\n");
      out.write("  										                      \r\n");
      out.write("				                    </div>\r\n");
      out.write("									\r\n");
      out.write("				                    <!-- Gender -->\r\n");
      out.write("				                    <div class=\"input-group col-lg-12 mb-4\">\r\n");
      out.write("				                        <div class=\"input-group-prepend\">\r\n");
      out.write("				                            <span class=\"input-group-text bg-white px-4 border-md border-right-0\">\r\n");
      out.write("				                                <i class=\"fas fa-venus-mars text-muted\"></i>\r\n");
      out.write("				                            </span>\r\n");
      out.write("				                        </div>\r\n");
      out.write("				                        <select id=\"job\" name=\"gender\" class=\"form-control custom-select bg-white border-left-0 border-md\" required>\r\n");
      out.write("				                            <option value=\"\">Choose your Gender</option>\r\n");
      out.write("				                            <option value=\"male\">Male</option>\r\n");
      out.write("				                            <option value=\"female\">Female</option>\r\n");
      out.write("				                        </select>\r\n");
      out.write("				                    </div>\r\n");
      out.write("				            \r\n");
      out.write("\r\n");
      out.write("				                    <!-- Password -->\r\n");
      out.write("				                    <div class=\"input-group col-lg-6 mb-4\">\r\n");
      out.write("				                        <div class=\"input-group-prepend\">\r\n");
      out.write("				                            <span class=\"input-group-text bg-white px-4 border-md border-right-0\">\r\n");
      out.write("				                                <i class=\"fa fa-lock text-muted\" id=\"pass_icon\"></i>\r\n");
      out.write("				                            </span>\r\n");
      out.write("				                        </div>\r\n");
      out.write("				                        <input id=\"password\" type=\"password\" name=\"password\" oninput=\"checkInputs();\" placeholder=\"Password\" class=\"form-control bg-white border-left-0 border-md\" required>\r\n");
      out.write("				                    </div>\r\n");
      out.write("\r\n");
      out.write("				                    <!-- Password Confirmation -->\r\n");
      out.write("				                    <div class=\"input-group col-lg-6 mb-4\">\r\n");
      out.write("				                        <div class=\"input-group-prepend\">\r\n");
      out.write("				                            <span class=\"input-group-text bg-white px-4 border-md border-right-0\">\r\n");
      out.write("				                                <i class=\"fa fa-lock text-muted\" id=\"c_pass_icon\" ></i>\r\n");
      out.write("				                            </span>\r\n");
      out.write("				                        </div>\r\n");
      out.write("				                        <input id=\"confirmPassword\" type=\"password\" oninput=\"checkInputs();\"name=\"conformPassword\" placeholder=\"Confirm Password\" class=\"form-control bg-white border-left-0 border-md\" required>\r\n");
      out.write("				                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("				                    <!-- Submit Button -->\r\n");
      out.write("				                    <div class=\"form-group col-lg-12 mx-auto mb-0\">\r\n");
      out.write("				                        <button type=\"submit\" class=\"btn btn-primary btn-block py-2\" name=\"adduser\" >\r\n");
      out.write("				                            <span class=\"font-weight-bold\">Create your account</span>\r\n");
      out.write("				                        </button>\r\n");
      out.write("				                    </div>\r\n");
      out.write("\r\n");
      out.write("				                    <!-- Divider Text -->\r\n");
      out.write("				                    <div class=\"form-group col-lg-12 mx-auto d-flex align-items-center my-4\">\r\n");
      out.write("				                        <div class=\"border-bottom w-100 ml-5\"></div>\r\n");
      out.write("				                        <span class=\"px-2 small text-muted font-weight-bold text-muted\">OR</span>\r\n");
      out.write("				                        <div class=\"border-bottom w-100 mr-5\"></div>\r\n");
      out.write("				                    </div>\r\n");
      out.write("\r\n");
      out.write("				                    <!-- Social Login -->\r\n");
      out.write("				                    <div class=\"form-group col-lg-12 mx-auto\">\r\n");
      out.write("				                        <a href=\"#\" class=\"btn btn-danger btn-block py-2 btn-facebook\">\r\n");
      out.write("				                            <i class=\"fa fa-facebook-f mr-2\"></i>\r\n");
      out.write("				                            <span class=\"font-weight-bold\">Continue with Google</span>\r\n");
      out.write("				                        </a>\r\n");
      out.write("				                        <a href=\"#\" class=\"btn btn-primary btn-block py-2 btn-twitter\">\r\n");
      out.write("				                            <i class=\"fa fa-twitter mr-2\"></i>\r\n");
      out.write("				                            <span class=\"font-weight-bold\">Continue with Facebook</span>\r\n");
      out.write("				                        </a>\r\n");
      out.write("				                    </div>\r\n");
      out.write("\r\n");
      out.write("				                    <!-- Already Registered -->\r\n");
      out.write("				                    <div class=\"text-center w-100\">\r\n");
      out.write("				                        <p class=\"text-muted font-weight-bold\">Already Registered? <a href=\"signin\" class=\"text-primary ml-2\">Login</a></p>\r\n");
      out.write("				                    </div>\r\n");
      out.write("			                </div>\r\n");
      out.write("            	     </form>\r\n");
      out.write("			        </div>\r\n");
      out.write("			    </div>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("  </section>\r\n");
      out.write("<script>\r\n");
      out.write("var password = document.getElementById(\"password\"),confirm_password = document.getElementById(\"confirm_password\");\r\n");
      out.write("\r\n");
      out.write("function checkInputs(){\r\n");
      out.write("  if(password.value != confirm_password.value) {\r\n");
      out.write("    confirm_password.setCustomValidity(\"Passwords Don't Match\");\r\n");
      out.write("  } else {\r\n");
      out.write("    confirm_password.setCustomValidity('');\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("password.onchange = validatePassword;\r\n");
      out.write("confirm_password.onkeyup = validatePassword;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/footer.jsp", out, false);
      out.write("  \r\n");
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