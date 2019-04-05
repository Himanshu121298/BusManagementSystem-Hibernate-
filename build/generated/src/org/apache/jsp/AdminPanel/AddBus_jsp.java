package org.apache.jsp.AdminPanel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddBus_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\" >\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <title>Admin | Add Bus</title>\r\n");
      out.write("\r\n");
      out.write("        <script\r\n");
      out.write("            src=\"https://code.jquery.com/jquery-3.3.1.js\"\r\n");
      out.write("        ></script>\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css1/style.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <div id=\"particles-js\"></div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"login-reg-panel\">\r\n");
      out.write("            <div class=\"white-panel\">\r\n");
      out.write("                <div class=\"login-show\">\r\n");
      out.write("                    <h1 style=\"margin-left:5%;\">Add Bus</h1>\r\n");
      out.write("                    <form action=\"../BusController\" autocomplete=\"on\" method=\"post\">\r\n");
      out.write("                        <input type=\"text\" placeholder=\"Bus Number\" id=\"BusNo\" name=\"BusNo\" required>\r\n");
      out.write("                        <input type=\"text\" placeholder=\"Bus Route\" id=\"BusRoute\" name=\"BusRoute\" required>\r\n");
      out.write("                        <input type=\"text\" placeholder=\"Timing\" id=\"BusTime\" name=\"BusTime\" required>\r\n");
      out.write("                        <input type=\"text\" placeholder=\"Driver Name\" id=\"DriverName\" name=\"DriverName\" required>\r\n");
      out.write("                        <input type=\"text\" placeholder=\"Contact\" id=\"DriverContact\" name=\"DriverContact\" required>\r\n");
      out.write("                        <input type=\"submit\" value=\"Register\">\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js1/particles.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js1/app.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js1/style.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
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
