<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%> 
 
<%@ page import="com.kosta.sample.board.BoardVO" %>  
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %>  
  
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.7.1.js"></script>
<script> $(function() { }); </script>		
</head>
<body>
<!--
 EL(Expression Language) :  JSP 사용하는 스크립트릿(<% %>) 문법을 쉽게 하는 언어  $ { } 
 JSTL(JSP Standard Tag Library) : JSP 표준라이브러리
 
  - JSP 내장객체 SCOPE : page > request > session > application
  - EL  내장객체 SCOPE : pageScope > requestScope > sessionScope > applicationScope
-->


<!-- 
//서블릿 코드
BoardVO bvo  = new BoardVO();
bvo.setRegid("kim");
bvo.setTitle("이건제목");
request.setAttribute("KEY_BOARDVO", bvo);
--> 
<% 
//BoardVO bvo = (BoardVO)request.getAttribute("KEY_BOARDVO");
//out.println(bvo.getRegid() + ","  + bvo.getTitle());
%>  
<!-- ${requestScope.KEY_BOARDVO.regid} -->  



<!-- 
//서블릿 코드
ArrayList<BoardVO> list = new ArrayList<BoardVO>();		
BoardVO bvo  = new BoardVO();
bvo.setRegid("kim");
bvo.setTitle("이건제목");
list.add(bvo);
bvo  = new BoardVO();
bvo.setRegid("kim2");
bvo.setTitle("이건제목2");
list.add(bvo);
request.setAttribute("KEY_LISTVO", list);
-->
 
<% 
//ArrayList<BoardVO> list = (ArrayList<BoardVO>)request.getAttribute("KEY_LISTVO"); 
//for(BoardVO bvo : list) {
//	out.println(bvo.getTitle() + "," + bvo.getRegid() + "<br>");
//}
%>
<!-- 
${requestScope.KEY_LISTVO[0]["regid"]}, ${requestScope.KEY_LISTVO[0]["title"]}<br>
${requestScope.KEY_LISTVO[1]["regid"]}, ${requestScope.KEY_LISTVO[1]["title"]}<br>
-->

<!--
ArrayList<BoardVO> list = (ArrayList<BoardVO>)request.getAttribute("KEY_LISTVO"); 
for(BoardVO bvo : list) {
   bvo.getRegid()
}
 -->
<c:forEach items="${KEY_LISTVO}" var="bvo">
	${bvo.regid} , ${bvo.title} <br> 
</c:forEach>
<p><br>

<c:if test="${not empty KEY_LISTVO}">
	<c:forEach items="${KEY_LISTVO}" var="mybvo" varStatus="mysts">
		${mybvo.regid} , ${mybvo.title} -  ${mysts.index} ${mysts.count}<br> 
	</c:forEach>
</c:if>
<c:if test="${empty KEY_LISTVO}">
	데이터가 없습니다.  ArrayList<BoardVO> list = null
</c:if>
<br>

<!-- 
//서블릿 코드
HashMap<String, BoardVO> map = new HashMap<String, BoardVO>();
BoardVO bvo  = new BoardVO();
bvo.setRegid("kim");
bvo.setTitle("이건제목");
map.put("map_key", bvo);
request.setAttribute("KEY_MAPVO", map);
-->
<% 
//HashMap<String, BoardVO> map = (HashMap<String, BoardVO>)request.getAttribute("KEY_MAPVO");
//out.println(map.get("map_key").getRegid() + "," + map.get("map_key").getTitle());
%>
<!-- ${requestScope.KEY_MAPVO.map_key.regid} , ${KEY_MAPVO.map_key.title} -->


<!-- 
//서블릿 코드
HttpSession session = request.getSession();
session.setAttribute("SESS_ID", "kim");
session.setAttribute("SESS_GRADE", "gold");
--> 
<% 
//String uid = (String)session.getAttribute("SESS_ID");
//out.print(uid);
%>
<!--  ${sessionScope.SESS_ID}  -->


<!-- 
//서블릿 코드
Cookie ck1 = new Cookie("MY_COOKIE_UID", "lee");
Cookie ck2 = new Cookie("MY_COOKIE_GRADE", "hong");
ck1.setMaxAge(100);
ck2.setMaxAge(100);
response.addCookie(ck1);
response.addCookie(ck2);
-->

<%
// 요청으로부터 모든 쿠키를 가져옵니다.
Cookie[] cookies = request.getCookies();
if (cookies != null) {
    for (Cookie cookie : cookies) {
        out.println(cookie.getName() + "," + cookie.getValue() + "<br>");
    }
}
%>
${cookie.MY_COOKIE_UID.name}, ${cookie.MY_COOKIE_UID.value}


<!-- JSTL :   if  forEach   -->
<%
String cval = "lee";
int num = 10;
if (cval.equals("lee") && num==10) {
	out.println("ok");
} else { 
	out.println("fail");
}
%>
<br>

<c:if test="${cookie.MY_COOKIE_UID.value == 'lee'}">
	ok lee
</c:if>
<br>
<c:if test="${cookie.MY_COOKIE_UID.value eq 'lee'}">
	ok lee
</c:if>
<br>

<c:set value="hong" var="userid"/>
<c:choose>
    <c:when test="${userid == 'hong'}">
         유저:홍
    </c:when>
    <c:when test="${userid == 'admin'}">
        어드민
    </c:when>
    <c:otherwise>
        손님
    </c:otherwise>
</c:choose>
<br>

<!-- 
for(int i=1; i<=10; i+=2)
 -->
<c:forEach begin="1" end="10" step ="2"   var="myval">
출력 : ${myval} <br>
</c:forEach>

<br>

<c:forTokens items="123-456-789"  delims="-"   var="myval">
       ${myval}  <br>
</c:forTokens>




<!-- c:redirect url="index.jsp" /> -->


<c:set var = "mynum" value = "123456789"/>
<fmt:formatNumber value="${mynum}" type="currency" currencySymbol="\\"/>





</body>
</html>