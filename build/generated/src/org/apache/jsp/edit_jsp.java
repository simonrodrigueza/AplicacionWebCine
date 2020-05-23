package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelo.Pelicula;
import ModeloDAO.PeliculaDAO;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link href=\"css/addcss.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <title>Editar Película</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body style=\"background-color:#e1a7ec\";>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"col-lg-6\">\r\n");
      out.write("                ");

                    PeliculaDAO dao = new PeliculaDAO();
                    int id = Integer.parseInt((String) request.getAttribute("idpel"));
                    Pelicula p = (Pelicula) dao.list(id);
                
      out.write("\r\n");
      out.write("                <h1>Modificar Pelicula</h1>\r\n");
      out.write("                <form action=\"Controlador\">\r\n");
      out.write("\r\n");
      out.write("                    Nombre:<br>\r\n");
      out.write("                    <input class=\"form-control\" type=\"text\" name=\"txtNombre\" value=\"");
      out.print( p.getNombre());
      out.write("\"><br>\r\n");
      out.write("                    Duracion: <br>\r\n");
      out.write("                    <input class=\"form-control\" type=\"text\" name=\"txtDuracion\" value=\"");
      out.print( p.getDuracion());
      out.write("\" ><br>\r\n");
      out.write("                    Genero: <br>\r\n");
      out.write("                    <input class=\"form-control\" type=\"text\" name=\"txtGenero\" value=\"");
      out.print( p.getGenero());
      out.write("\"><br>\r\n");
      out.write("                    Aforo: <br>\r\n");
      out.write("                    <input class=\"form-control\" type=\"text\" name=\"txtAforo\" value=\"");
      out.print( p.getAforo());
      out.write("\"><br>\r\n");
      out.write("                    Sala: <br>\r\n");
      out.write("                    <input class=\"form-control\" type=\"text\" name=\"txtSala\" value=\"");
      out.print( p.getSala());
      out.write("\"><br>\r\n");
      out.write("                    Hora: <br>\r\n");
      out.write("                    <input class=\"form-control\" type=\"text\" name=\"txtHora\" value=\"");
      out.print( p.getHora());
      out.write("\"><br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <input type=\"hidden\" name=\"txtId\" value=\"");
      out.print( p.getId());
      out.write("\">\r\n");
      out.write("                    <input class=\"btn btn-primary\" type=\"submit\" name=\"accion\" value=\"Actualizar\"> \r\n");
      out.write("                    <a href=\"Controlador?accion=listar\">Regresar</a>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
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
