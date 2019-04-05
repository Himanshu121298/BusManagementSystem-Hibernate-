package org.apache.jsp.AdminPanel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\" >\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Admin | Register</title>\n");
      out.write("\n");
      out.write("        <script\n");
      out.write("            src=\"https://code.jquery.com/jquery-3.3.1.js\"\n");
      out.write("        ></script>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css1/style.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div id=\"particles-js\"></div>\n");
      out.write("\n");
      out.write("        <div class=\"login-reg-panel\">\n");
      out.write("            <div class=\"white-panel\">\n");
      out.write("                <div class=\"login-show\">\n");
      out.write("                    <h1>REGISTER</h1>\n");
      out.write("                    <form action=\"../RegisterController\" autocomplete=\"on\" method=\"post\">\n");
      out.write("                        <input type=\"text\" placeholder=\"Name\" id=\"name\" name=\"name\" required>\n");
      out.write("                        <input type=\"text\" placeholder=\"Userame\" id=\"username\" name=\"username\" required>\n");
      out.write("                        <input type=\"text\" placeholder=\"Address\" id=\"addrress\" name=\"address\" required>\n");
      out.write("                        <select name=\"account\" style=\"width:310px;\">\n");
      out.write("                            <option value=\"Student\">Student</option>\n");
      out.write("                            <option value=\"Faculty\">Faculty</option>\n");
      out.write("                            <option value=\"Admin\">Admin</option>\n");
      out.write("                        </select>\n");
      out.write("                        <input type=\"password\" placeholder=\"Password\" id=\"password\" name=\"password\" required>\n");
      out.write("                        <input type=\"submit\" value=\"Register\">\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script type=\"text/javascript\" src=\"js1/particles.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js1/app.js\"></script>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"js1/style.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
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
