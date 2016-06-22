package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import MSN.MSNBeans;

public final class top_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");

    ArrayList<MSNBeans> mbArr = (ArrayList<MSNBeans>) session.getAttribute("newsArr");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("        <title>News巻物</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.css\">\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            body { padding-top: 80px; }\n");
      out.write("            @media ( min-width: 768px ) {\n");
      out.write("                #banner {\n");
      out.write("                    min-height: 300px;\n");
      out.write("                    border-bottom: none;\n");
      out.write("                }\n");
      out.write("                .bs-docs-section {\n");
      out.write("                    margin-top: 8em;\n");
      out.write("                }\n");
      out.write("                .bs-component {\n");
      out.write("                    position: relative;\n");
      out.write("                }\n");
      out.write("                .bs-component .modal {\n");
      out.write("                    position: relative;\n");
      out.write("                    top: auto;\n");
      out.write("                    right: auto;\n");
      out.write("                    left: auto;\n");
      out.write("                    bottom: auto;\n");
      out.write("                    z-index: 1;\n");
      out.write("                    display: block;\n");
      out.write("                }\n");
      out.write("                .bs-component .modal-dialog {\n");
      out.write("                    width: 90%;\n");
      out.write("                }\n");
      out.write("                .bs-component .popover {\n");
      out.write("                    position: relative;\n");
      out.write("                    display: inline-block;\n");
      out.write("                    width: 220px;\n");
      out.write("                    margin: 20px;\n");
      out.write("                }\n");
      out.write("                .nav-tabs {\n");
      out.write("                    margin-bottom: 15px;\n");
      out.write("                }\n");
      out.write("                .progress {\n");
      out.write("                    margin-bottom: 10px;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("          <script src=\"//oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("          <script src=\"//oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <div class=\"navbar navbar-default navbar-fixed-top\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"navbar-header\">\n");
      out.write("                        <a href=\"/OriginalSite/bootstrap/umi/top.jsp\" class=\"navbar-brand\">News巻物</a>\n");
      out.write("                        <button class=\"navbar-toggle\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbar-main\">\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"navbar-collapse collapse\" id=\"navbar-main\">\n");
      out.write("                        <ul class=\"nav navbar-nav\">\n");
      out.write("                            <li><a href=\"/OriginalSite/bootstrap/umi/top.jsp\">Top</a></li>\n");
      out.write("                            <li><a href=\"//github.com/NKMR6194/Umi/releases\">Login</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        \n");
      out.write("        <div class=\"page-header\">\n");
      out.write("            <div class=\"container\">        \n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <div class=\"bs-component\">\n");
      out.write("                            <div class=\"jumbotron\">\n");
      out.write("                                <h1>News巻物</h1>\n");
      out.write("                                <p>下のボタンから読みたいニュースのジャンルを選んでください</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\" >\n");
      out.write("                <div class=\"col-lg-2\">\n");
      out.write("                    <p class=\"bs-component\">\n");
      out.write("                        <a href=\"Genre?genre=national\" class=\"btn btn-primary btn-lg btn-block\">国内</a>\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-2\">\n");
      out.write("                    <p class=\"bs-component\">\n");
      out.write("                        <a href=\"Genre?genre=world\" class=\"btn btn-primary btn-lg btn-block\">海外</a>\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-2\">\n");
      out.write("                    <p class=\"bs-component\">\n");
      out.write("                        <a href=\"Genre?genre=money\" class=\"btn btn-primary btn-lg btn-block\">ビジネス</a>\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-2\">\n");
      out.write("                    <p class=\"bs-component\">\n");
      out.write("                        <a href=\"Genre?genre=techandscience\" class=\"btn btn-primary btn-lg btn-block\">テクノロジー</a>\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-2\">\n");
      out.write("                    <p class=\"bs-component\">\n");
      out.write("                        <a href=\"Genre?genre=entertainment\" class=\"btn btn-primary btn-lg btn-block\">エンタメ</a>\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-2\">\n");
      out.write("                    <p class=\"bs-component\">\n");
      out.write("                        <a href=\"Genre?genre=sports\" class=\"btn btn-primary btn-lg btn-block\">スポーツ</a>\n");
      out.write("                    </p>\n");
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
}
