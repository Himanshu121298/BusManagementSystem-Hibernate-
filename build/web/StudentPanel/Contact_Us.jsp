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
        <section>
            <div class="container-fluid">
                <div class="container">
                    <div class="formBox">
                        <form action="../FormController" method="post">
                            <h1> Contact Us</h1>
                            
                            <div class="row">
                                <div class="col-sm-6">
                                    <div class="inputBox">
                                        <div class="inputText">Name</div>
                                        <input type="text" name="name" class="input">
                                    </div>
                                </div>	
                                <div class="col-sm-6">
                                    <div class="inputBox">
                                        <div class="inputText">UserID</div>
                                        <input type="text" name="username" class="input">
                                    </div>
                                </div>	
                            </div>

                            <div class="row">
                                <div class="col-sm-6">
                                    <div class="inputBox">
                                        <div class="inputText">Email</div>
                                        <input type="email" name="email" class="input">
                                    </div>
                                </div>	
                                <div class="col-sm-6">
                                    <div class="inputBox">
                                        <div class="inputText">Contact</div>
                                        <input type="number" name="Contact" class="input">
                                    </div>
                                </div>	
                            </div>

                            <div class="row">
                                <div class="col-sm-12">
                                    <div class="inputBox">
                                        <div class="inputText">Query</div>
                                         <input type="text" name="Queries" class="input">
                                    </div>
                                </div>	
                            </div>
                            <div class="row">
                                <div class="col-sm-12">
                                    <input type="submit" value="Submit" class="button">	
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
    </body>
</html>
