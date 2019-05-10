<%-- 
    Document   : ViewAll
    Created on : 3 Apr, 2019, 9:44:58 AM
    Author     : Aditi Sharma
--%>

<%@page import="java.util.Iterator"%>
<%@page import="org.hibernate.Query"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="org.hibernate.Session"%>
<%@page import="Model.schedule"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<!DOCTYPE html>
<html>
    <head>
        <title> Delete</title>
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
            <p> <input class="srch"  type="text" placeholder="Search" name="search" ></p>
        </div>
       <div id="nav">
            <div class="navbtn">
                <a class="anc" href="AdminHome.jsp"> <button class ="btn">  Home</button></a>
            </div>
            <div class="navbtn">
                <a class="anc" href="update.jsp"><button class ="btn"> Update Info</button></a>
            </div>
            <div class="navbtn">
                <a class="anc" href="AdminAdd.jsp"> <button class ="btn">Add Info</button></a>
            </div>
            <div class="navbtn">
                <a class="anc" href="Delete.jsp"> <button class ="btn">Delete Info</button></a>
            </div>
            <div class="navbtn">
                <a class="anc" href="view.jsp"> <button class ="btn">View All</button></a>
            </div>
        </div>
        <section>
            <!--for demo wrap-->
            <h1>Driver details</h1>
            <div class="tbl-header">
                <table>
                    <thead>
                        <tr>      
                            <th>BUS NUMBER</th>
                            <th>FROM</th>
                            <th>TO</th>
                            <th>ROUTE</th>
                            <th>TIME</th>
                            <th>DRIVER NAME</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            String number, pick, drop, route, time,driver;
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
                                    driver = sch.getDriver();
                                    System.out.println(number);

                        %>        

                        <tr>
                            <td><%=number%></td>
                            <td><%=pick%></td>
                            <td><%=drop%></td>
                            <td><%=route%></td>
                            <td><%=time%></td>
                            <td><%=driver%></td>
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
            <h1>DELETE</h1>

            <form action="Delete">
                <input type="text" placeholder="BUS NUMBER" name="busno">
                <button class="butn" type="submit">DELETE</button> 

            </form>
            <div style="clear: both;"></div>
        </div>

    </body>
</html>
