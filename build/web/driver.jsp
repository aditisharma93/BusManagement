
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
       <p> <input class="srch"  type="text" placeholder="Search" name="search" ></p>
</div>
<div id="nav">
      <div class="navbtn">
         <a class="anc" href="StudentHome.html"> <button class ="btn">  Home</button></a>
      </div>
      <div class="navbtn">
        <a class="anc" href="profile.html"><button class ="btn"> Profile</button></a>
      </div>
      <div class="navbtn">
        <a class="anc" href="Schedule.jsp"> <button class ="btn">Bus Info</button></a>
      </div>
      <div class="navbtn">
        <a class="anc" href="driver.html"> <button class ="btn">Drivers Info</button></a>
      </div>
      <div class="navbtn">
        <a class="anc" href="view.jsp"> <button class ="btn">View All</button></a>
      </div>
</div>
 <section>
            <!--for demo wrap-->
            <h1>Schedule details</h1>
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
                            String id, name,contact,email,busno;
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
                                    name= d.getName();
                                    contact=d.getContact();
                                    email=d.getEmail();
                                    busno=d.getBusno();
                                    System.out.println(id);

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
</body>
</html>
