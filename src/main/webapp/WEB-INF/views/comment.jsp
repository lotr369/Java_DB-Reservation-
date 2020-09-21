<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>comment</title>
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

	<h1></h1>
	<br>
	<c:forEach items="${comment}" var="reservation">

 
 id:${reservation.id  } <br>
 별점:${reservation.score } <br>
 댓글:${reservation.comment } <br>
 ${reservation.create_date } <br>
 ${reservation.modify_date } <br>
 

</c:forEach>
	<br>
	<br>
	<form method="post" action="write">
		name : <input type="text" name="name"><br>
		<textarea name="content" cols="60" rows="6"></textarea>
		<br> <input type="submit" value="등록">
	</form>
	<br>
</body>
</html>