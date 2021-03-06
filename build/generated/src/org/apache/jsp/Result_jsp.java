package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.Iterator;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import Model.schedule;
import org.hibernate.cfg.Configuration;

public final class Result_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Result</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"header\">\n");
      out.write("            <h1>BUS MANAGEMENT</h1>\n");
      out.write("            <p> <input class=\"srch\"  type=\"text\" placeholder=\"Search\" name=\"search\" ></p>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div id=\"nav\">\n");
      out.write("            <div class=\"navbtn\">\n");
      out.write("                <a class=\"anc\" href=\"home.html\"> <button class =\"btn\">  Home</button></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"navbtn\">\n");
      out.write("                <a class=\"anc\" href=\"student.html\"><button class =\"btn\"> Profile</button></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"navbtn\">\n");
      out.write("                <a class=\"anc\" href=\"bus.html\"> <button class =\"btn\">Bus Info</button></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"navbtn\">\n");
      out.write("                <a class=\"anc\" href=\"driver.html\"> <button class =\"btn\">Driver Info</button></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"navbtn\">\n");
      out.write("                <a class=\"anc\" href=\"view.html\"> <button class =\"btn\">View All</button></a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <section>\n");
      out.write("            <!--for demo wrap-->\n");
      out.write("            <h1>Driver details</h1>\n");
      out.write("            <div class=\"tbl-header\">\n");
      out.write("                <table cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("\n");
      out.write("                            <th>BUS NUMBER</th>\n");
      out.write("                            <th>FROM</th>\n");
      out.write("                            <th>TO</th>\n");
      out.write("                            <th>VIA</th>\n");
      out.write("                            <th>TIME</th>\n");
      out.write("                            <th>DRIVER NAME</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"tbl-content\">\n");
      out.write("\n");
      out.write("                        <tbody>\n");
      out.write("                            ");

                                String number, pick, drop, route, time, driver;
                                List<schedule> list = (List<schedule>) request.getAttribute("res");

                                for (schedule a : list) {

                                    number = a.getBusnumber();
                                    pick = a.getPick();
                                    drop = a.getDropp();
                                    route = a.getRoute();
                                    time = a.getTime();
                                    driver = a.getDriver();
                            
      out.write("        \n");
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td>");
      out.print(number);
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(pick);
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(drop);
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(route);
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(time);
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(driver);
      out.write("</td>\n");
      out.write("                            </tr>\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <button class=\"btn\" type=\"submit\">back</button>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
