<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link rel="stylesheet" type="text/css" href="css/style.css">
		<title>Counter Page</title>
	</head>
	<body>
		<div class='container'>
			<div>
				<h3>You have visited <a href='http://localhost:8080'>http://localhost:8080</a> <c:out value="${count}"></c:out> times.</h3>
				<h4><a href='http://localhost:8080'>Test another visit?</a></h4>			
			</div>		
		</div>
	</body>
</html>