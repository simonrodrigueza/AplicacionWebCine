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
                    <input type="text" class="input-field"name="usuario" placeholder="Establezca Usuario"/><br>
                    <input type="password" class="input-field" name="pass" placeholder="Establezca Contraseña"/><br>
                    <input type="submit" class="submit-btn" value="Registrar"/>
                </form>
            </div>
        </div>
    </body>
</html>
