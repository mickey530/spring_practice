<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	${board }
	<a href="/boardList">글 목록</a>
	
	<form action="/boardUpdateForm" method="post">
		<input type="hidden" name="bno" value="${board.bno }">
		<input type="submit" value="수정">
	</form>
	
	<from action="/boardDelete" method="psot">
		<input type="hidden" name="bno" value="${board.bno }">
		<input type="submit" value="삭제">
	</from>
	
</body>
</html>