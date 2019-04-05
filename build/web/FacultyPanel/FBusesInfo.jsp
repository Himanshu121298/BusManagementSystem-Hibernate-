<%@page import="Bean.Buses"%>
<%@page import="Dao.BusOperation"%>
<%@page import="Bean.Student"%>
<%@page import="java.util.ListIterator"%>
<%@page import="java.util.List"%>
<%@page import="Dao.StudentOperation"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Faculty | BusesInfo</title>
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">

        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link href="https://fonts.googleapis.com/css?family=Roboto+Condensed:300,300i,400,400i,700i" rel="stylesheet">

        <link rel="stylesheet" type="text/css" href="css/style.css">

    </head>
    <body>
        <nav role='navigation' id="mainnav">
            <br><br><br>
            <ul class="gap">
                <li><a href="FUserInfo.jsp">UserInfo</a></li>
                <li><a href="FFacultyInfo.jsp">FacultyInfo</a></li>
                <li><a href="FBusesInfo.jsp">BusesInfo</a></li>
                <li><a href="../logout">Logout</a></li>


            </ul>
        </nav>
        <<center>
        <br><br><center style="margin-bottom: 4%;">
            <form method="post" autocomplete="off">
                <input type="text" name="search" placeholder="Enter Name..">
                <input type="submit" value="Search" name="ButtonSearch" >
            </form></center>

        <div class="hamb">
            <a href="#"><i class="fa fa-bars"></i></a>
        </div>

        <!------------------------------------Searched Data------------------------------------------->
        <%
            if (request.getParameter("ButtonSearch") != null) {
                String targetString = request.getParameter("search");
        %>
        <section>
            <center style="margin-top:2%; margin-bottom: 2%;"><h1 style="color:#ff6666;font-family: 'Roboto Condensed', sans-serif;">Results</h1></center>
            <div class="container">


                <%
                    BusOperation st = new BusOperation();
                    List li = st.searchByRoute(targetString);
                    ListIterator lit = li.listIterator();
                    while (lit.hasNext()) {
                        Buses bus = (Buses) lit.next();
                %>
                <div class="box">
                    <div class="content">
                        <h3>Bus Number : <%=bus.getBusNo()%></h3>
                        <h3>Bus Time : <%=bus.getBusTime()%></h3>
                        <h3>Driver Name : <%=bus.getDriverName()%></h3>
                        <h3>Contact : <%=bus.getDriverContact()%></h3><br>
                        <p>This Bus follow the route from College to <%=bus.getBusRoute()%></p>
                        <a href="FBusController/UpdateBus.jsp?id=<%=bus.getB_id()%>">Update</a>
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
        <!------------------------------------Searched Data------------------------------------------->


        <section>

            <div class="container">


                <%
                    BusOperation st = new BusOperation();
                    List li = st.selectAllBuses();
                    ListIterator lit = li.listIterator();
                    while (lit.hasNext()) {
                        Buses bus = (Buses) lit.next();
                %>
                <div class="box">
                    <div class="content">
                        <h3>Bus Number : <%=bus.getBusNo()%></h3>
                        <h3>Bus Time : <%=bus.getBusTime()%></h3>
                        <h3>Driver Name : <%=bus.getDriverName()%></h3>
                        <h3>Contact : <%=bus.getDriverContact()%></h3><br>
                        <p>This Bus follow the route from College to <%=bus.getBusRoute()%></p>
                        <a href="FBusController/UpdateBus.jsp?id=<%=bus.getB_id()%>">Update</a>
                        
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