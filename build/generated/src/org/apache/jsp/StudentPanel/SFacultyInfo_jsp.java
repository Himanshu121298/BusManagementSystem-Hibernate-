package org.apache.jsp.StudentPanel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Bean.Student;
import java.util.ListIterator;
import java.util.List;
import Dao.StudentOperation;

public final class SFacultyInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Faculty | FacultyInfo</title>\r\n");
      out.write("    <link href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    \r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Roboto+Condensed:300,300i,400,400i,700i\" rel=\"stylesheet\">\r\n");
      out.write("     \r\n");
      out.write("     <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <nav role='navigation' id=\"mainnav\">\r\n");
      out.write("    <br><br><br>\r\n");
      out.write("  <ul class=\"gap\">\r\n");
      out.write("    <li><a href=\"UserInfo.jsp\">UserInfo</a></li>\r\n");
      out.write("    <li><a href=\"FacultyInfo.jsp\">FacultyInfo</a></li>\r\n");
      out.write("    <li><a href=\"BusesInfo.jsp\">BusesInfo</a></li>\r\n");
      out.write("    <li><a href=\"AddBus.jsp\">Add Bus</a></li>\r\n");
      out.write("  <li><a href=\"Register.jsp\">Register</a></li>\r\n");
      out.write("  <li><a href=\"../logout\">Logout</a></li>\r\n");
      out.write("   \r\n");
      out.write(" \r\n");
      out.write("  </ul>\r\n");
      out.write("</nav>\r\n");
      out.write("<<center>\r\n");
      out.write(" <br><br><center style=\"margin-bottom: 4%;\">\r\n");
      out.write("    <form>\r\n");
      out.write("  <input type=\"text\" name=\"search\" placeholder=\"Enter Name..\">\r\n");
      out.write("  <input type=\"submit\" value=\"Search\" name=\"ButtonSearch\" >\r\n");
      out.write("</form></center> \r\n");
      out.write("\r\n");
      out.write("<div class=\"hamb\">\r\n");
      out.write("  <a href=\"#\"><i class=\"fa fa-bars\"></i></a>\r\n");
      out.write("</div>\r\n");
      out.write(" \r\n");
      out.write(" <!-------------------------------------------------Searched Data------------------------------->\r\n");
      out.write("    ");

      if(request.getParameter("ButtonSearch")!=null){
          String targetString=request.getParameter("search");
      
      out.write("\r\n");
      out.write("    <section>\r\n");
      out.write("        <center style=\"margin-top:2%; margin-bottom: 2%;\"><h1 style=\"color:#ff6666;font-family: 'Roboto Condensed', sans-serif;\">Results</h1></center>\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("               \r\n");
      out.write("\r\n");
      out.write("                ");

                    StudentOperation st = new StudentOperation();
                    List li = st.searchByName2(targetString);
                    ListIterator lit = li.listIterator();
                    while (lit.hasNext()) {
                        Student student = (Student) lit.next();
                
      out.write("\r\n");
      out.write("                <div class=\"box\">\r\n");
      out.write("                    <div class=\"content\">\r\n");
      out.write("                        <h3>Name : ");
      out.print(student.getName());
      out.write("</h3>\r\n");
      out.write("                        <h3>UserId : ");
      out.print(student.getUsername());
      out.write("</h3>\r\n");
      out.write("                        <h3>Account Type : ");
      out.print(student.getAccount());
      out.write("</h3>\r\n");
      out.write("                        <p><b>");
      out.print(student.getName());
      out.write("</b> is enrolled in our transportation management and pickup location is ");
      out.print(student.getAddress());
      out.write(" to College.</p>\r\n");
      out.write("                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                ");

                    }
                
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("            <hr noshade>\r\n");
      out.write("        ");

       }
    
      out.write("\r\n");
      out.write("   <!-------------------------------------------------Searched Data------------------------------->\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("   <section>\r\n");
      out.write("   \r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                ");

                    StudentOperation st = new StudentOperation();
                    List li = st.selectAllFaculty();
                    ListIterator lit = li.listIterator();
                    while (lit.hasNext()) {
                        Student student = (Student) lit.next();
                
      out.write("\r\n");
      out.write("                <div class=\"box\">\r\n");
      out.write("                    <div class=\"content\">\r\n");
      out.write("                        <h3>Name : ");
      out.print(student.getName());
      out.write("</h3>\r\n");
      out.write("                        <h3>UserId : ");
      out.print(student.getUsername());
      out.write("</h3>\r\n");
      out.write("                        <h3>Account Type : ");
      out.print(student.getAccount());
      out.write("</h3>\r\n");
      out.write("                        <p><b>");
      out.print(student.getName());
      out.write("</b> has work tirelessly to both raise his level of knowledge of a complex problem .</p>\r\n");
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
      out.write("<canvas id=\"bubble\"></canvas>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.js\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.10.3/jquery-ui.js\"></script>\r\n");
      out.write("<script src=\"js/jqry.js\"></script>\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
