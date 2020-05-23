package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link href=\"css/addcss.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <title>Añadir Película</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body style=\"background-color: #e84341;\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"contact-form\">\r\n");
      out.write("                <h1>Agregar Pelicula</h1>\r\n");
      out.write("\r\n");
      out.write("                <form id=\"form\"action=\"Controlador\">     \r\n");
      out.write("\r\n");
      out.write("                    <input id=\"nombre\" class=\"form-control\" type=\"text\" placeholder=\"Nombre \"name=\"txtNombre\"><br>\r\n");
      out.write("                    <input id=\"duracion\" class=\"form-control\" type=\"text\" placeholder=\"Duración\" name=\"txtDuracion\"><br>\r\n");
      out.write("                    <input  id=\"genero\"class=\"form-control\" type=\"text\" placeholder=\"Género\"name=\"txtGenero\"><br>\r\n");
      out.write("                    <input  id=\"aforo\" class=\"form-control\" type=\"text\"  placeholder=\"Aforo\" name=\"txtAforo\"><br>\r\n");
      out.write("                    <input id=\"sala\"class=\"form-control\" type=\"text\" placeholder=\"Sala\" name=\"txtSala\"><br>\r\n");
      out.write("                    <input id=\"hora\"class=\"form-control\" type=\"text\"  placeholder=\"Hora\" name=\"txtHora\"><br>\r\n");
      out.write("                    <input class=\"btn btn-primary\" type=\"submit\" name=\"accion\" value=\"Agregar\">\r\n");
      out.write("                    <a class=\"btn btn-primary\" href=\"Controlador?accion=listar\">Regresar</a>\r\n");
      out.write("\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <script>\r\n");
      out.write("            const nombre = document.getElementById(\"nombre\");\r\n");
      out.write("            const duracion = document.getElementById(\"duracion\");\r\n");
      out.write("            const genero = document.getElementById(\"genero\");\r\n");
      out.write("            const aforo = document.getElementById(\"aforo\");\r\n");
      out.write("            const sala = document.getElementById(\"sala\");\r\n");
      out.write("            const hora = document.getElementById(\"hora\");\r\n");
      out.write("            const form = document.getElementById(\"form\");\r\n");
      out.write("\r\n");
      out.write("            form.addEventListener(\"submit\", e => {\r\n");
      out.write("            if (nombre.value.length < 1) {\r\n");
      out.write("            alert(\"Llene el campo de nombre.\");\r\n");
      out.write("            }\r\n");
      out.write("            if (duracion.value.length < 1) {\r\n");
      out.write("            alert(\"Llene el campo de duracion.\");\r\n");
      out.write("            }\r\n");
      out.write("            if (genero.value.length < 1) {\r\n");
      out.write("            alert(\"Llene el campo de genero.\");\r\n");
      out.write("            }\r\n");
      out.write("            if (aforo.value.length < 1) {\r\n");
      out.write("                  alert(\"Llene el campo de aforo.\");\r\n");
      out.write("                  }\r\n");
      out.write("                    if (sala.value.length < 1) {\r\n");
      out.write("            alert(\"Llene el campo de sala.\");}\r\n");
      out.write("                    if (hora.value.length < 1) {\r\n");
      out.write("            alert(\"Llene el campo de hora.\");}\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
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
