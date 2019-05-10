<%-- 
    Document   : ViewAll
    Created on : 3 Apr, 2019, 9:44:58 AM
    Author     : Aditi Sharma
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="org.hibernate.Query"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="org.hibernate.Session"%>
<%@page import="Model.schedule"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Result</title>
        <link rel="stylesheet" href="style.css">
    </head>
    <body>
        <div id="header">
            <h1>BUS MANAGEMENT</h1>
            <p> <input class="srch"  type="text" placeholder="Search" name="search" ></p>

        </div>
        <div id="nav">
            <div class="navbtn">
                <a class="anc" href="home.html"> <button class ="btn">  Home</button></a>
            </div>
            <div class="navbtn">
                <a class="anc" href="student.html"><button class ="btn"> Profile</button></a>
            </div>
            <div class="navbtn">
                <a class="anc" href="bus.html"> <button class ="btn">Bus Info</button></a>
            </div>
            <div class="navbtn">
                <a class="anc" href="driver.html"> <button class ="btn">Driver Info</button></a>
            </div>
            <div class="navbtn">
                <a class="anc" href="view.html"> <button class ="btn">View All</button></a>
            </div>
        </div>

        <section>
            <!--for demo wrap-->
            <h1>Driver details</h1>
            <div class="tbl-header">
                <table cellpadding="0" cellspacing="0" border="0">
                    <thead>
                        <tr>

                            <th>BUS NUMBER</th>
                            <th>FROM</th>
                            <th>TO</th>
                            <th>VIA</th>
                            <th>TIME</th>
                            <th>DRIVER NAME</th>
                        </tr>
                    </thead>


                    <div class="tbl-content">

                        <tbody>
                            <%
                                String number, pick, drop, route, time, driver;
                                List<schedule> list = (List<schedule>) request.getAttribute("res");

                                for (schedule a : list) {

                                    number = a.getBusnumber();
                                    pick = a.getPick();
                                    drop = a.getDropp();
                                    route = a.getRoute();
                                    time = a.getTime();
                                    driver = a.getDriver();
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
                            %>

                        </tbody>
                </table>

            </div>
        </section>
        <button class="btn" type="submit">back</button>

    </body>
</html>
