package com.work;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.vo.User;
@Controller
public class MyController {
      
	//case 1: 바로 주소 이동 
	@GetMapping("/login.do")
	public String myview(@RequestParam("userID")String id ,@RequestParam("userPW")String pw) {
		
	    System.out.println(id +","+ pw);
		if(id.equals("2cleanwater")  && pw.equals("1234") ) {
	    	  return "/ok";
	      }else if(id.equals("aaa")  && pw.equals("aaa") ) {
	    	  return "/ok";
	      }else if(id.equals("bbb")  && pw.equals("bbb") ) {
	    	  return "/ok";
	      }else if(id.equals("111")  && pw.equals("111") ) {
	    	  return "/ok";
	      }else if(id.equals("222")  && pw.equals("222") ) {
	    	  return "/ok";
	      }else if(id.equals("333")  && pw.equals("333") ) {
	    	  return "/ok";
	      }else if(id.equals("ccc")  && pw.equals("ccc") ) {
	    	  return "/ok";
	      }else{
	    	  return "/fail"; 
	      }    	  
	    
  }
	
	  
}
