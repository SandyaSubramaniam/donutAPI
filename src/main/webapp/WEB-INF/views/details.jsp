<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Donuts Details</title>
</head>
<body>
	<a href="/home">Back to List</a>
	<h1>Donut</h1>
	<p>Name: ${name}</p>
	<p>Calories: ${detailResponse.getCalories()}</p>
	<p>Extras:</p>
	<ul>
		<c:forEach items="${detailResponse.getExtras()}" var="detail">
			<li>${detail}</li>
		</c:forEach>
	</ul>
</body>
</html>