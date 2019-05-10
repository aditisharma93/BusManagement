package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Search_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title> Layout</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"header\">\n");
      out.write("            <h1>BUS MANAGEMENT</h1>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <div id=\"nav\">\n");
      out.write("            <div class=\"navbtn\">\n");
      out.write("                <a class=\"anc\" href=\"StudentHome.jsp\"> <button class =\"btn\">  Home</button></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"navbtn\">\n");
      out.write("                <a class=\"anc\" href=\"profile.jsp\"><button class =\"btn\"> Profile</button></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"navbtn\">\n");
      out.write("                <a class=\"anc\" href=\"schedule.jsp\"> <button class =\"btn\">Bus Info</button></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"navbtn\">\n");
      out.write("                <a class=\"anc\" href=\"driver.jsp\"> <button class =\"btn\">Driver Info</button></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"navbtn\">\n");
      out.write("                <a class=\"anc\" href=\"ViewAll.jsp\"> <button class =\"btn\">View All</button></a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div style=\" font-size: 30px;\n");
      out.write("             color: #ff9900;\n");
      out.write("             text-transform: uppercase;\n");
      out.write("             font-weight: 300;\n");
      out.write("             text-align: center;\n");
      out.write("             margin-bottom: 15px;\">\n");
      out.write("            <h1> Search</h1>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"container1\">\n");
      out.write("            <div class = \"id\">\n");
      out.write("                <form action=\"Id\">\n");
      out.write("                <p><h1><img src = \"images/search.png\" class = \"img\"> Search By Id</h1>\n");
      out.write("                <h3>Search the bus details by Id</h3>\n");
      out.write("                <p> <input class=\"input\"  type=\"text\" placeholder=\"Enter id\" name=\"busno\" ></p>\n");
      out.write("                 <button class =\"btn\"> Search</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div class = \"route\">\n");
      out.write("                <form action=\"Search\">\n");
      out.write("                    <p><h1><img src = \"images/search.png\" class = \"img\"> Search By Route </h1>\n");
      out.write("                    <h3> Search here by route</h3>\n");
      out.write("                    <p> <input class=\"input\"  type=\"text\" placeholder=\"Enter route\" name=\"route\" ></p>\n");
      out.write("                    <button class =\"btn\"> Search</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div class = \"details\">\n");
      out.write("                <form action=\"details\">\n");
      out.write("                <p><h1><img src = \"images/search.png\" class = \"img\"> All Details </h1>\n");
      out.write("                <h3> You can Search all the Schedule here</h3>\n");
      out.write("                <input class=\"input\"  type=\"text\" placeholder=\"View all\" name=\"name\" >\n");
      out.write("                <button class =\"btn\"> Search</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <hr size=\"4px\" width=\"100%\" align=\"center\" noshade color=\"#ff9900\">\n");
      out.write("        <div  id=\"footer\">\n");
      out.write("            <div class=\"flft\">\n");
      out.write("                <h2>CONTACT US</h2>\n");
      out.write("                <p> CHITKARA UNIVERSITY</p>\n");
      out.write("                <p>BADDI, Himachal Pradesh</p>\n");
      out.write("                <br/>\n");
      out.write("                <p>890-545-4567</p> \n");
      out.write("                <p><u>abc@chitkarauniversity.edu.in</u></p>\n");
      out.write("                <p><u>www.chitkarauniversity.edu.in</u></p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"frgt\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><a class=\"anc\" href=\"#home.html\"><u>Home</u></a></li>\n");
      out.write("                    <li><a class=\"anc\" href=\"#home.html\"><u>Profile</u></a> |</li> \n");
      out.write("                    <li><a class=\"anc\" href=\"#home.html\"><u>Driver Info</u></a> |</li>\n");
      out.write("                    <li><a class=\"anc\" href=\"#home.html\"><u>Schedule</u></a> |</li>\n");
      out.write("                    <li> <a class=\"anc\" href=\"#home.html\"><u>View All</u></a> |</li>\n");
      out.write("                    <li> <a class=\"anc\" href=\"#home.html\"><u>Bus Info</u></a> |</li>\n");
      out.write("                    <li><a class=\"anc\" href=\"#home.html\"><u>Search</u></a>|</li>\n");
      out.write("                </ul>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a class=\"anc\" href=\"#home.html\"><u>About us</u></a></li> \n");
      out.write("                    <li><a class=\"anc\" href=\"#home.html\"><u>Safety</u></a>|</li>\n");
      out.write("                    <li><a class=\"anc\" href=\"#home.html\"><u>abcdef</u></a>|</li>\n");
      out.write("                </ul>\n");
      out.write("                <ul>\n");
      out.write("                    <li> <a class=\"anc\" href=\"#home.html\"><u>Contact Us</u></a></li>\n");
      out.write("                    <li><a class=\"anc\" href=\"#home.html\"><u>Privacy Policy</u></a> |</li>\n");
      out.write("                    <li><a class=\"anc\" href=\"#home.html\"><u>Term of use</u>|</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <ul>\n");
      out.write("                    <li><img src = \"images/fb.png\" class = \"img\"></li>\n");
      out.write("                    <li><img src = \"images/twitter.png\" class = \"img\"> </li>\n");
      out.write("                    <li> <img src = \"images/gmail.png\" class = \"img\"> </li>\n");
      out.write("                    <li> <img src = \"images/insta.png\" class = \"img\"></li>\n");
      out.write("                    <li>  <img src = \"images/yt.png\" class = \"img\"></li>\n");
      out.write("                </ul>\n");
      out.write("                <hr size=\"1px\" width=\"100%\" align=\"center\" noshade color=\"#ff9900\">\n");
      out.write("                <p><< By Bus Management.All rights reserved >></p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
