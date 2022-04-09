<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>연결확인입니다.</h1>

<table>
	<thead>
		<tr>
			<th>글번호</th>
			<th>글제목</th>
			<th>글쓴이</th>
			<th>쓴날짜</th>
			<th>수정날짜</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="board" items=${boardList }>
			<tr>
				<td>${board.bno }</td>
				<td><a href="boardDetail/${board.bno }">${board.title }</a></td>
				<td>${board.writer }</td>
				<td>${board.regdate }</td>
				<td>${board.updatedate }</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</body>
</html>