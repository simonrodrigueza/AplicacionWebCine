<%-- 
    Document   : login
    Created on : 22/05/2020, 10:28:00 AM
    Author     : Santiago
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Iniciar sesión</title>
    </head>
    <body>
        <h1>Iniciar sesión</h1>
        <form action="iniciar" method="post">
            <label>Nombre</label>
            <input type="text" name="usuario"/><br>
            <label>Contraseña</label>
            <input type="password" name="pass"/><br>
            <input type="submit" value="Iniciar sesión"/>            
        </form>
        <label>Registrar usuario: </label><a href="registro.jsp">Registrar</a>
    </body>
</html>
