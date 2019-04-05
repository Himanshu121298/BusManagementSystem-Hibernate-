<!DOCTYPE html>
<html lang="en" >

    <head>
        <meta charset="UTF-8">
        <title>Admin | Register</title>

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
                    <h1>REGISTER</h1>
                    <form action="../RegisterController" autocomplete="on" method="post">
                        <input type="text" placeholder="Name" id="name" name="name" required>
                        <input type="text" placeholder="Userame" id="username" name="username" required>
                        <input type="text" placeholder="Address" id="addrress" name="address" required>
                        <select name="account" style="width:310px;">
                            <option value="Student">Student</option>
                            <option value="Faculty">Faculty</option>
                            
                        </select>
                        <input type="password" placeholder="Password" id="password" name="password" required>
                        <input type="submit" value="Register">
                    </form>
                </div>
            </div>
        </div>
        <script type="text/javascript" src="js1/particles.js"></script>
        <script type="text/javascript" src="js1/app.js"></script>

        <script type="text/javascript" src="js1/style.js"></script>






    </body>

</html>
