<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Product 목록</title>
</head>
<body>
	<h1>
		<a href="list">카테고리</a>
	</h1>


	<a href="category_id1">연극</a>
	<a href="category_id2">클래식</a>
	<a href="category_id3">콘서트</a>
	<a href="category_id4">뮤지컬</a>
	<a href="category_id5">전시</a>

	<h1>뮤지컬</h1>
	<br>
	<br>

	<c:forEach items="${category_id2}" var="reservation">


${reservation.description } <br>
${reservation.content } <br>
${reservation.event } <br>


	</c:forEach>

	<br>
	<br>
	<br>
</body>
</html>