
<%@page import="Modelo.Pelicula"%>
<%@page import="ModeloDAO.PeliculaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="css/addcss.css" rel="stylesheet" type="text/css"/>
        <title>Editar Película</title>
    </head>
    <body style="background-color:#e1a7ec;">
        <div class="container">
            <div class="contact-form">
                <%
                    PeliculaDAO dao = new PeliculaDAO();
                    int id = Integer.parseInt((String) request.getAttribute("idpel"));
                    Pelicula p = (Pelicula) dao.list(id);
                %>
                <h1>Modificar Pelicula</h1>
                <form id="form" action="Controlador">

                    <input id="nombre" placeholder="Nombre" class="form-control" type="text" name="txtNombre" value="<%= p.getNombre()%>"><br>
                    <input id="duracion" placeholder="Duración" class="form-control" type="text" name="txtDuracion" value="<%= p.getDuracion()%>" ><br>
                    <input id="genero" placeholder="Género" class="form-control" type="text" name="txtGenero" value="<%= p.getGenero()%>"><br>
                    <input id="aforo" placeholder="Aforo" class="form-control" type="text" name="txtAforo" value="<%= p.getAforo()%>"><br>
                    <input  id="sala" placeholder="Sala" class="form-control" type="text" name="txtSala" value="<%= p.getSala()%>"><br>               
                    <input id="hora" placeholder="Hora" class="form-control" type="text" name="txtHora" value="<%= p.getHora()%>"><br>
                    <input type="hidden" name="txtId" value="<%= p.getId()%>">
                    <input class="btn btn-primary" type="submit" name="accion" value="Actualizar"> 
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
            alert("Llene el campo de sala.");}
                    if (hora.value.length < 1) {
            alert("Llene el campo de hora.");}
            });
        </script>
    </body>
</html>
