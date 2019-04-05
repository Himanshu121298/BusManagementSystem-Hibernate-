<!DOCTYPE html>
<html lang="en" >

    <head>
        <meta charset="UTF-8">
        <title>Project | Login</title>

        <script
            src="https://code.jquery.com/jquery-3.3.1.js"
        ></script>

        <link rel="stylesheet" href="css1/style.css">


    </head>

    <body>
        <div id="particles-js"></div>

        <div class="login-reg-panel">
            <div class="white-panel">
                <div class="login-show">
                    <h1>LOGIN</h1>
                    <div><h3 style="color:red; font-size: 18px; margin-left:4%; "><%if (request.getParameter("info") != null) {
                            out.println(request.getParameter("info"));
                        }%></h3></div>
                    <form action="login" method="post">
                        <input type="text" placeholder="Username" id="username" name="username" required>
                        <input type="password" placeholder="Password" id="password" name="password" required>
                        <select name="account" style="width:310px;">
                            <option value="Student">Student</option>
                            <option value="Faculty">Faculty</option>
                            <option value="Admin">Admin</option>
                        </select>
                        <input type="submit" value="Login">
                    </form>
                </div>
            </div>
        </div>
        <script type="text/javascript" src="js1/particles.js"></script>
        <script type="text/javascript" src="js1/app.js"></script>

        <script type="text/javascript" src="js1/style.js"></script>






    </body>

</html>
