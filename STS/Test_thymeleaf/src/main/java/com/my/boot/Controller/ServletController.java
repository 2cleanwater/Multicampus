package com.my.boot.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.my.boot.domain.Member;

@Controller
public class ServletController {
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/input")
	public String index02() {
		return "inputMember";
	}
	
	//페이지를 요청할 때마다 입력되는 내용을 담을 객체
	private static List<Member> member_all = new ArrayList();
	
	//1. /display 로 post로 요청하게 되면 호출되는 메소드
	//2. 폼태그를 member가 가진 필드로 name을 맞추기 때문에 ( @Model~~로 Member member로 자동대입)
	public ModelAndView saveEmployee(@ModelAttribute Member member, ModelAndView mav) {
		mav.setViewName("memberDetails"); //memberDetails.html
		member_all.add(member); // list 객체로 추가
		mav.addObject("memberList", member_all); // 모델을 request객체에 저장
		return mav; // 리턴
		// memberDetails.html로 inputMember.html에서 입력받은 값이 memberList라는 이름으로 저장 전달된다.
	}
	
	public ModelAndView saveEmployee02(@ModelAttribute Member member, ModelAndView mav) {
		member_all.add(member); // list 객체로 추가
		return new ModelAndView("memberDetails","memberList",member_all); // 리턴
	}
}
