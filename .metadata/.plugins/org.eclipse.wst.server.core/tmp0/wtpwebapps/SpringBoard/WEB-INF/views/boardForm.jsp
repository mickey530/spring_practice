<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- /boardForm으로 보내는 post 방식 폼을 생성해주세요.
	폼에서 보내는 요소와 name속성값은 쿼리문을 참조해서 만들어주세요.
	insert로직을 실행하는 컨트롤러도 생성해주시고 return값은 ""; 로 우선 두겠습니다.
	vo를 살펴본 결과 title, content, writer 3개 요소를 보내면 됨 -->
	
	<form action="/boardForm" method="post">
		제목 : <input type="text" name="title">
		작성자 : <input type="text" name="writer"><br/>
		내용 : <textarea name="content"></textarea>
		<input type="submit" value="작성">
	</form>
</body>
</html>