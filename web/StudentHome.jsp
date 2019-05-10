<!DOCTYPE html>
<html>
<head>
  <title>Student Home</title>
  <link rel="stylesheet" href="style.css">
</head>
<body>
<div id="header">
    <h1>BUS MANAGEMENT</h1>
    <p><a href="Search.jsp"><button class="srch">Search</button></a></p>
</div>
<div id="nav">
      <div class="navbtn">
         <a class="anc" href="StudentHome.jsp"> <button class ="btn">  Home</button></a>
      </div>
      <div class="navbtn">
        <a class="anc" href="student.jsp"><button class ="btn"> Profile</button></a>
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
<div id="container">
  <div class="left">
      <img src="images/image1.jpg"  style="width:100%">
  </div>
   <div class="center">

    <img src="images/image5.jpg"  style="width:100%">
      </div>
  <div class="right">

    <img src="images/image9.jpg"  style="width:100%">
      </div>
</div>
<div id="container1">
  <div class = "info1">
      <div class = "info11">
            <p><h1><img src = "images/search.png" class = "img"> Search </h1>
            <h3>You can Search all the Schedule here</h3>
            <a class="anc" href = "Search.jsp"> <button class ="btn"> Search</button></a>
        </div>
        <div class = "info12">
            <p><h1><img src = "images/user.png" class = "img"> User </h1>
            <h3> User info here</h3>
            <a class="anc" href = "profile.jsp"><button class ="btn"> User</button></a>
        </div>
    </div>
    <div class = "info2">
        <div class = "info21">
            <p><h1><img src = "images/schl.png" class = "img"> Schedule </h1>
            <h3> Check your schedule here</h3>
            <a  class="anc" href = "schedule.jsp"><button class ="btn"> Check Your Schedule</button></a>
        </div>
        <div class = "info22">
            <p><h1><img src = "images/view.png" class = "img">View All </h1>
            <h3> See all the details</h3>
            <a class="anc" href = "ViewAll.jsp"><button class ="btn">  View All</button></a>
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

<script>
var slideIndex = 0;
showSlides();
function showSlides() {
  var i;
  var slides = document.getElementsByClassName("slide");
  var dots = document.getElementsByClassName("dot");
  for (i = 0; i < slides.length; i++) {
    slides[i].style.display = "none";  
  }
  slideIndex++;
  if (slideIndex > slides.length) {slideIndex = 1}    
  for (i = 0; i < dots.length; i++) {
    dots[i].className = dots[i].className.replace(" active", "");
  }
  slides[slideIndex-1].style.display = "block";  
  dots[slideIndex-1].className += " active";
  setTimeout(showSlides, 2000);
}
</script>
</body>
</html>