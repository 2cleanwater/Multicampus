package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.biz.ScoreBiz;
import com.entity.Score;

/**
 * Servlet implementation class ScoreAll2
 */
//@WebServlet("/ScoreAll")
public class ScoreAll extends HttpServlet {

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Score> all = new ScoreBiz().getScoreAll();
		
		//값을 받아서 저장한 다음 ScoreAll.jsp로 전송
		request.setAttribute("all",all); //저장
		RequestDispatcher rd = request.getRequestDispatcher("ScoreAll.jsp");
		rd.forward(request, response);
		// 전송
//		ScoreBiz biz=new ScoreBiz();
//		 ArrayList<Score> sm= biz.getScoreAll();
//		 //값을 담아서 ScoreAll.jsp로 배달
//		 request.setAttribute("all", sm);
//		 //배달
//		RequestDispatcher rd
//		=request.getRequestDispatcher("ScoreAll.jsp");
//		 rd.forward(request, response);
	}

}
