package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <title>الصفحة الرئيسية</title>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"style/css/main.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"style/bootstrap-4.3.1-dist/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"icon\" href=\"style/img/menoufiauniversity.png\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <nav class=\"navbar navbar-expand-md  navbar-dark fixed-top\">\n");
      out.write("        <a class=\"navbar-brand\" href=\"main.jsp\"><img src=\"style/img/fci_ar.png\"></a>\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#collapsibleNavbar\">\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("        </button>\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"collapsibleNavbar\">\n");
      out.write("            <ul class=\"navbar-nav\">\n");
      out.write("                <li class=\"nav-item\"><a class=\"nav-link\" href=\"main.jsp\">الصفحة الرئيسية</a></li>\n");
      out.write("               \n");
      out.write("                <li class=\"nav-item\"><a class=\"nav-link\" href=\"terms.jsp\">شروط التقديم</a></li>\n");
      out.write("                <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">اتصل بنا</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("    <header>.\n");
      out.write("        \n");
      out.write("        <section>\n");
      out.write("            <div class=\"inner\">\n");
      out.write("                <div class=\"header-txt\">\n");
      out.write("                    <h1>كلية الحاسبات والمعلومات</h1>\n");
      out.write("                    <div class=\"btns\">\n");
      out.write("                        <a class=\"btn-one\" href=\"sign_in.jsp\">تسجيل الدخول</a>\n");
      out.write("                        <a class=\"btn-sec\" href=\"sign_up.jsp\">انشاء حساب</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("    </header>\n");
      out.write("    <div class=\"main\">\n");
      out.write("        <div class=\"container about\">\n");
      out.write("            <img src=\"style/img/target.png\" class=\"icon-dart\">\n");
      out.write("            <p>تتلخص رسالة الكلية في إعداد خريج متميز في مجالات علوم الحاسب ونظم وتكنولوجيا\n");
      out.write("                المعلومات ودعم القرار قادر على توظيف مكتسباته العلمية ومهاراته العملية لتلبية متطلبات\n");
      out.write("                سوق العمل, كما تهدف الى إنتاج بحث علمي راقى والقيام بدورها المجتمعي من خلال تقديم\n");
      out.write("                استشارات فنية ودعم تقنى\n");
      out.write("            </p>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <script src=\"style/js/jquery-3.3.1.min.js\"></script>\n");
      out.write("    <script src=\"style/bootstrap-4.3.1-dist/js/bootstrap.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
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
}
