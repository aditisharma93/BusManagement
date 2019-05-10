/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.schedule;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Aditi Sharma
 */
public class Update extends HttpServlet {
        protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        schedule s=new schedule();
         String busno , route , dp , pp , time ,driver;
            busno = request.getParameter("busno");
             pp = request.getParameter("pp");
            dp = request.getParameter("dp");
            route = request.getParameter("route");
            time = request.getParameter("time");
            driver = request.getParameter("driver");
            s.setBusnumber(busno);
            s.setPick(pp);
            s.setDrop(dp);
            s.setRoute(route);
            s.setTime(time);
            s.setDriver(driver);
            Configuration cf=null;
            SessionFactory sf=null;
            Session session=null;
                cf=new Configuration();
                cf.configure();
                sf=cf.buildSessionFactory();
                session =sf.openSession();
                Transaction tx=session.beginTransaction();
                Query query = session.createQuery("update schedule set driver='"+s.getDriver()+"',pick='"+s.getPick()+"', dropp='"+s.getDropp()+"', route='"+s.getRoute()+"', time='"+s.getTime()+"' where busnumber='"+s.getBusnumber()+"'");
                int i = query.executeUpdate();
            tx.commit();
            session.close();
            sf.close();
            if(i>0) {
                 response.sendRedirect("update.jsp");
            }else{
            response.sendRedirect("updSch.jsp");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
