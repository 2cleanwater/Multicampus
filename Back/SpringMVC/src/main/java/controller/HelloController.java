package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.HelloService;

@Controller
public class HelloController {
	
	@Autowired
	HelloService hello_service;
	
	@RequestMapping(value ="/hello.sp")	// '/'없으면 무한루프 돈다
	public String hello(Model model) {
		model.addAttribute("myMessage", hello_service.getHello());
		return "/WEB-INF/view01/hello.jsp";
	}
	
}
