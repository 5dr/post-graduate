package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class diploma_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <title>بيانات التسجيل للدبلومة</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"icon\" href=\"style/img/menoufiauniversity.png\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"style/bootstrap-4.3.1-dist/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style/css/style.css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-expand-md  navbar-dark fixed-top\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"main.jsp\"><img src=\"style/img/fci_ar.png\"></a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#collapsibleNavbar\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"collapsibleNavbar\">\n");
      out.write("                <ul class=\"navbar-nav\">\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">اعضاء هيئة التدريس</a>\n");
      out.write("                        <div class=\"dropdown-menu\">\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">TODO</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">TODO</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">TODO</a>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">الطلاب</a>\n");
      out.write("                        <div class=\"dropdown-menu\">\n");
      out.write("                            <a class=\"dropdown-item\" href=\"doctorate.jsp\">التسجيل للدكتوراه</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"master.jsp\">التسجيل للماجيستير</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"diploma.jsp\">التسجيل للدبلوم</a>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\"><a class=\"nav-link\" href=\"terms.jsp\">شروط التقديم</a></li>\n");
      out.write("                    <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">اتصل بنا</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"form-container col \">\n");
      out.write("            <form action=\"diploma_imp.jsp\" method=\"post\" class=\"col-lg-8\">\n");
      out.write("                <label>الاسم :</label>\n");
      out.write("                <input class=\"col-md-8\" type=\"text\" name=\"first_name\" placeholder=\"ادخل الاسم بالكامل\"> <br>\n");
      out.write("                <label>اسم الوالد :</label>\n");
      out.write("                <input class=\"col-md-8\" type=\"text\" name=\"last_name\" placeholder=\"ادخل الاسم بالكامل\"> <br>\n");
      out.write("                <label>تاريخ الميلاد :</label>\n");
      out.write("                <input type=\"date\" name=\"dob\"> <br>\n");
      out.write("                <fieldset>\n");
      out.write("                    <legend>محل الميلاد*</legend>\n");
      out.write("                    <input type=\"text\" name=\"village\" placeholder=\"قرية\">\n");
      out.write("                    <input type=\"text\" name=\"section\" placeholder=\"مركز\">\n");
      out.write("                    <input type=\"text\" name=\"government\" placeholder=\"محافظة\">\n");
      out.write("                </fieldset>\n");
      out.write("                <div class=\"field\">\n");
      out.write("                    <input type=\"text\" name=\"nationality\" placeholder=\"الجنسية\">\n");
      out.write("                    <input type=\"text\" name=\"religion\" placeholder=\"الديانة\">\n");
      out.write("                    <input type=\"text\" name=\"national_id\" placeholder=\"رقم البطاقة\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"field\">\n");
      out.write("                    <label>موقف التجنيد :</label>\n");
      out.write("                    <select name=\"recruitment_position\">\n");
      out.write("                        <option value=\"مؤجل\">مؤجل</option>\n");
      out.write("                        <option value=\"معفي\">معفي</option>\n");
      out.write("                        <option value=\"انهي الخدمة\">انهي الخدمة</option>\n");
      out.write("                    </select>\n");
      out.write("                    <input type=\"text\" name=\"job\" placeholder=\"الوظيفة\">\n");
      out.write("                    <input type=\"text\" name=\"organization\" placeholder=\"جهة العمل\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"field-two\">\n");
      out.write("                    <input type=\"text\" name=\"address\" placeholder=\"العنوان\">\n");
      out.write("                    <input type=\"text\" name=\"telephone\" placeholder=\"رقم التليفون\">\n");
      out.write("                    <input type=\"text\" name=\"graduation_year\" placeholder=\"سنة التخرج\">\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <fieldset class=\"fieldset-two\">\n");
      out.write("                    <legend>الدرجات الجامعية الحاصل عليها*</legend>\n");
      out.write("                    ۱-<br>\n");
      out.write("                    <input type=\"text\" name=\"bachelor\" placeholder=\"بكالوريوس/ليسانس في\">\n");
      out.write("                    <input type=\"text\" name=\"round\" placeholder=\"دور\">\n");
      out.write("                    <input type=\"text\" name=\"general_appreciation\" placeholder=\"التقدير العام\">\n");
      out.write("                    <input type=\"text\" name=\"department\" placeholder=\"الشعبة\">\n");
      out.write("                    <input type=\"text\" name=\"specialization_appreciation\" placeholder=\"تقدير التخصص\">\n");
      out.write("                    <input type=\"text\" name=\"faculty\" placeholder=\"الكلية\">\n");
      out.write("                    <input type=\"text\" name=\"university\" placeholder=\"الجامعة\">\n");
      out.write("                    <input type=\"text\" name=\"graduation_year\" placeholder=\"سنة التخرج\">\n");
      out.write("                    <br>\n");
      out.write("                    ۲-\n");
      out.write("                    <br>\n");
      out.write("                    <input type=\"text\" name=\"graduate_diploma\" placeholder=\"دبلوم الدراسات العليا في\">\n");
      out.write("                    <input type=\"text\" name=\"gd_round\" placeholder=\"دور\">\n");
      out.write("                    <input type=\"text\" name=\"gd_specialization\" placeholder=\"التخصص\">\n");
      out.write("                    <input type=\"text\" name=\"gd_appreciation\" placeholder=\"التقدير\">\n");
      out.write("                    <input type=\"text\" name=\"gd_faculty\" placeholder=\"الكلية\">\n");
      out.write("                    <input type=\"text\" name=\"gd_university\" placeholder=\"الجامعة\">\n");
      out.write("                    <input type=\"text\" name=\"registered_scientific_section\" placeholder=\"القسم العلمي المتقدم للقيد فيه\">\n");
      out.write("                </fieldset>\n");
      out.write("                <input type=\"submit\" value=\"تسجيل\" class=\"btn col-lg-4\">\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
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
