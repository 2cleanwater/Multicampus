<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" errorPage="errorRes.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>errorInput</title>
</head>
<body>
 <% String name=request.getParameter("name");
   {
	    name= "�̸��� �ԷµǾ����ϴ�";
    }
  %>

    <h4> <%=name %> </h4>

</body>
</html>