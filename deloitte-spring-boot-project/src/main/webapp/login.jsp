<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html>
    <html>
    <head>
      <title>h</title>
      <style>
          
          body{
              background-color: black;
          }
          
      </style>
      <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,700' rel='stylesheet' type='text/css'>
      <link rel="stylesheet" type="text/css" href="login.css">
    </head>
      <script src="https://code.jquery.com/jquery-latest.js"></script>
    
    
    <div id="navwrapper">
      <div  id="navbar"> <table class="tablewrapper">
        <tr>
          <td class="row1">Username</td> 
          <td class="row1">Password</td>
        </tr>
        <tr>
        <form onsubmit="loginfunction(event)">
          <td><input id="loginemail" type="email" class="inputtext">
          </td>
          <td><input id="loginpassword" type="password" class="inputtext">
          </td>
          <td></td>
          </form>
        </tr>
        <tr>
           
          
      </table>

    <form action="profile.jsp" method="post" onsubmit="loginfunction(event)"></form>
      <table>
        <tr>
          <td><input type="submit" class="signbut bolder" value="Login" ></td>
          <td><input type="submit" class="signbut bolder" value="Sign Up"></td>

        </tr>


      </table>
       
        <h1 class="logowrapper" style="color: black;"></h1>
       
      </div>
      </div>
    
     <div id="contentwrapper"> 
        <div id="content">
            <div id="leftbod">
                <div class="connect bolder">
                    <h1>DeloConnect</h1>
                    
    
                    </div>
                
                
                </div>
          
    
         </div>
        </div>
    
    </body>
    </html>