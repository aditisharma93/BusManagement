
<!DOCTYPE html>
<html>
    <head>
        <title> Layout</title>
        <link rel="stylesheet" href="style.css">
    </head>
    <body>
        <div id="header">
            <h1>BUS MANAGEMENT</h1>
            
        </div>
        <div id="nav">
            <div class="navbtn">
                <a class="anc" href="StudentHome.jsp"> <button class ="btn">  Home</button></a>
            </div>
            <div class="navbtn">
                <a class="anc" href="profile.jsp"><button class ="btn"> Profile</button></a>
            </div>
            <div class="navbtn">
                <a class="anc" href="schedule.jsp"> <button class ="btn">Bus Info</button></a>
            </div>
            <div class="navbtn">
                <a class="anc" href="driver.jsp"> <button class ="btn">Driver Info</button></a>
            </div>
            <div class="navbtn">
                <a class="anc" href="ViewAll.jsp"> <button class ="btn">View All</button></a>
            </div>
        </div>
        <div style=" font-size: 30px;
             color: #ff9900;
             text-transform: uppercase;
             font-weight: 300;
             text-align: center;
             margin-bottom: 15px;">
            <h1> Search</h1>
        </div>
        <div id="container1">
            <div class = "id">
                <form action="Id">
                <p><h1><img src = "images/search.png" class = "img"> Search By Id</h1>
                <h3>Search the bus details by Id</h3>
                <p> <input class="input"  type="text" placeholder="Enter id" name="busno" ></p>
                 <button class ="btn"> Search</button>
                </form>
            </div>
            <div class = "route">
                <form action="Search">
                    <p><h1><img src = "images/search.png" class = "img"> Search By Route </h1>
                    <h3> Search here by route</h3>
                    <p> <input class="input"  type="text" placeholder="Enter route" name="route" ></p>
                    <button class ="btn"> Search</button>
                </form>
            </div>
            <div class = "details">
                <form action="details">
                <p><h1><img src = "images/search.png" class = "img"> All Details </h1>
                <h3> You can Search all the Schedule here</h3>
                <input class="input"  type="text" placeholder="View all" name="name" >
                <button class ="btn"> Search</button>
                </form>
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