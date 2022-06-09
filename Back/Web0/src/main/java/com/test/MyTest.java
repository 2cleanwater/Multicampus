package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyTest
 */
@WebServlet({ "/myinsert", "/myselect", "/myupdate", "/mydelete" , "/myview"})
public class MyTest extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("my_post");
	}
	
	protected void doRes(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {   
	
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {   
		if(req.getContextPath().endsWith("myview")) {
			doRes(req,resp);
		}
		
		// 응답 페이지 만들기
		
		// 1. 컨텐트 타입 지정
//		resp.setContentType("text/html;charset=UTF-8");
		resp.setContentType("text/html");
		// 2. 출력 객체
		PrintWriter out  = resp.getWriter();
		// 3. 출력 구문
		out.print("<html><body>");
		out.print("<h2>my_Test : " + req.getRequestURI() + "</h2>");
		out.print("</body></html>");
		// 4. 종료
		out.close();
		
//		System.out.println("my_get");
//		System.out.println("요청한 context_path: " +  req.getContextPath());
//		System.out.println("리모트 호스트 : " + req.getRemoteHost());
//		System.out.println("리모트 주소 : " +req.getRemoteAddr());
//		System.out.println("리모트 포트 : " +req.getRemotePort());
//		System.out.println("리모트 유저 : " +req.getRemoteUser());
//		System.out.println("로컬 호스트 : " + req.getLocalAddr());
//		
//		System.out.println(req.getPathInfo());
//		System.out.println(req.getContentType());
//		System.out.println(req.getQueryString());
//		System.out.println(req.getRequestURI());
	}
}
