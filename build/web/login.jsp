<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
        <link rel="stylesheet" href="animate.css"/>
        <script src="jquery-3.3.1.js">
        </script>
        <style>
            body
            {
                margin:0;
                background-image:url(images/image.jpg); 
            }
            .main
            {  
                display: flex;
                margin-top:40px;
                margin-left: 170px;
                height:550px;
                width:400px;
                padding:16px;
                background-color:rgba(26, 13, 0, 0.5);
                box-sizing: border-box;	
                border-radius: 20px;

            }
            .input
            {
                display: flex;
                padding:8px;
                border:none;
                padding: 14px 20px;
                margin: 8px 0;
                border-bottom:0px solid #ddd;
                width:300px;
                background: white;
                opacity:0.9;
                border-radius: 20px;
                border-color: none;
                box-sizing: border-box;	
            }
            .btn
            {
                display: flex;
                background-color:#ff9900;
                border: none;
                cursor: pointer;
                padding: 12px 24px;
                width:300px;	
                opacity: 0.9;
                border-radius: 20px;
                box-sizing: border-box;	
            }
            .btn:hover
            { 
                transition-duration: 0.5s;
                transform: translate(0px,-5px);
                box-shadow: 10px 20px 30px black;
                opacity: 0.9;
            }
            #account
            {   
                display: flex; 
                padding:8px;
                display:block;
                border:none;
                padding: 14px 20px;
                margin: 8px 0;
                border-bottom:2px solid #ccc;
                width:300px;
                background: white;
                opacity:0.9;
                box-sizing: border-box;	
            }
            a
            {  
                display: block;
                text-decoration:none;
                color:black;
                padding: 5px;
            }
            h1
            {
                color:#ff9900;
                opacity: 0.9;
            }
            h2
            {
                color: #ff9900;
            }
            h3
            {
                color: #ff9900;
            }
        </style>
    </head>
    <body>
        <div class="main">

            <form name="form" action="UserServlet" method="get" >
                <h1> Login Form</h1>
                <b><h2>Username</h2></b>
                <p> <input class="input"  type="text" placeholder="Enter Username" name="name" ></p>
                <b><h2>Password</h2></b>
                <p> <input class="input" type="password" placeholder="Enter Password"  name="pwd"  ></p>
                <h2> Select</h2><select class="input" id="account" name="select">
                    <option value="stud">------>Select<------</option>
                    <option value="stud">Student</option>
                   
                    <option value="admin">Admin</option>
                </select></p>
                <button class="btn" type="submit" value="Submit"> Submit </button>
                <a href="#"><h3>Forgot Password?</h3></a>
            </form>
        </div>
    </body>
</html>


</html>
