<!DOCTYPE html>
<html lang="en" >

    <head>
        <meta charset="UTF-8">
        <title>Admin | Add Bus</title>

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
                    <h1 style="margin-left:5%;">Add Bus</h1>
                    <form action="../BusController" autocomplete="on" method="post">
                        <input type="text" placeholder="Bus Number" id="BusNo" name="BusNo" required>
                        <input type="text" placeholder="Bus Route" id="BusRoute" name="BusRoute" required>
                        <input type="text" placeholder="Timing" id="BusTime" name="BusTime" required>
                        <input type="text" placeholder="Driver Name" id="DriverName" name="DriverName" required>
                        <input type="text" placeholder="Contact" id="DriverContact" name="DriverContact" required>
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
