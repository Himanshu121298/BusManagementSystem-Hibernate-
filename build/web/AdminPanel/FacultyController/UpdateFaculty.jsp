<%-- 
    Document   : UpdateStudent
    Created on : Mar 30, 2019, 7:05:03 PM
    Author     : hp
--%>

<%@page import="Dao.StudentOperation"%>
<%@page import="Bean.Student"%>
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
            StudentOperation st=new StudentOperation();
            Student student=st.selectStudent(id);
            if(student !=null){
        %>
        <section>
            <div class="container-fluid">
                <div class="container">
                    <div class="formBox">
                        <form action="../../FinalUpdate" method="post">
                            <h1> Faculty Update Form</h1>
                            <input type="hidden" value="<%=student.getS_id()%>" name="id" >
                            <div class="row">
                                <div class="col-sm-6">
                                    <div class="inputBox">
                                        <div class="inputText">Name</div>
                                        <input type="text" value="<%=student.getName()%>" name="name" class="input">
                                    </div>
                                </div>	
                                <div class="col-sm-6">
                                    <div class="inputBox">
                                        <div class="inputText">UserID</div>
                                        <input type="text" value="<%=student.getUsername()%>" name="username" class="input">
                                    </div>
                                </div>	
                            </div>

                            <div class="row">
                                <div class="col-sm-6">
                                    <div class="inputBox">
                                        <div class="inputText">Password</div>
                                        <input type="text" value="<%=student.getPassword()%>" name="password" class="input">
                                    </div>
                                </div>	
                                <div class="col-sm-6">
                                    <div class="inputBox">
                                        <div class="inputText">AccountType</div>
                                        <input type="text" value="<%=student.getAccount() %>" name="account" class="input">
                                    </div>
                                </div>	
                            </div>

                            <div class="row">
                                <div class="col-sm-12">
                                    <div class="inputBox">
                                        <div class="inputText">Address</div>
                                         <input type="text" value="<%=student.getAddress()%>"name="address" class="input">
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
