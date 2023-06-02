<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">

	<% 
		String msg = request.getParameter("msg");
	
		if( msg != null && msg.equals("errorLogin"))
		{
			out.print("<p style=color:red;text-align:center>"+
				 "invalid username or password </p>");
		}

		if( msg != null && msg.equals("notLoggedIn"))
		{
			out.print("<p style=color:red;text-align:center>"+
				 "you need to login first </p>");
		}

		if( msg != null && msg.equals("successLogout"))
		{
			out.print("<p style=color:green;text-align:center>"+
				 "logout successful </p>");
		}

		if( msg != null && msg.equals("registerSuccess"))
		{
			out.print("<p style=color:green;text-align:center>"+
				 "registration successful , email sent to you </p>");
		}

		if( msg != null && msg.equals("registerFailure"))
		{
			out.print("<p style=color:green;text-align:center>"+
				 "registration failed </p>");
		}	
	%>
	<h1 style="color:tomato ; text-align:center"> Login Page </h1>
		
	<form action="controller/accept.jsp" method="get" class="form">
	
	<div class="form-group">
      <label for="uid">Enter Username:</label>
      <input type="text" class="form-control" id="uid" 
      placeholder="Enter user name" name="username">
    </div>
    
    <div class="form-group">
      <label for="upass">Enter Password:</label>
      <input type="password" class="form-control" id="upass" 
      placeholder="Enter user password" name="password">
    </div>
    
    <input type="submit" class="btn btn-block btn-success"
    value="LOGIN">
    
    <input type="reset" class="btn btn-block btn-danger"
    value="CLEAR">
    
	</form>
	
	<p> Click <a href="register.jsp">here</a> to register </p>
</div>
</body>
</html>







