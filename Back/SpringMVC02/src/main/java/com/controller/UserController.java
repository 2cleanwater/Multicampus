package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.entity.User;
import com.model.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/insert.sp")
	public String insertPage() {
		return "/WEB-INF/view/insert.jsp";
		
	}
	
	// �Է��ϱ� : �Է����������� ���� �޾Ƽ� (Entity)�� ������ ��ü�� ����(����)�� DAO�� ���� �����ϰ� �ȴ�.
	@RequestMapping(value="/insert_res.sp", method=RequestMethod.POST)
	public String insertRes(@ModelAttribute User user) {
			if(userService.insertUser(user) ==  true) {
				return "/list.sp";
				
			} else {
				return "/WEB-INF/view/insert.jsp";
			}
	}
	// ��ü ���������
	@RequestMapping("/list.sp")
	public String list(Model model) {
		model.addAttribute("all_list", userService.listUser());
		return "/WEB-INF/view/list.jsp";
	}
}
