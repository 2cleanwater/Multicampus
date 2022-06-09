package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.biz.ScoreBIZ;
import com.entity.ScoreEntity;
import com.vo.ScoreVO;

//requestScope
//  { "/ScoreController", "/select", "/insert", "/delete", "/update", "/find" })
@Controller
@RequestMapping("/score/*")
public class ScoreController {
       
	@Autowired
	ScoreBIZ scoreBIZ;
	
	@GetMapping("/list.do")
	public ModelAndView my_Select() {
		
//		List<ScoreEntity> all = scoreBIZ.getAllScore();
		return new ModelAndView("listScore", "all", scoreBIZ.getAllScore());
		// /WEB-INF/score/listScore.jsp		all = scoreBIZ.getAllScore()
		//									request.setAttribute("all", scoreBIZ.getAllScore() );
		// <property name="prefix" value="/WEB-INF/score/" />
		// <property name="suffix" value=".jsp" />
		
	}
	
	// 삭제 후 전체 목록으로 이동
	@RequestMapping (value = "/delete.do", method = RequestMethod.GET)
	public String my_Delete(@RequestParam("del_name") String name) {
		
		int r = scoreBIZ.getDelScore(name);
		if(r>0) { // 바로 페이지 이동
			return "redirect:/score/list.do";
		}else {
			return " ";
		}
	}
	//find는 이름으로 찾아서 updateScore.jsp로 일단 보낸다.
	//서블릿으로 이동해서 실제 데이터를 다오를 통해서 업데이트 된다.
	
	@RequestMapping (value = "/find.do", method = RequestMethod.GET)
	public ModelAndView my_Find(@RequestParam("find_name") String name) {
		ScoreEntity r = scoreBIZ.getFindScore(name);
		return new ModelAndView("updatescore","find",r);
	}
	
	@RequestMapping (value = "/update.do", method = RequestMethod.GET)
	public String my_update(@ModelAttribute("scoreVo") ScoreVO vo) {
		int r = scoreBIZ.getUpdateScore(vo);
		return "redirect:/score/list.do";
	}
	
	//score/input.do
	
	@GetMapping("input.do")
	public ModelAndView my_input (ModelAndView view) {
		view.setViewName("inputscore"); //WEB-INF/score/inputScore.jsp
		return view;
	}
	
	//score/insert.do" method="POST
	@PostMapping("/insert.do")
	public ModelAndView register(@ModelAttribute("scoreVO") ScoreVO vo) {
		int r = scoreBIZ.getInsertScore(vo);
		if(r>0 ) {
			return new ModelAndView("listScore","all",scoreBIZ.getAllScore());
		}else {
			return new ModelAndView("error");
		}
	}
	
	
}




















