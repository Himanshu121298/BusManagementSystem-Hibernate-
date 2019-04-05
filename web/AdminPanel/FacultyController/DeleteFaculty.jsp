<%-- 
    Document   : DeleteStudent
    Created on : Mar 30, 2019, 7:05:20 PM
    Author     : hp
--%>

<%@page import="Dao.StudentOperation"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            long id = Long.parseLong(request.getParameter("id"));
            StudentOperation so = new StudentOperation();
            boolean b=so.deleteinfo(id);
            if(b==true){
                out.println(b);
                response.sendRedirect("../FacultyInfo.jsp");
            }
            else{
                out.println(b);
                out.println("Wrong");
            }
        %>
    </body>
</html>
