<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>카테고리</title>
</head>
<body>

	<br>
	<a href="categorys">
		<h1>카테고리</h1>
	</a>
	<h2>
		<a href="category_id1">연극</a> <a href="category_id2">클래식</a> <a
			href="category_id3">콘서트</a> <a href="category_id4">뮤지컬</a> <a
			href="category_id5">전시</a>
	</h2>
	<h1>Product</h1>
	<hr>
	<h2>바로 예매가능한 전시,공연 행사가 ${CountP} 개 있습니다.</h2>
	<hr>
	<br>
	<c:forEach items="${list1}" var="reservation">

	${reservation.id }<br>
	${reservation.description } <br>
	${reservation.content } <br>
	${reservation.event } <br>
	${reservation.create_date } <br>
	${reservation.modify_date } <br>


	</c:forEach>
	<br>
</body>
</html>