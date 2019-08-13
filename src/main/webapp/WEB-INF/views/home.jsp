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
<title>Donut home</title>
</head>
<body>
<h1>Donuts</h1>
<ul>
	<c:forEach items="${results}" var="result">
		<li><a href="/details?id=${result.getId()}&name=${result.getName()}">${result.getName()}</a></li>
		</c:forEach>

</ul>

</body>
</html>