
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html >
<html>
<body>
<h1>EL�� ���尴ü</h1>
    <table border="1">
     <tr>
        <td><b>���尴ü</b></td>
        <td><b>EL Expression</b></td>
        <td><b>��� </b></td>
      </tr>    
       <tr>
        <td>���尴ü[header]</td>
        <td>\${header["user-agent"]}</td>
        <td>${header["user-agent"]}</td>
      </tr>
<tr>
      <td>���尴ü[header.cookie]</td>
        <td>\${header['cookie']} </td>
      <td>    ${header['cookie']}  </td>
      </tr>      
 <tr>
      <td>���尴ü[header.host]</td>
        <td>\${header["host"]}</td>
      <td>    ${header['host']}  </td>
      </tr>
      </table>
</body>
</html>

