<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<body>
<jsp:useBean id="season" class="com.test.Season" scope="session"/>
   <h3>�����ϴ� ������ �Է����ּ���</h3>
   <hr>
   <form METHOD="post" ACTION="ELview03.jsp">   

	�̸� :<input type="TEXT" Name="name" size="30"><br>
	�����ϴ� ���� : <select name="selectSEASON">
	 <%for (String item: season.getSelectSEASON() ){
		 out.println("<option>"+item+"</option>");
	 }
   %>    
    </select>
    <input type="TEXT" Name="addr" size="30"> 
	<input type="submit" value="Ȯ��">
</form>
</body>
</html>