<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
input {
	font-size: x-large;
}
</style>
</head>
<body>
	<form action="ScoreUpdate">
		<table border=1 width="70%"
			style="height: 400px; border-style: solid; font-size: x-large;">
			<tr>
				<th>이름</th>
				<td>${find.name}
				<input type="hidden" name="name" value="${find.name}" /></td>
			</tr>
			<tr>
				<th>국어</th>
				<td><input type="text" name="kor"
					value="${find.kor}"></td>
			</tr>
			<tr>
				<th>영어</th>
				<td><input type="text" name="eng"
					value="${find.eng}"></td>
			</tr>
			<tr>
				<th>수학</th>
				<td><input type="text" name="mat"
					value="${find.mat}"></td>
			</tr>
			<tr>
				<th>총 점</th>
				<td>${find.tot}</td>
			</tr>
			<tr>
				<th>평균</th>
				<td>${find.avg}</td>
			</tr>
			<tr>
				<th>학점</th>
				<td>${find.grade}</td>
			</tr>
			<tr>
				<td align="center" colspan="2"><input type="submit" value="수정" />
				</td>
			</tr>
		</table>
	</form>
</body>
</html>





