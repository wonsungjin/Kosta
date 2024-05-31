<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.7.1.js"></script>
<script>
$(function() {
    $.ajax({
        method: "GET",
        url: "<%=request.getContextPath()%>/GameServlet",
        error: function(xhr, status, error) {
            console.error("에러: " + error);
        },
        success: function(response) {
            console.log("성공: " + response);
            window.location.href = "<%=request.getContextPath()%>/fourgame/index.html";
        }
    });
});
</script>
</head>
<body>
</body>
</html>