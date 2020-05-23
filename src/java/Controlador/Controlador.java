package Controlador;

import Modelo.Pelicula;
import ModeloDAO.PeliculaDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Controlador extends HttpServlet {

    String listar = "listar.jsp";
    String add = "add.jsp";
    String edit = "edit.jsp";
    String reservar = "reservar.jsp";
    Pelicula p = new Pelicula();
    PeliculaDAO dao = new PeliculaDAO();
    int id;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acceso = "";
        String action = request.getParameter("accion");
        if (action.equalsIgnoreCase("listar")) {
            acceso = listar;
        } else if (action.equalsIgnoreCase("add")) {
            acceso = add;
        } else if (action.equalsIgnoreCase("Agregar")) {
            String nombre = request.getParameter("txtNombre");
            String duracion = request.getParameter("txtDuracion");
            String genero = request.getParameter("txtGenero");
            int aforo = Integer.parseInt(request.getParameter("txtAforo"));
            String sala = request.getParameter("txtSala");
            String hora = request.getParameter("txtHora");
            p.setNombre(nombre);
            p.setDuracion(duracion);
            p.setGenero(genero);
            p.setAforo(aforo);
            p.setSala(sala);
            p.setHora(hora);
            dao.add(p);
            acceso = listar;
        } else if (action.equalsIgnoreCase("editar")) {
            request.setAttribute("idpel", request.getParameter("id"));
            acceso = edit;
        } else if (action.equalsIgnoreCase("Actualizar")) {
            id = Integer.parseInt(request.getParameter("txtId"));
            String nombre = request.getParameter("txtNombre");
            String duracion = request.getParameter("txtDuracion");
            String genero = request.getParameter("txtGenero");
            int aforo = Integer.parseInt(request.getParameter("txtAforo"));
            String sala = request.getParameter("txtSala");
            String hora = request.getParameter("txtHora");
            p.setId(id);
            p.setNombre(nombre);
            p.setDuracion(duracion);
            p.setGenero(genero);
            p.setAforo(aforo);
            p.setSala(sala);
            p.setHora(hora);
            dao.edit(p);
            acceso = listar;
        } else if (action.equalsIgnoreCase("eliminar")) {
            id = Integer.parseInt(request.getParameter("id"));
            p.setId(id);
            dao.eliminar(id);
            acceso = listar;
        } else if (action.equalsIgnoreCase("reservar")) {
            id = Integer.parseInt(request.getParameter("id"));
            int aforo = Integer.parseInt(request.getParameter("aforo"));
            p.setId(id);
            p.setAforo(aforo);
            dao.reserve(p);
            acceso = reservar;
        }
        RequestDispatcher vista = request.getRequestDispatcher(acceso);
        vista.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
