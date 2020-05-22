
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
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <h1>Peliculas</h1>
            <a class="btn btn-success" href="Controlador?accion=add">Agregar Nuevo</a>
            <br>
            <br>
            <table class="table table-bordered">
                <thead>
                    <tr>
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
                    PeliculaDAO dao=new PeliculaDAO();
                    List<Pelicula>list=dao.listar();
                    Iterator<Pelicula>iter=list.iterator();
                    Pelicula p=null;
                    while(iter.hasNext()){
                        p=iter.next();
                    
                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%= p.getId()%></td>
                        <td class="text-center"><%= p.getNombre()%></td>
                        <td class="text-center"><%= p.getDuracion()%></td>
                        <td class="text-center"><%= p.getGenero()%></td>
                        <td class="text-center"><%= p.getAforo()%></td>
                        <td class="text-center"><%= p.getSala()%></td>
                        <td class="text-center"><%= p.getHora()%></td>
                        <td class="text-center">
                            <a class="btn btn-warning" href="Controlador?accion=editar&id=<%= p.getId()%>">Editar</a>
                            <a class="btn btn-danger" href="Controlador?accion=eliminar&id=<%= p.getId()%>">Remove</a>
                            <a class="btn btn-warning" href="Controlador?accion=reservar&id=<%= p.getId()%>&aforo=<%= p.getAforo()%>">Reservar</a>
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>

        </div>
    </body>
</html>
