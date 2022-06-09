package com.test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyScore
 */
@WebServlet({ "/s_insert", "/s_delete", "/s_update", "/s_select" })
public class MyScore extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MyScore() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @throws IOException
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	
	// s_insert를 요청하게 되면 doGet()이 호출되고 doMyInsert()가 호출된다. (매개변수를 동일하게 주어야 함)
	protected void doMyInsert(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.getWriter().append("s_insert page ");
	}
	
	protected void doMyDelete(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.getWriter().append("s_delete page ");
	}
	
	protected void doMyUpdate(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.getWriter().append("s_update page ");
	}
	
	protected void doMySelect(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.getWriter().append("s_select page ");
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		if (request.getRequestURI().endsWith("s_insert")) { // doMyInsert()
			doMyInsert(request, response);
		}
		if (request.getRequestURI().endsWith("s_delete")) { // doMyDelete()
			doMyDelete(request, response);
		}
		if (request.getRequestURI().endsWith("s_update")) { // doMyUpdate()
			doMyUpdate(request, response);
		}
		if (request.getRequestURI().endsWith("s_select")) { // doMySelect()
			doMySelect(request, response);
		}
	}
}
