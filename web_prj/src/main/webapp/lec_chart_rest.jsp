<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.kosta.sample.json.EmpVO" %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- 
C3.js :  (easy) to generate D3-based charts  
      :  (D3-based) reusable (JavaScript chart library). 
D3.js : open-source JavaScript library for visualizing.

https://cdnjs.cloudflare.com/ajax/libs/c3/0.7.20/c3.min.js
https://cdnjs.cloudflare.com/ajax/libs/c3/0.7.20/c3.js

https://cdnjs.cloudflare.com/ajax/libs/c3/0.7.20/c3.css
https://cdnjs.cloudflare.com/ajax/libs/c3/0.7.20/c3.min.css
 -->
 
<!-- Load c3.css -->
<link href="https://cdnjs.cloudflare.com/ajax/libs/c3/0.7.20/c3.css" rel="stylesheet">
<link href="https://cdnjs.cloudflare.com/ajax/libs/c3/0.7.20/c3.min.css" rel="stylesheet">

<!-- Load d3.js and c3.js   https://cdnjs.cloudflare.com/ajax/libs/d3/5.15.0/d3.js -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/d3/5.15.0/d3.js" charset="utf-8"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/c3/0.7.20/c3.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/c3/0.7.20/c3.min.js"></script>

</head>
<body>
여기에 차트<br>
<div id="my_chart_div"></div>


<input type="button" id="restBtn" value="REST로 가져오기">
		
<!-- script>
var chart = c3.generate({
    bindto: '#my_chart_div',
    data: {
      columns: [
        ['급여', 3000, 200, 100, 400, 150, 250]
        //,['data2', 50, 20, 10, 40, 15, 25]
      ]
    }
});
</script> -->


<script src="https://code.jquery.com/jquery-3.7.1.js"></script>
<script>
	$(function() {  
		//$("#restBtn").click(  function(){
				$.ajax({ 
					url : "/EmpServlet" ,
					method: "post" , 
					//data:
					//contentType: "application/x-www-form-urlencoded; charset=UTF-8",
					//---------- 서버로부터의 응답이 str으로 오는 경우
					/*success : function(resString) {
						console.log("성공" + resString);
						var json_obj = JSON.parse(resString);
						//console.log("성공" + json_obj[0]["sal"]);
						$.map( json_obj, function( MYval, MYidx ) {
							console.log(MYval["sal"] + "," + MYval["ename"] + "," + MYidx);
						});
					},*/
					dataType: "json" ,
					success : function(resObject) {
						console.log("성공" + resObject);
						var sal_arr = ['급여']
						var ename_arr = ['급여']
						$.map( resObject, function( MYval, MYidx ) {
							sal_arr.push(MYval["sal"]);
						});
						$.map( resObject, function( MYval, MYidx ) {
							ename_arr.push(MYval["ename"]);
						});
						console.log(sal_arr);
						//차트 리로드
						chart.load({
							columns: [
						        sal_arr
						        
						      ]
						});
					},
					error   : function(res) {
						console.log("실패");	
					}
				});
		//});
	});
</script>		


</body>
</html>