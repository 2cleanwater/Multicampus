<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table border=1 width="90%">
		<tr>
			<th>이름</th>
			<th>국어</th>
			<th>영어</th>
			<th>수학</th>
			<th>총 점</th>
			<th>평균</th>
			<th>학점</th>
			<th>수정</th>
			<th>삭제</th>
		</tr>
		<c:forEach var="res" items ="${all}">
			<tr>
				<td>${res.name}</td>
				<td>${res.kor}</td>
				<td>${res.eng}</td>
				<td>${res.mat}</td>
				<td>${res.tot}</td>
				<td>${res.avg}</td>
				<td>${res.grade}</td>
				<td><a href="ScoreFind?name=${res.name }"> 수정 </a></td>
				<td><a href="ScoreDelete?name=${res.name }"> 삭제 </a></td>
			</tr>
		</c:forEach>
		<tr>
			<td align="center" colspan="9">
			<a href="ScoreInsert.html">입력
			</a></td>
		</tr>
	</table>
</body>
</html>













