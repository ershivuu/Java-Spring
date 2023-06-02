<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
response.setHeader("Pragma", "No-cache");
response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
response.setDateHeader("Expires", -1); 
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>Home Page</title>
</head>
<body>
	<div class="container">
	
		<%
			if(!session.isNew() && session.getAttribute("USERNAME") 
					!= null)	{
		%>
		<h1 style="color:green"> Welcome 
			<%=session.getAttribute("USERNAME")%> to your profile page 
		</h1>
		
		<a href="../controller/logout.jsp">LOGOUT</a>
		
		<%
			}
			else
				response.sendRedirect("../login.jsp?msg=notLoggedIn");
		%>
	</div>
</body>
</html>

