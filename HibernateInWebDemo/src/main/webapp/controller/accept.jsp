<%@page import="com.universal.daoimpl.UserDaoImpl"%>
<%@page import="com.universal.dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<jsp:useBean class="com.universal.model.User" 
		 id="user" scope="page"></jsp:useBean>
 
 		<jsp:setProperty property="*" name="user"/>
 		
 		<%
 			UserDao daoImpl = new UserDaoImpl();
 				
 			if(daoImpl.checkUser(user)) {
 				
 				session.setAttribute("USERNAME", user.getUsername());	
 				response.sendRedirect("../views/home.jsp");
 			}
 			else {
 				
 				response.sendRedirect("../login.jsp?msg=errorLogin");
 			}
 		%>	
</body>
</html>





