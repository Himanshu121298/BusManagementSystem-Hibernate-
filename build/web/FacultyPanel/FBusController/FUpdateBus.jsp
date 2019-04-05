<%-- 
    Document   : UpdateStudent
    Created on : Mar 30, 2019, 7:05:03 PM
    Author     : hp
--%>

<%@page import="Dao.BusOperation"%>
<%@page import="Bean.Buses"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Project | Update</title>

        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="style1.css">
    </head>
    <body>
        <%
            if(request.getParameter("id")!=null){
            long id=Long.parseLong(request.getParameter("id"));
            BusOperation st=new BusOperation();
            Buses bus=st.selectBuses(id);
            if(bus !=null){
        %>
        <section>
            <div class="container-fluid">
                <div class="container">
                    <div class="formBox">
                        <form action="../../FBusUpdate" method="post">
                            <h1> Bus Update Form</h1>
                            <input type="hidden" value="<%=bus.getB_id()%>" name="id" >
                            <div class="row">
                                <div class="col-sm-6">
                                    <div class="inputBox">
                                        <div class="inputText">Bus Number</div>
                                        <input type="text" value="<%=bus.getBusNo()%>" name="BusNo" class="input" readonly>
                                    </div>
                                </div>	
                                <div class="col-sm-6">
                                    <div class="inputBox">
                                        <div class="inputText">Bus Time</div>
                                        <input type="text" value="<%=bus.getBusTime()%>" name="BusTime" class="input">
                                    </div>
                                </div>	
                            </div>

                            <div class="row">
                                <div class="col-sm-6">
                                    <div class="inputBox">
                                        <div class="inputText">Driver Name</div>
                                        <input type="text" value="<%=bus.getDriverName()%>" name="DriverName" class="input">
                                    </div>
                                </div>	
                                <div class="col-sm-6">
                                    <div class="inputBox">
                                        <div class="inputText">Contact</div>
                                        <input type="text" value="<%=bus.getDriverContact() %>" name="DriverContact" class="input">
                                    </div>
                                </div>	
                            </div>
                         
                            <div class="row">
                                <div class="col-sm-12">
                                    <div class="inputBox">
                                        <div class="inputText">Address</div>
                                         <input type="text" value="<%=bus.getBusRoute()%>"name="BusRoute" class="input">
                                    </div>
                                </div>	
                            </div>
                            <div class="row">
                                <div class="col-sm-12">
                                    <input type="submit" value="Update" class="button">	
                                </div>	
                            </div>
                        </form>

                    </div>
                </div>
            </div>
        </section>
        <script src="https://code.jquery.com/jquery-3.2.1.js"></script>
        <script type="text/javascript">
            $(".input").focus(function () {
                $(this).parent().addClass("focus");
            }).blur(function () {
                if ($(this).val() === '') {
                    $(this).parent().removeClass("focus");
                }
            })
        </script>
        <%
            }}
else{
out.println("Select");
}
        %>
    </body>
</html>
