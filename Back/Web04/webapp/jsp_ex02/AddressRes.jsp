<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="Alist" class="com.test.Address"/>
<jsp:setProperty  name="Alist" property="*"/>

   <jsp:getProperty name="Alist" property="name"/> �� �ݰ����ϴ� <br>
<jsp:getProperty name="Alist" property="name"/> �� �� �ּҴ�   
<jsp:getProperty name="Alist" property="addr"/>   �̰� <br>��ȭ��ȣ��
<jsp:getProperty name="Alist" property="tel"/>  �Դϴ�.
</body>
</html>