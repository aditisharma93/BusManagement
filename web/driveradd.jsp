<%-- 
    Document   : driveradd
    Created on : 3 Apr, 2019, 11:18:56 PM
    Author     : Aditi Sharma
--%>


<%@page import="Model.driver"%>
<%@page import="java.util.Iterator"%>
<%@page import="org.hibernate.Query"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="org.hibernate.Session"%>
<%@page import="Model.schedule"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<!DOCTYPE html>
<html>
    <head>
        <title> Driver</title>
        <link rel="stylesheet" href="style.css">
        <style>

            h1{
                font-size: 30px;
                color: #ff9900;
                text-transform: uppercase;
                font-weight: 300;
                text-align: center;
                margin-bottom: 15px;
            }
        </style>

    </head>
    <body>
        <div id="header">
            <h1>BUS MANAGEMENT</h1>

        </div>
        <div id="nav">
            <div class="navbtn">
                <a class="anc" href="AdminHome.jsp"> <button class ="btn">  Home</button></a>
            </div>
            <div class="navbtn">
                <a class="anc" href="Update.html"><button class ="btn"> Profile</button></a>
            </div>
            <div class="navbtn">
                <a class="anc" href="AdminAdd.jsp"> <button class ="btn">Add Info</button></a>
            </div>
            <div class="navbtn">
                <a class="anc" href="Delete.jsp"> <button class ="btn">Delete Info</button></a>
            </div>
            <div class="navbtn">
                <a class="anc" href="Edit.html"> <button class ="btn">View All</button></a>
            </div>
        </div>
        <section>
            <!--for demo wrap-->
            <h1>Driver details</h1>
            <div class="tbl-header">
                <table>
                    <thead>
                        <tr>      
                            <th> DRIVER ID</th>
                            <th>DRIVER NAME</th>
                            <th>CONTACT</th>
                            <th>EMAIL</th>
                            <th>BUS NUMBER</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            String id, name, contact, email, busno;
                            Configuration cf = null;
                            SessionFactory sf = null;
                            Session s = null;
                            driver d = null;
                            try {
                                cf = new Configuration();
                                cf.configure();
                                sf = cf.buildSessionFactory();
                                s = sf.openSession();
                                Query q = s.createQuery("from driver");
                                Iterator it = q.iterate();
                                while (it.hasNext()) {

                                    d = (driver) it.next();
                                    id = d.getId();
                                    name = d.getName();
                                    contact = d.getContact();
                                    email = d.getEmail();
                                    busno = d.getBusno();
                                    System.out.println(name);

                        %>        

                        <tr>
                            <td><%=id%></td>
                            <td><%=name%></td>
                            <td><%=contact%></td>
                            <td><%=email%></td>
                            <td><%=busno%></td>
                        </tr>
                        <%
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        %>      
                    </tbody>
                </table>
            </div>
        </section>
        <div class="demo">
            <h1>ADD DETAILS</h1>
            <form  action ="DriverAd">
                <input type="text" placeholder="DRIVER ID" name="id">
                <input type="text" placeholder="DRIVER NAME" name="name">
                <input type="text" placeholder="CONTACT " name="contact">
                <input type="text" placeholder="EMAIL" name="email">
                <input type="text" placeholder="BUS NUMBER" name="busno">  
                <br>
                <br>
                <div>
                    <button class="butn" type="submit">ADD</button> 
                </div>
            </form>
            <div style="clear: both;"></div>
        </div>

    </body>
</html>

