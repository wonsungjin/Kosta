<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.7.1.js"></script>
    <script>
		$(function() {

				$("#btnForm").attr("method","post");
				$("#btnForm").attr("action","/EmpServlet");
				$("#btnForm").submit();
				return true;	
			
		});
</script>
</head>
<body>
<form method = "post" name="btnForm" id="btnForm" >
<input type="button"    name="btn" id="btn" class="btn"  value="버튼">
</form>

</body>
</html>