<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body style="font-size:1.5em">
	all_list
	<table border = "1">
	 <tr>
	   <th>�̸�</th><th>����</th><th>���</th>
	   </tr>
	   <c:if test="${!empty all_list }">
	     <c:forEach items="${all_list}" var="ob">
	       <tr>
	         <td>${ob.name }</td><td>${ob.age}</td><td>${ob.hobby}</td>
	       </tr>
	     </c:forEach>
	   </c:if>
	</table>
	<a href="<%=application.getContextPath()%>/index.html">ó��ȭ��</a>
</body>
</html>