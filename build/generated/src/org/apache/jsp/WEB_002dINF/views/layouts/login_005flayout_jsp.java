package org.apache.jsp.WEB_002dINF.views.layouts;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_005flayout_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("   \r\n");
      out.write("<head>\r\n");
      out.write("\t<title>Login : Vehicle Information Hub</title>\r\n");
      out.write("\t<meta http-equiv=\"content-type\" content=\"text/html; charset=iso-8859-1\" />\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/all.css\" />\r\n");
      out.write("\t\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    ");
      javaBeans.Layout layoutBean = null;
      layoutBean = (javaBeans.Layout) _jspx_page_context.getAttribute("layoutBean", PageContext.APPLICATION_SCOPE);
      if (layoutBean == null){
        throw new java.lang.InstantiationException("bean layoutBean not found within scope");
      }
      out.write("\r\n");
      out.write("    <div id=\"main\">\r\n");
      out.write("            <div id=\"header\"></div>\r\n");
      out.write("            <div id=\"middle\">\r\n");
      out.write("                    <div id=\"left-column\"></div>\r\n");
      out.write("                    <div id=\"center-column\">\r\n");
      out.write("                        <div class=\"top-bar\"></div><br />\r\n");
      out.write("                        <div style=\"position:absolute;  left: 27%;  top: 40%;  margin-left: -27px;  margin-top: -40px;\">\r\n");
      out.write("                            <center>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((javaBeans.Layout)_jspx_page_context.findAttribute("layoutBean")).getOutput())));
      out.write("</center>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"table\"></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div id=\"right-column\">\r\n");
      out.write("                            <strong class=\"h\">INFO</strong>\r\n");
      out.write("                            <div class=\"box\">Lorem ipsum lorem ipsum</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"footer\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
