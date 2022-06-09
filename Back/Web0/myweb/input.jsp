<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!--  http://localhost:8080/myweb/myres?myid=1&mypw=2 -->
<form action="/myweb/myres" method="post">
 
     ID :  <input type ="text" name ="myid"/> <br> 
     pw :  <input type ="text" name ="mypw"/> <br>
     
     <input type = "submit"  value ="ok" />
     <input type = "reset"  value ="reset" />
     
</form>
</body>
</html>