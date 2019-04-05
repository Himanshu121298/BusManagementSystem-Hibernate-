<%@page import="Bean.Student"%>
<%@page import="java.util.ListIterator"%>
<%@page import="java.util.List"%>
<%@page import="Dao.StudentOperation"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Admin | UserInfo</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
    
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link href="https://fonts.googleapis.com/css?family=Roboto+Condensed:300,300i,400,400i,700i" rel="stylesheet">
     
     <link rel="stylesheet" type="text/css" href="css/style.css">

</head>
<body>
    <nav role='navigation' id="mainnav">
    <br><br><br>
  <ul class="gap">  
    <li><a href="UserInfo.jsp">UserInfo</a></li>
    <li><a href="FacultyInfo.jsp">FacultyInfo</a></li>
    <li><a href="BusesInfo.jsp">BusesInfo</a></li>
    <li><a href="AddBus.jsp">Add Bus</a></li>
  <li><a href="Register.jsp">Register</a></li>
  <li><a href="../logout">Logout</a></li>
   
 
  </ul>
</nav>
  
 
<div class="hamb">
  <a href="#"><i class="fa fa-bars"></i></a>
</div>
<br><br><<center style="margin-bottom: 4%;">
    <form>
  <input type="text" name="search" placeholder="Enter Name..">
  <input type="submit" value="Search" name="ButtonSearch" >
</form></center>
<!-------------------------------------------------Searched Data------------------------------->
    <%
      if(request.getParameter("ButtonSearch")!=null){
          String targetString=request.getParameter("search");
      %>
    <section>
        <center style="margin-top:2%; margin-bottom: 2%;"><h1 style="color:#ff6666;font-family: 'Roboto Condensed', sans-serif;">Results</h1></center>
            <div class="container">
               

                <%
                    StudentOperation st = new StudentOperation();
                    List li = st.searchByName(targetString);
                    ListIterator lit = li.listIterator();
                    while (lit.hasNext()) {
                        Student student = (Student) lit.next();
                %>
                <div class="box">
                    <div class="content">
                        <h3>Name : <%=student.getName()%></h3>
                        <h3>UserId : <%=student.getUsername()%></h3>
                        <h3>Account Type : <%=student.getAccount()%></h3>
                        <p><b><%=student.getName()%></b> is enrolled in our transportation management and pickup location is <%=student.getAddress()%> to College.</p>
                        <a href="StudentController/UpdateStudent.jsp?id=<%=student.getS_id()%>">Update</a>
                        <a href="StudentController/DeleteStudent.jsp?id=<%=student.getS_id()%>">Delete</a>
                    </div>
                </div>
                <%
                    }
                %>
            </div>
        </section>
            <hr noshade>
        <%
       }
    %>
   <!-------------------------------------------------Searched Data------------------------------->
   <section>
   
            <div class="container">


                <%
                    StudentOperation st = new StudentOperation();
                    List li = st.selectAllStudents();
                    ListIterator lit = li.listIterator();
                    while (lit.hasNext()) {
                        Student student = (Student) lit.next();
                %>
                <div class="box">
                    <div class="content">
                        <h3>Name : <%=student.getName()%></h3>
                        <h3>UserId : <%=student.getUsername()%></h3>
                        <h3>Account Type : <%=student.getAccount()%></h3>
                        <p><b><%=student.getName()%></b> is enrolled in our transportation management and pickup location is <%=student.getAddress()%> to College.</p>
                        <a href="StudentController/UpdateStudent.jsp?id=<%=student.getS_id()%>">Update</a>
                        <a href="StudentController/DeleteStudent.jsp?id=<%=student.getS_id()%>">Delete</a>
                    </div>
                </div>
                <%
                    }
                %>
            </div>
        </section>


<canvas id="bubble"></canvas>

    <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.10.3/jquery-ui.js"></script>
<script src="js/jqry.js"></script>
  


</body>
</html>