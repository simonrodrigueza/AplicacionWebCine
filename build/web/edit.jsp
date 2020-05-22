
<%@page import="Modelo.Pelicula"%>
<%@page import="ModeloDAO.PeliculaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <div class="col-lg-6">
                <%
                    PeliculaDAO dao = new PeliculaDAO();
                    int id = Integer.parseInt((String) request.getAttribute("idpel"));
                    Pelicula p = (Pelicula) dao.list(id);
                %>
                <h1>Modificar Pelicula</h1>
                <form action="Controlador">

                    Nombre:<br>
                    <input class="form-control" type="text" name="txtNombre" value="<%= p.getNombre()%>"><br>
                    Duracion: <br>
                    <input class="form-control" type="text" name="txtDuracion" value="<%= p.getDuracion()%>" ><br>
                    Genero: <br>
                    <input class="form-control" type="text" name="txtGenero" value="<%= p.getGenero()%>"><br>
                    Aforo: <br>
                    <input class="form-control" type="text" name="txtAforo" value="<%= p.getAforo()%>"><br>
                    Sala: <br>
                    <input class="form-control" type="text" name="txtSala" value="<%= p.getSala()%>"><br>
                    Hora: <br>
                    <input class="form-control" type="text" name="txtHora" value="<%= p.getHora()%>"><br>



                    <input type="hidden" name="txtId" value="<%= p.getId()%>">
                    <input class="btn btn-primary" type="submit" name="accion" value="Actualizar"> 
                    <a href="Controlador?accion=listar">Regresar</a>
                </form>
            </div>

        </div>
    </body>
</html>
