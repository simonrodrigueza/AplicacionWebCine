
<%@page import="Modelo.Pelicula"%>
<%@page import="ModeloDAO.PeliculaDAO"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>

        <title>Modificar Cartelera</title>
    </head>
    <body style="background-color: #a1f299;">

        <div class="container">
            <h1> Listado de películas en cartelera.</h1>
            <br>
            <br>
            <table class="table table-bordered" style="  background-color: #fff;  border-collapse: collapse;
                   border-spacing: 0;
                   box-shadow: 0 2px 15px rgba(64,64,64,.7);
                   border-radius: 12px 12px 0 0;">
                <thead style="background-color: #17a2b8;" >
                    <tr>
                        <th class="text-center"><a class="btn btn-success"href="Controlador?accion=add">Agregar</a></th>
                        <th class="text-center">ID</th>
                        <th class="text-center">NOMBRE</th>
                        <th class="text-center">DURACION</th>
                        <th class="text-center">GENERO</th>
                        <th class="text-center">AFORO</th>
                        <th class="text-center">SALA</th>
                        <th class="text-center">HORA</th>
                        <th class="text-center">ACCIONES</th>   
                    </tr>
                </thead>
                <%
                    PeliculaDAO dao = new PeliculaDAO();
                    List<Pelicula> list = dao.listar();
                    Iterator<Pelicula> iter = list.iterator();
                    Pelicula p = null;
                    while (iter.hasNext()) {
                        p = iter.next();

                %>
                <tbody style="opacity: .9;">
                    <tr>
                        <td> </td>
                        <td><%= p.getId()%></td>
                        <td><%= p.getNombre()%></td>
                        <td><%= p.getDuracion()%></td>
                        <td><%= p.getGenero()%></td>
                        <td><%= p.getAforo()%></td>
                        <td><%= p.getSala()%></td>
                        <td><%= p.getHora()%></td>
                        <td>
                            <a class="btn btn-warning" href="Controlador?accion=editar&id=<%= p.getId()%>">Editar</a>
                            <a class="btn btn-danger" href="Controlador?accion=eliminar&id=<%= p.getId()%>">Remove</a>
                           
                        </td>

                    </tr>
                    <%}%>

                </tbody>
            </table>
                    <a class="btn btn-success" href="index.jsp">Cerrar Sesión</a>
        </div>
    </body>
</html>
