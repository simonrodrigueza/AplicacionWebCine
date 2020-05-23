package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelo.Pelicula;
import ModeloDAO.PeliculaDAO;
import java.util.Iterator;
import java.util.List;

public final class reservar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/tablecss.css\" type=\"text/css\"/>\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"filter\">\r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("            \r\n");
      out.write("            <table>\r\n");
      out.write("                <thead>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th>ID</th>\r\n");
      out.write("                        <th>NOMBRE</th>\r\n");
      out.write("                        <th>DURACION</th>\r\n");
      out.write("                        <th>GENERO</th>\r\n");
      out.write("                        <th>AFORO</th>\r\n");
      out.write("                        <th>SALA</th>\r\n");
      out.write("                        <th>HORA</th>\r\n");
      out.write("                        <th>ACCIONES</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("                ");

                    PeliculaDAO dao=new PeliculaDAO();
                    List<Pelicula>list=dao.listar();
                    Iterator<Pelicula>iter=list.iterator();
                    Pelicula p=null;
                    while(iter.hasNext()){
                        p=iter.next();
                    
                
      out.write("\r\n");
      out.write("                <tbody>\r\n");
      out.write("                    <tr>\r\n");
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
      out.write("                            <a class=\"btn btn-warning\" href=\"Controlador?accion=reservar&id=");
      out.print( p.getId());
      out.write("&aforo=");
      out.print( p.getAforo());
      out.write("\">Reservar</a>\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    ");
}
      out.write("\r\n");
      out.write("                </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("\r\n");
      out.write("        \r\n");
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
