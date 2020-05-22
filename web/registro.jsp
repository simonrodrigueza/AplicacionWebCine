<%-- 
    Document   : registro
    Created on : 22/05/2020, 10:35:35 AM
    Author     : Santiago
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar usuario</title>
    </head>
    <body>
        <h1>Formulario de registro</h1>
        <form action="nuevousuario" method="post">
            <label>Usuario</label>
            <input type="text" name="usuario"/><br>
            <label>Contraseña</label>
            <input type="password" name="pass"/><br>
            <INPUT TYPE="radio" name="command" value="0"/>Run
            <INPUT TYPE="radio" NAME="command" VALUE="1"/>Walk
            <input type="submit" value="Registrar"/>
        </form>
    </body>
</html>
