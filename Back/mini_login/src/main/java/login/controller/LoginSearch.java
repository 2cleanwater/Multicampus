package login.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class LoginSearch {
	@GetMapping("/login.do")
	public String myview(@RequestParam("id")String id ,@RequestParam("pw")String pw) {
	    System.out.println(id +","+ pw);
		if(id.equals("abcd") && pw.equals("1234") ) {
			System.out.println("等促备");
	    	  return "/login_suc";
	      }else {
	    	  System.out.println("救等促备");
	    	  return "/ok"; 
	      }    	  
	    
  }		
}
