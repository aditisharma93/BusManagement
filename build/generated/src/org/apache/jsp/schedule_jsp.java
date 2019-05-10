package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import Model.schedule;
import org.hibernate.cfg.Configuration;

public final class schedule_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title> Schedule</title>\n");
      out.write("  <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("<style>\n");
      out.write("\n");
      out.write("h1{\n");
      out.write("  font-size: 30px;\n");
      out.write("  color: #ff9900;\n");
      out.write("  text-transform: uppercase;\n");
      out.write("  font-weight: 300;\n");
      out.write("  text-align: center;\n");
      out.write("  margin-bottom: 15px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"header\">\n");
      out.write("    <h1>BUS MANAGEMENT</h1>\n");
      out.write("       <p> <input class=\"srch\"  type=\"text\" placeholder=\"Search\" name=\"search\" ></p>\n");
      out.write("</div>\n");
      out.write("<div id=\"nav\">\n");
      out.write("      <div class=\"navbtn\">\n");
      out.write("         <a class=\"anc\" href=\"StudentHome.html\"> <button class =\"btn\">  Home</button></a>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"navbtn\">\n");
      out.write("        <a class=\"anc\" href=\"profile.html\"><button class =\"btn\"> Profile</button></a>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"navbtn\">\n");
      out.write("        <a class=\"anc\" href=\"Schedule.jsp\"> <button class =\"btn\">Bus Info</button></a>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"navbtn\">\n");
      out.write("        <a class=\"anc\" href=\"driver.html\"> <button class =\"btn\">Driver Info</button></a>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"navbtn\">\n");
      out.write("        <a class=\"anc\" href=\"view.jsp\"> <button class =\"btn\">View All</button></a>\n");
      out.write("      </div>\n");
      out.write("</div>\n");
      out.write(" <section>\n");
      out.write("            <!--for demo wrap-->\n");
      out.write("            <h1>Driver details</h1>\n");
      out.write("            <div class=\"tbl-header\">\n");
      out.write("                <table>\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>      \n");
      out.write("                            <th>BUS NUMBER</th>\n");
      out.write("                            <th>FROM</th>\n");
      out.write("                            <th>TO</th>\n");
      out.write("                            <th>ROUTE</th>\n");
      out.write("                            <th>TIME</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        ");

                            String number, pick, drop, route, time;
                            Configuration cf = null;
                            SessionFactory sf = null;
                            Session s = null;
                            schedule sch = null;
                            try {
                                cf = new Configuration();
                                cf.configure();
                                sf = cf.buildSessionFactory();
                                s = sf.openSession();
                                Query q = s.createQuery("from schedule");
                                Iterator it = q.iterate();
                                while (it.hasNext()) {

                                    sch = (schedule) it.next();
                                    number = sch.getBusnumber();
                                    pick = sch.getPick();
                                    drop = sch.getDropp();
                                    route = sch.getRoute();
                                    time = sch.getTime();
                                    System.out.println(number);

                        
      out.write("        \n");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(number);
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(pick);
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(drop);
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(route);
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(time);
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");

                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        
      out.write("      \n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("</body>\n");
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
