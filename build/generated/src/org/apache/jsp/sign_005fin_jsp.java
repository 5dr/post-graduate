package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sign_005fin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <title>تسجيل الدخول</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"icon\" href=\"style/img/menoufiauniversity.png\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"style/bootstrap-4.3.1-dist/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style/css/sign-form.css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body class=\"sign-in-back\">\n");
      out.write("        <nav class=\"navbar navbar-expand-md  navbar-dark\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"main.jsp\"><img src=\"style/img/fci_ar.png\"></a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#collapsibleNavbar\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"collapsibleNavbar\">\n");
      out.write("                <ul class=\"navbar-nav\">\n");
      out.write("                    <li class=\"nav-item\"><a class=\"nav-link\" href=\"main.jsp\">الصفحة الرئيسية</a></li>\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                       \n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\"><a class=\"nav-link\" href=\"terms.jsp\">شروط التقديم</a></li>\n");
      out.write("                    <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">اتصل بنا</a></li>\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"container login-container\">\n");
      out.write("            <div class=\"col-md-8 login-form-1\">\n");
      out.write("                \n");
      out.write("                <h3>تسجيل الدخول</h3>\n");
      out.write("                <form  action=\"sign_in_imp.jsp\" method=\"POST\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"username\" placeholder=\"اسم المستخدم*\" value=\"\" />\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <input type=\"password\" class=\"form-control\" name=\"password\" placeholder=\"كلمة المرور*\" value=\"\" />\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\" style=\"text-align: right;\">\n");
      out.write("                        موظف <input type=\"radio\" value=\"stuff\" name=\"x\" />\n");
      out.write("                        دكتور <input type=\"radio\" value=\"doctor\" name=\"x\"/>\n");
      out.write("                        طالب <input type=\"radio\" value=\"student\" name=\"x\"/>\n");
      out.write("                        ادمن<input type=\"radio\" value=\"admin\" name=\"x\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <input type=\"submit\" name=\"submit\" class=\"btnSubmit\" value=\"تسجيل الدخول\" />\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <a href=\"#\" class=\"ForgetPwd\">نسيت كلمة المرور؟</a>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <script src=\"style/js/jquery-3.3.1.min.js\"></script>\n");
      out.write("        <script src=\"style/bootstrap-4.3.1-dist/js/bootstrap.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>");
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
}
