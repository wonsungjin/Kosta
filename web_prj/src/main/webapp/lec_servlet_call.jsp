<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- <a href =  "https://localhost:8081/board_servlet_url">서블릿 GET 방식 호출</a><br> -->
<a href =  "/board_servlet_url">서블릿 GET 방식 호출</a><br>
<form method = "get" action = "/board_servlet_url">
<input type = "submit" value ="서블릿 GET 방식 호출">
</form><br><br>

<form method = "post" action = "/board_servlet_url">
<input name = "userid" type = "text"><br>
<input name = "userpw" type = "password"><br>

<input name = "gen" type = "radio" value = "m">남
<input name = "gen" type = "radio" value = "f">여<br>
<input name = "habit" type = "checkbox" value = "mount">등산
<input name = "habit" type = "checkbox" value = "fish">낚시
<input name = "habit" type = "checkbox" value = "music">음악
<input name = "habit" type = "checkbox" value = "art">미술<br>

<select name = "addr">
<option value = "kor">국어</option>
<option value = "eng">영어</option>
<option value = "mth">수학</option>
</select>

<input type = "file" name = "userfile"><br>

<input type = "hidden" name = "secret"><br>
<textarea name = "contents" rows = 3 cols = 50>
</textarea>

<input type = "submit" value ="서블릿 post 방식 호출">
</form>
</body>
</html>