package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"Principal/plugins/css/loginStyle.css\" type=\"text/css\"/>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Iniciar sesión</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"hero\"> \r\n");
      out.write("            <div  id=\"formboxx\" class=\"form-box\">\r\n");
      out.write("                <div class=\"button-box\">\r\n");
      out.write("                    <div id=\"btn\"></div>                    \r\n");
      out.write("                    <button type=\"button\" class=\"toggle-btn\">Ingresar</button>\r\n");
      out.write("                    <a href=\"registro.jsp\" class=\"linkregistro\">Registrarse</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <form action=\"iniciar\" method=\"post\" id=\"login\" class=\"input-group\" onsubmit=\"func()\">\r\n");
      out.write("                    <input id=\"campoUsuario\"type=\"text\" class=\"input-field\" placeholder=\"Usuario\" name=\"usuario\"/><br>\r\n");
      out.write("                    <input  type=\"password\" class=\"input-field\" placeholder=\"Contraseña\" name=\"pass\"/><br>\r\n");
      out.write("                    <input type=\"submit\" class=\"submit-btn\" value=\"Iniciar sesión\"/>            \r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <script>\r\n");
      out.write("            const nombre = document.getElementById(\"campoUsuario\");\r\n");
      out.write("            const pass = document.getElementById(\"password\");\r\n");
      out.write("            const login = document.getElementById(\"login\");\r\n");
      out.write("\r\n");
      out.write("            login.addEventListener(\"submit\", e => {\r\n");
      out.write("                if (nombre.value.length < 1) {\r\n");
      out.write("                    alert(\"Llene el campo de usuario.\");\r\n");
      out.write("                }\r\n");
      out.write("                if(pass.value.length < 1){\r\n");
      out.write("                    alert(\"Llene el campo de contraseña.\");\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
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
