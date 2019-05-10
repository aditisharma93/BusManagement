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
<%@page import="Model.student"%>
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

                            <th>STUDENT ID</th>
                            <th>FIRST NAME</th>
                            <th>LAST NAME</th>
                            <th>GENDER</th>
                            <th>DOB</th>
                            <th>EMAIL</th
                            <th>CONTACT</th>
                            <th>CATEGORY</th>
                            <th>NATIONALITY</th>
                        </tr>
                    </thead>


                    <div class="tbl-content">

                        <tbody>
                            <%
                                String id;
                                String fname,lname,gender,dob,email,contact,category,nationality;
                                List<student> list = (List<student>) request.getAttribute("res");

                                for (student a : list) {

                                    id = a.getId();
                                    fname = a.getFname();
                                    lname= a.getLname();
                                    gender = a.getGender();
                                    dob= a.getDob();
                                    email= a.getEmail();
                                    contact=a.getContact();
                                            category=a.getCategory();
                                            nationality=a.getNationality();
                            %>        

                            <tr>
                                <td><%=id%></td>
                                <td><%=fname%></td>
                                <td><%=lname%></td>
                                <td><%=gender%></td>
                                <td><%=dob%></td>
                                <td><%=email%></td>
                                <td><%=contact%></td>
                                <td><%=category%></td>
                                <td><%=nationality%></td>
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
