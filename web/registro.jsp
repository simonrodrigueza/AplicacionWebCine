<%-- 
    Document   : registro
    Created on : 22/05/2020, 10:35:35 AM
    Author     : Santiago
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="Principal/plugins/css/loginStyle.css" type="text/css"/>
        <script type="text/javascript" src="validacion.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar usuario</title>
    </head>
    <body>
        <div class="hero"> 
            <div  id="formboxx" class="form-box">
                <div class="button-box">
                    <div id="btn"></div>
                    <a  href="login.jsp" class="linkInicio">Ingresar</a>                     
                    <button type="button" class="toggle-btn">Registrarse</button>

                </div>

                <form action="nuevousuario" method="post" id="login" class="input-group">
                    <input  id="nombre" type="text" class="input-field"name="usuario" placeholder="Establezca Usuario"/><br>
                    <input id="pass" type="password" class="input-field" name="pass" placeholder="Establezca Contraseña"/><br>
                    <input type="submit" class="submit-btn" value="Registrar"/>
                </form>
            </div>
        </div>
        <script>
            const nombre = document.getElementById("nombre");
            const pass = document.getElementById("pass");
            const login = document.getElementById("login");

            login.addEventListener("submit", e => {
                if (nombre.value.length < 1) {
                    alert("Llene el campo de usuario.");
                }
                if (pass.value.length < 1) {
                    alert("Llene el campo de contraseña.");
                } else
                {
                    alert("Registro exitoso.");
                }
            });
        </script>
    </body>

</html>
