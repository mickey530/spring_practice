<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/boardUpdate" method="post">
		<input type="hidden" name="bno" value="${board.bno}">
		제목 : <input type="text" name="title" value="${board.title}">
		작성자 : <input type="text" name="writer" value="${board.writer}">
		내용 : <textarea name="content">${board.content}</textarea>
		<input type="submit" value="수정">
	</form>
</body>
</html>