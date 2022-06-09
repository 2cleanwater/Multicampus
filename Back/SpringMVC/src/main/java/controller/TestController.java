package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	//각각 이동 
	@RequestMapping(value ="/test.sp")
	public String Test() {
		return "/WEB-INF/view/test.jsp";
	}
	
	@RequestMapping(value ="/test01.sp")
	public String Test01() {
		return "/WEB-INF/view/test01.jsp";
	}
	
	@RequestMapping(value ="/test02.sp")
	public String Test02() {
		return "/WEB-INF/view/test02.jsp";
	}
	
	@RequestMapping(value ="/test03.sp")
	public String Test03() {
		return "/WEB-INF/view01/test03.jsp";
	}
	
	@RequestMapping(value ="/test04.sp")
	public String Test04() {
		return "/WEB-INF/view01/test04.jsp";
	}
}
