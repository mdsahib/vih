package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<form method=\"POST\">\n");
      out.write("    <table class=\"listing form\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("        <thead>\n");
      out.write("            <tr>\n");
      out.write("                Verify ID :\n");
      out.write("            </tr>\n");
      out.write("        </thead>\n");
      out.write("        <tbody>\n");
      out.write("            <tr>\n");
      out.write("                <td class=\"first\" width=\"100\" align=\"left\">Registration Number</td>\n");
      out.write("                <td class=\"first\" width=\"100\" align=\"left\"><input type=\"text\" name=\"registration_id\" value=\"\" /></td>\n");
      out.write("                <td class=\"first\" width=\"100\" align=\"left\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td class=\"first\" width=\"100\" align=\"left\">Driving License ID</td>\n");
      out.write("                <td class=\"first\" width=\"100\" align=\"left\"><input type=\"text\" name=\"driving_id\" value=\"\" /></td>\n");
      out.write("                <td class=\"first\" width=\"100\" align=\"left\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td class=\"first\" width=\"100\" align=\"left\">Fitness Number</td>\n");
      out.write("                <td class=\"first\" width=\"100\" align=\"left\"><input type=\"text\" name=\"registration_id\" value=\"\" /></td>\n");
      out.write("                <td class=\"first\" width=\"100\" align=\"left\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td class=\"first\" width=\"100\" align=\"left\">Fitness Certificate Number</td>\n");
      out.write("                <td class=\"first\" width=\"100\" align=\"left\"><input type=\"text\" name=\"fitness_id\" value=\"\" /></td>\n");
      out.write("                <td class=\"first\" width=\"100\" align=\"left\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td></td>\n");
      out.write("                <td><input type=\"submit\" value=\"Verify\" /></td>\n");
      out.write("                <td></td>\n");
      out.write("            </tr>\n");
      out.write("        </tbody>\n");
      out.write("    </table>\n");
      out.write("</form>\n");
      out.write("\n");
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
