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

      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Login</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"> \n");
      out.write("        <link rel=\"stylesheet\" href=\"animate.css\"/>\n");
      out.write("        <script src=\"jquery-3.3.1.js\">\n");
      out.write("        </script>\n");
      out.write("        <style>\n");
      out.write("            body\n");
      out.write("            {\n");
      out.write("                margin:0;\n");
      out.write("                background-image:url(images/image.jpg); \n");
      out.write("            }\n");
      out.write("            .main\n");
      out.write("            {  \n");
      out.write("                display: flex;\n");
      out.write("                margin-top:40px;\n");
      out.write("                margin-left: 170px;\n");
      out.write("                height:550px;\n");
      out.write("                width:400px;\n");
      out.write("                padding:16px;\n");
      out.write("                background-color:rgba(26, 13, 0, 0.5);\n");
      out.write("                box-sizing: border-box;\t\n");
      out.write("                border-radius: 20px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .input\n");
      out.write("            {\n");
      out.write("                display: flex;\n");
      out.write("                padding:8px;\n");
      out.write("                border:none;\n");
      out.write("                padding: 14px 20px;\n");
      out.write("                margin: 8px 0;\n");
      out.write("                border-bottom:0px solid #ddd;\n");
      out.write("                width:300px;\n");
      out.write("                background: white;\n");
      out.write("                opacity:0.9;\n");
      out.write("                border-radius: 20px;\n");
      out.write("                border-color: none;\n");
      out.write("                box-sizing: border-box;\t\n");
      out.write("            }\n");
      out.write("            .btn\n");
      out.write("            {\n");
      out.write("                display: flex;\n");
      out.write("                background-color:#ff9900;\n");
      out.write("                border: none;\n");
      out.write("                cursor: pointer;\n");
      out.write("                padding: 12px 24px;\n");
      out.write("                width:300px;\t\n");
      out.write("                opacity: 0.9;\n");
      out.write("                border-radius: 20px;\n");
      out.write("                box-sizing: border-box;\t\n");
      out.write("            }\n");
      out.write("            .btn:hover\n");
      out.write("            { \n");
      out.write("                transition-duration: 0.5s;\n");
      out.write("                transform: translate(0px,-5px);\n");
      out.write("                box-shadow: 10px 20px 30px black;\n");
      out.write("                opacity: 0.9;\n");
      out.write("            }\n");
      out.write("            #account\n");
      out.write("            {   \n");
      out.write("                display: flex; \n");
      out.write("                padding:8px;\n");
      out.write("                display:block;\n");
      out.write("                border:none;\n");
      out.write("                padding: 14px 20px;\n");
      out.write("                margin: 8px 0;\n");
      out.write("                border-bottom:2px solid #ccc;\n");
      out.write("                width:300px;\n");
      out.write("                background: white;\n");
      out.write("                opacity:0.9;\n");
      out.write("                box-sizing: border-box;\t\n");
      out.write("            }\n");
      out.write("            a\n");
      out.write("            {  \n");
      out.write("                display: block;\n");
      out.write("                text-decoration:none;\n");
      out.write("                color:black;\n");
      out.write("                padding: 5px;\n");
      out.write("            }\n");
      out.write("            h1\n");
      out.write("            {\n");
      out.write("                color:#ff9900;\n");
      out.write("                opacity: 0.9;\n");
      out.write("            }\n");
      out.write("            h2\n");
      out.write("            {\n");
      out.write("                color: #ff9900;\n");
      out.write("            }\n");
      out.write("            h3\n");
      out.write("            {\n");
      out.write("                color: #ff9900;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"main\">\n");
      out.write("\n");
      out.write("            <form name=\"form\" action=\"UserServlet\" method=\"get\" onsubmit=\"return myValidation()\">\n");
      out.write("                <h1> Login Form</h1>\n");
      out.write("                <b><h2>Username</h2></b>\n");
      out.write("                <p> <input class=\"input\"  type=\"text\" placeholder=\"Enter Username\" name=\"name\" ></p>\n");
      out.write("                <b><h2>Password</h2></b>\n");
      out.write("                <p> <input class=\"input\" type=\"password\" placeholder=\"Enter Password\"  name=\"pwd\"  ></p>\n");
      out.write("                <h2> Select</h2><select class=\"input\" id=\"account\" name=\"select\">\n");
      out.write("                    <option value=\"stud\">------>Select<------</option>\n");
      out.write("                    <option value=\"stud\">Student</option>\n");
      out.write("                   \n");
      out.write("                    <option value=\"admin\">Admin</option>\n");
      out.write("                </select></p>\n");
      out.write("                <button class=\"btn\" type=\"submit\" value=\"Submit\"> Submit </button>\n");
      out.write("                <a href=\"#\"><h3>Forgot Password?</h3></a>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("<!--        <script>\n");
      out.write("            function myValidation() {\n");
      out.write("\n");
      out.write("                var uname = document.forms[\"form\"][\"name\"].value;\n");
      out.write("                var password = document.forms[\"form\"][\"pwd\"].value;\n");
      out.write("                var select = document.forms[\"form\"][\"account\"].value;\n");
      out.write("                var flag = true;\n");
      out.write("                if (uname == \"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Name Cannot be empty\");\n");
      out.write("                    flag = false;\n");
      out.write("                }\n");
      out.write("                if (password == \"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Password Cannot be empty\");\n");
      out.write("                    flag = false;\n");
      out.write("                }\n");
      out.write("                if (select == \"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Select Option\");\n");
      out.write("                    flag = false;\n");
      out.write("                }\n");
      out.write("                return flag;\n");
      out.write("            }\n");
      out.write("        </script>-->\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
