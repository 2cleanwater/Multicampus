<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>a.jsp</h1>
<%-- 
	<jsp:forward page="b.jsp">
	<jsp:param value="myvalue1" name="myname1"/>
	<jsp:param value="myvalue2" name="myname2"/>
	<jsp:param value="myvalue3" name="myname3"/>
	</jsp:forward>

--%>	
	
	<jsp:include page="b.jsp">
	<jsp:param value="myvalue1" name="myname1"/>
	<jsp:param value="myvalue2" name="myname2"/>
	<jsp:param value="myvalue3" name="myname3"/>
	</jsp:include>
	
	<jsp:include page="c.jsp">
	<jsp:param value="myvalue1" name="myname1"/>
	<jsp:param value="myvalue2" name="myname2"/>
	<jsp:param value="myvalue3" name="myname3"/>
	</jsp:include>
	

	
	<h1>a.jsp'page</h1> 
<%-- b�� ������� �Ѿ�� ������ ������ ����--%>

</body>
</html>