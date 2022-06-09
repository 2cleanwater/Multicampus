<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title></head>
<body>
<h3>** 검색된 고객의 정보 **</h3><hr>
아이디 : ${vo.id}<br>          
패스워드 : ${vo.password}<br>       
전화번호 : ${vo.telephone}<br> 
생일 : ${vo.birth}<br>
성별 : ${vo.sex}<br>
주소 : ${vo.addr}<br>
<a href="/backendMiniProject/index.html">홈 화면으로 이동</a>
</body>
</html>
