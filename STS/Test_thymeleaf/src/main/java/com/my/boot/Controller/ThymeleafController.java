package com.my.boot.Controller;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.my.boot.domain.Member ;

@Controller
public class ThymeleafController {

	@GetMapping("study/thymeleaf")
	// -> 요청하게 되면 src/main/resources/templates 하위 요청 떄문에 앞에 /를 안붙여도 됨
	public void sendDataForStudy(HttpSession session ) {
		//Vo = domain
		Member member = new Member();
		member.setUserId("thymeleafStudent");
		member.setPassword("1234");
		member.setGrade(" tt");
		member.setTell("@10-0000-1111");
		member.setLoginCnt(10);
		member.setRegDate("2022-03-30");
		session.setAttribute("userInfo", member);
	}
}