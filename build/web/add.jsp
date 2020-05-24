<%-- 
    Document   : add
    Created on : 30-ago-2018, 19:58:16
    Author     : Joel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="css/addcss.css" rel="stylesheet" type="text/css"/>
        <title>Añadir Película</title>
        <script src="js/validar.js"></script>
    </head>
    <body style="background-color: #e84341;">
        <div class="container">
            <div class="contact-form">
                <h1>Agregar Pelicula</h1>

                <form id="form"action="Controlador" onsubmit="return validarAforoNegativo();">     

                    <input id="nombre" class="form-control" type="text" placeholder="Nombre "name="txtNombre"><br>
                    <input id="duracion" class="form-control" type="text" placeholder="Duración" name="txtDuracion"><br>
                    <input  id="genero" class="form-control" type="text" placeholder="Género"name="txtGenero"><br>
                    <input  id="aforo" class="form-control" type="number"  placeholder="Aforo" name="txtAforo"><br>
                    <input id="sala"class="form-control" type="text" placeholder="Sala" name="txtSala"><br>
                    <input id="hora"class="form-control" type="text"  placeholder="Hora" name="txtHora"><br>
                    <input class="btn btn-primary" type="submit" name="accion" value="Agregar">
                    <a class="btn btn-primary" href="Controlador?accion=listar">Regresar</a>

                </form>
            </div>
        </div>
        <script>
            const nombre = document.getElementById("nombre");
            const duracion = document.getElementById("duracion");
            const genero = document.getElementById("genero");
            const aforo = document.getElementById("aforo");
            const sala = document.getElementById("sala");
            const hora = document.getElementById("hora");
            const form = document.getElementById("form");

            form.addEventListener("submit", e => {
                if (nombre.value.length < 1) {
                    alert("Llene el campo de nombre.");
                }
                if (duracion.value.length < 1) {
                    alert("Llene el campo de duracion.");
                }
                if (genero.value.length < 1) {
                    alert("Llene el campo de genero.");
                }
                if (aforo.value.length < 1) {
                    alert("Llene el campo de aforo.");
                }
                if (sala.value.length < 1) {
                    alert("Llene el campo de sala.");
                }
                if (hora.value.length < 1) {
                    alert("Llene el campo de hora.");
                }
            });
        </script>

    </div>
</body>
</html>
