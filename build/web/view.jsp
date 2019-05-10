<%-- 
    Document   : ViewAll
    Created on : 3 Apr, 2019, 9:44:58 AM
    Author     : Aditi Sharma
--%>

<!DOCTYPE html>
<html>
    <head>
        <title> Layout</title>
        <link rel="stylesheet" href="style.css">
    </head>
    <body>
        <div id="header">
            <h1>BUS MANAGEMENT</h1>
            <p><a href="Search.jsp"><button class="srch">Search</button></a></p>
        </div>
       <div id="nav">
            <div class="navbtn">
                <a class="anc" href="AdminHome.jsp"> <button class ="btn">  Home</button></a>
            </div>
            <div class="navbtn">
                <a class="anc" href="Update.jsp"><button class ="btn"> Update Info</button></a>
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
        <div style=" font-size: 30px;
             color: #ff9900;
             text-transform: uppercase;
             font-weight: 300;
             text-align: center;
             margin-bottom: 15px;">
            <h1> VIEW ALL DETAILS HERE</h1>
        </div>
        <div id="container1">
            <div class = "info1">
                <div class = "search">
                    <p><h1><img src = "images/search.png" class = "img"> Student </h1>
                    <h3>Student home page here</h3>
                    <a class="anc" href = "StudentHome.jsp"> <button class ="btn"> Student</button></a>
                </div>
                <div class = "view">
                    <p><h1><img src = "images/view.png" class = "img">Driver</h1>
                    <h3> Get Driver Info/h3>
                    <a class="anc" href = "driver.jsp"><button class ="btn"> Check Driver Info</button></a>
                </div>
            </div>
            <div class = "info2">
                <div class = "schedule">
                    <p><h1><img src = "images/schl.png" class = "img"> Schedule </h1>
                    <h3> Check your schedule here</h3>
                    <a  class="anc" href = "schedule.jsp"><button class ="btn"> Check Your Schedule</button></a>
                </div>
                <div class = "Driver">
                    <p><h1><img src = "images/view.png" class = "img">Update </h1>
                    <h3> Update Schedule Info here</h3>
                    <a class="anc" href = "driver.jsp"><button class ="btn"> Check Driver Info</button></a>
                </div>
            </div>
             <div class = "info2">
                <div class = "schedule">
                    <p><h1><img src = "images/schl.png" class = "img"> Schedule </h1>
                    <h3> Add  schedule info here</h3>
                    <a  class="anc" href = "AdminAdd.jsp"><button class ="btn"> Add Schedule</button></a>
                </div>
                <div class = "view">
                    <p><h1><img src = "images/view.png" class = "img">Driver</h1>
                    <h3> Delete Schedule Info here</h3>
                    <a class="anc" href = "Delete.jsp"><button class ="btn">Delete Schedule</button></a>
                </div>
            </div>
             <div class = "info2">
                <div class = "schedule">
                    <p><h1><img src = "images/schl.png" class = "img"> Schedule </h1>
                    <h3> Add  schedule Info here</h3>
                    <a  class="anc" href = "update.jsp"><button class ="btn"> Update Schedule</button></a>
                </div>
                <div class = "view">
                    <p><h1><img src = "images/view.png" class = "img">Driver</h1>
                    <h3> See all the details</h3>
                    <a class="anc" href = ".jsp"><button class ="btn"> Check Driver Info</button></a>
                </div>
            </div>
        </div>

        <hr size="4px" width="100%" align="center" noshade color="#ff9900">
        <div  id="footer">
            <div class="flft">
                <h2>CONTACT US</h2>
                <p> CHITKARA UNIVERSITY</p>
                <p>BADDI, Himachal Pradesh</p>
                <br/>
                <p>890-545-4567</p> 
                <p><u>abc@chitkarauniversity.edu.in</u></p>
                <p><u>www.chitkarauniversity.edu.in</u></p>
            </div>
            <div class="frgt">
                <ul>
                    <li><a class="anc" href="#home.html"><u>Home</u></a></li>
                    <li><a class="anc" href="#home.html"><u>Profile</u></a> |</li> 
                    <li><a class="anc" href="#home.html"><u>Driver Info</u></a> |</li>
                    <li><a class="anc" href="#home.html"><u>Schedule</u></a> |</li>
                    <li> <a class="anc" href="#home.html"><u>View All</u></a> |</li>
                    <li> <a class="anc" href="#home.html"><u>Bus Info</u></a> |</li>
                    <li><a class="anc" href="#home.html"><u>Search</u></a>|</li>
                </ul>
                <ul>
                    <li><a class="anc" href="#home.html"><u>About us</u></a></li> 
                    <li><a class="anc" href="#home.html"><u>Safety</u></a>|</li>
                    <li><a class="anc" href="#home.html"><u>abcdef</u></a>|</li>
                </ul>
                <ul>
                    <li> <a class="anc" href="#home.html"><u>Contact Us</u></a></li>
                    <li><a class="anc" href="#home.html"><u>Privacy Policy</u></a> |</li>
                    <li><a class="anc" href="#home.html"><u>Term of use</u>|</a></li>
                </ul>
                <ul>
                    <li><img src = "images/fb.png" class = "img"></li>
                    <li><img src = "images/twitter.png" class = "img"> </li>
                    <li> <img src = "images/gmail.png" class = "img"> </li>
                    <li> <img src = "images/insta.png" class = "img"></li>
                    <li>  <img src = "images/yt.png" class = "img"></li>
                </ul>
                <hr size="1px" width="100%" align="center" noshade color="#ff9900">
                <p><< By Bus Management.All rights reserved >></p>
            </div>
        </div>
    </body>
</html>
