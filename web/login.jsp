<%-- 
    Document   : login
    Created on : 22/05/2020, 10:28:00 AM
    Author     : Santiago
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <link rel="stylesheet" href="Principal/plugins/css/loginStyle.css" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Iniciar sesión</title>
    </head>
    <body>
        <div class="hero"> 
            <div  id="formboxx" class="form-box">
                <div class="button-box">
                    <div id="btn"></div>                    
                    <button type="button" class="toggle-btn">Ingresar</button>
                    <a href="registro.jsp" class="linkregistro">Registrarse</a>
                </div>
                <form action="iniciar" method="post" id="login" class="input-group" onsubmit="func()">
                    <input id="campoUsuario"type="text" class="input-field" placeholder="Usuario" name="usuario"/><br>
                    <input  id="password" type="password" class="input-field" placeholder="Contraseña" name="pass"/><br>
                    <input type="submit" class="submit-btn" value="Iniciar sesión"/>            
                </form>
            </div>
        </div>
        <script>
            const nombre = document.getElementById("campoUsuario");
            const pass = document.getElementById("password");
            const login = document.getElementById("login");

            login.addEventListener("submit", e => {
                if (nombre.value.length < 1) {
                    alert("Llene el campo de usuario.");
                }
                if(pass.value.length < 1){
                    alert("Llene el campo de contraseña.");
                }
            });
        </script>
    </body>

</html>
