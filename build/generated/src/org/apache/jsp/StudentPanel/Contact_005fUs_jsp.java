package org.apache.jsp.StudentPanel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Dao.StudentOperation;
import Bean.Student;

public final class Contact_005fUs_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Project | Update</title>\r\n");
      out.write("\r\n");
      out.write("        <link href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style1.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <section>\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"formBox\">\r\n");
      out.write("                        <form action=\"FormController\" method=\"post\">\r\n");
      out.write("                            <h1> Contact Us</h1>\r\n");
      out.write("                            \r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-sm-6\">\r\n");
      out.write("                                    <div class=\"inputBox\">\r\n");
      out.write("                                        <div class=\"inputText\">Name</div>\r\n");
      out.write("                                        <input type=\"text\" name=\"name\" class=\"input\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\t\r\n");
      out.write("                                <div class=\"col-sm-6\">\r\n");
      out.write("                                    <div class=\"inputBox\">\r\n");
      out.write("                                        <div class=\"inputText\">UserID</div>\r\n");
      out.write("                                        <input type=\"text\" name=\"username\" class=\"input\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\t\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-sm-6\">\r\n");
      out.write("                                    <div class=\"inputBox\">\r\n");
      out.write("                                        <div class=\"inputText\">Email</div>\r\n");
      out.write("                                        <input type=\"email\" name=\"email\" class=\"input\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\t\r\n");
      out.write("                                <div class=\"col-sm-6\">\r\n");
      out.write("                                    <div class=\"inputBox\">\r\n");
      out.write("                                        <div class=\"inputText\">Contact</div>\r\n");
      out.write("                                        <input type=\"number\" name=\"Contact\" class=\"input\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\t\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-sm-12\">\r\n");
      out.write("                                    <div class=\"inputBox\">\r\n");
      out.write("                                        <div class=\"inputText\">Query</div>\r\n");
      out.write("                                         <input type=\"text\" name=\"Queries\" class=\"input\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\t\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-sm-12\">\r\n");
      out.write("                                    <input type=\"submit\" value=\"Submit\" class=\"button\">\t\r\n");
      out.write("                                </div>\t\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.2.1.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            $(\".input\").focus(function () {\r\n");
      out.write("                $(this).parent().addClass(\"focus\");\r\n");
      out.write("            }).blur(function () {\r\n");
      out.write("                if ($(this).val() === '') {\r\n");
      out.write("                    $(this).parent().removeClass(\"focus\");\r\n");
      out.write("                }\r\n");
      out.write("            })\r\n");
      out.write("        </script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
