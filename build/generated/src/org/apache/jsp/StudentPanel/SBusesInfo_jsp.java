package org.apache.jsp.StudentPanel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Bean.Buses;
import Dao.BusOperation;
import Bean.Student;
import java.util.ListIterator;
import java.util.List;
import Dao.StudentOperation;

public final class SBusesInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <title>Faculty | BusesInfo</title>\r\n");
      out.write("        <link href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Roboto+Condensed:300,300i,400,400i,700i\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <nav role='navigation' id=\"mainnav\">\r\n");
      out.write("            <br><br><br>\r\n");
      out.write("            <ul class=\"gap\">\r\n");
      out.write("                <li><a href=\"FUserInfo.jsp\">UserInfo</a></li>\r\n");
      out.write("                <li><a href=\"FFacultyInfo.jsp\">FacultyInfo</a></li>\r\n");
      out.write("                <li><a href=\"FBusesInfo.jsp\">BusesInfo</a></li>\r\n");
      out.write("                <li><a href=\"../logout\">Logout</a></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </ul>\r\n");
      out.write("        </nav>\r\n");
      out.write("        <<center>\r\n");
      out.write("        <br><br><center style=\"margin-bottom: 4%;\">\r\n");
      out.write("            <form method=\"post\" autocomplete=\"off\">\r\n");
      out.write("                <input type=\"text\" name=\"search\" placeholder=\"Enter Name..\">\r\n");
      out.write("                <input type=\"submit\" value=\"Search\" name=\"ButtonSearch\" >\r\n");
      out.write("            </form></center>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"hamb\">\r\n");
      out.write("            <a href=\"#\"><i class=\"fa fa-bars\"></i></a>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!------------------------------------Searched Data------------------------------------------->\r\n");
      out.write("        ");

            if (request.getParameter("ButtonSearch") != null) {
                String targetString = request.getParameter("search");
        
      out.write("\r\n");
      out.write("        <section>\r\n");
      out.write("            <center style=\"margin-top:2%; margin-bottom: 2%;\"><h1 style=\"color:#ff6666;font-family: 'Roboto Condensed', sans-serif;\">Results</h1></center>\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                ");

                    BusOperation st = new BusOperation();
                    List li = st.searchByRoute(targetString);
                    ListIterator lit = li.listIterator();
                    while (lit.hasNext()) {
                        Buses bus = (Buses) lit.next();
                
      out.write("\r\n");
      out.write("                <div class=\"box\">\r\n");
      out.write("                    <div class=\"content\">\r\n");
      out.write("                        <h3>Bus Number : ");
      out.print(bus.getBusNo());
      out.write("</h3>\r\n");
      out.write("                        <h3>Bus Time : ");
      out.print(bus.getBusTime());
      out.write("</h3>\r\n");
      out.write("                        <h3>Driver Name : ");
      out.print(bus.getDriverName());
      out.write("</h3>\r\n");
      out.write("                        <h3>Contact : ");
      out.print(bus.getDriverContact());
      out.write("</h3><br>\r\n");
      out.write("                        <p>This Bus follow the route from College to ");
      out.print(bus.getBusRoute());
      out.write("</p>\r\n");
      out.write("                        <a href=\"FBusController/UpdateBus.jsp?id=");
      out.print(bus.getB_id());
      out.write("\">Update</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                ");

                    }
                
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <hr noshade>\r\n");
      out.write("        ");

            }
        
      out.write("\r\n");
      out.write("        <!------------------------------------Searched Data------------------------------------------->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <section>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                ");

                    BusOperation st = new BusOperation();
                    List li = st.selectAllBuses();
                    ListIterator lit = li.listIterator();
                    while (lit.hasNext()) {
                        Buses bus = (Buses) lit.next();
                
      out.write("\r\n");
      out.write("                <div class=\"box\">\r\n");
      out.write("                    <div class=\"content\">\r\n");
      out.write("                        <h3>Bus Number : ");
      out.print(bus.getBusNo());
      out.write("</h3>\r\n");
      out.write("                        <h3>Bus Time : ");
      out.print(bus.getBusTime());
      out.write("</h3>\r\n");
      out.write("                        <h3>Driver Name : ");
      out.print(bus.getDriverName());
      out.write("</h3>\r\n");
      out.write("                        <h3>Contact : ");
      out.print(bus.getDriverContact());
      out.write("</h3><br>\r\n");
      out.write("                        <p>This Bus follow the route from College to ");
      out.print(bus.getBusRoute());
      out.write("</p>\r\n");
      out.write("                        <a href=\"FBusController/UpdateBus.jsp?id=");
      out.print(bus.getB_id());
      out.write("\">Update</a>\r\n");
      out.write("                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                ");

                    }
                
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <canvas id=\"bubble\"></canvas>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.js\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.10.3/jquery-ui.js\"></script>\r\n");
      out.write("        <script src=\"js/jqry.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
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
