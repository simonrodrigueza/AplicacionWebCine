package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelo.Pelicula;
import ModeloDAO.PeliculaDAO;
import java.util.Iterator;
import java.util.List;

public final class listar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("\r\n");
      out.write("        <title>Modificar Cartelera</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body style=\"background-color: #a1f299;\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <h1> Listado de películas en cartelera.</h1>\r\n");
      out.write("            <br>\r\n");
      out.write("            <br>\r\n");
      out.write("            <table class=\"table table-bordered\" style=\"  background-color: #fff;  border-collapse: collapse;\r\n");
      out.write("                   border-spacing: 0;\r\n");
      out.write("                   box-shadow: 0 2px 15px rgba(64,64,64,.7);\r\n");
      out.write("                   border-radius: 12px 12px 0 0;\">\r\n");
      out.write("                <thead style=\"background-color: #17a2b8;\" >\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th class=\"text-center\"><a class=\"btn btn-success\"href=\"Controlador?accion=add\">Agregar</a></th>\r\n");
      out.write("                        <th class=\"text-center\">ID</th>\r\n");
      out.write("                        <th class=\"text-center\">NOMBRE</th>\r\n");
      out.write("                        <th class=\"text-center\">DURACION</th>\r\n");
      out.write("                        <th class=\"text-center\">GENERO</th>\r\n");
      out.write("                        <th class=\"text-center\">AFORO</th>\r\n");
      out.write("                        <th class=\"text-center\">SALA</th>\r\n");
      out.write("                        <th class=\"text-center\">HORA</th>\r\n");
      out.write("                        <th class=\"text-center\">ACCIONES</th>   \r\n");
      out.write("                    </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("                ");

                    PeliculaDAO dao = new PeliculaDAO();
                    List<Pelicula> list = dao.listar();
                    Iterator<Pelicula> iter = list.iterator();
                    Pelicula p = null;
                    while (iter.hasNext()) {
                        p = iter.next();

                
      out.write("\r\n");
      out.write("                <tbody style=\"opacity: .9;\">\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td> </td>\r\n");
      out.write("                        <td>");
      out.print( p.getId());
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print( p.getNombre());
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print( p.getDuracion());
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print( p.getGenero());
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print( p.getAforo());
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print( p.getSala());
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print( p.getHora());
      out.write("</td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <a class=\"btn btn-warning\" href=\"Controlador?accion=editar&id=");
      out.print( p.getId());
      out.write("\">Editar</a>\r\n");
      out.write("                            <a class=\"btn btn-danger\" href=\"Controlador?accion=eliminar&id=");
      out.print( p.getId());
      out.write("\">Remove</a>\r\n");
      out.write("                           \r\n");
      out.write("                        </td>\r\n");
      out.write("\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    ");
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
