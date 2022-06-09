package com.test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyRes
 */
@WebServlet("/myres")
public class MyRes extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("myid"); // name을 호출하면 value를 리턴한다.
		String pw = request.getParameter("mypw"); // name을 호출하면 value를 리턴한다.
		
		response.getWriter().append("<h1>id: " + id).append("<br> pw : " + pw+ "</h1>")
		.append(request.getQueryString()).append(request.getMethod());
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response); // return값이 동일할 때 내부 호출을 통해 doGet으로 post문장을 실행한다. (이렇게 안하면 doGet 코드와 같은 중복코드를 똑같이 작성해서 해야 함) 
	}
}
