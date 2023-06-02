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

	<h1 style="color:tomato ; text-align:center"> Login Page </h1>
		
	<form action="accept" method="post" class="form">
	
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
	
	<p> Click <a href="register.jsp">here</a> to register</p>
</div>
</body>
</html>







