package com.myjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.data.domain.PageRequest;


import com.myjpa.repository.PageRepository;
import com.myjpa.service.MyService;
@Controller

public class PageController {

@Autowired
PageRepository repository;

		@Autowired
		MyService service;
		
	
		//localhost:9898/pagelist
		@RequestMapping("/pagelist")
			public String index (Model model) {
				model. addAttribute("mybooks", this.service.findAll02());
				return "index";
		}
//		@RequestMapping('
//				"/pagelist02")
//				public String index02 (@PathVariable Integer pageNo, Model model) {
//				//static PageRequest
//				of (int page,
//				int size, Sort.Direction direction, String..
//				PageRequest
//				req = PageRequest.of (pageNo-1,5, Sort .Direction.DESC, "title") ;
//				model.addAttribute(
//				"mybooks"
//				this.service.findAll03(reg)) ;
//				System.out.println(req.getPageNumber());
//				System.out.println(req.getPageSize());
//				System.out.println(req.getsort());
//				return
//				"index";
//				}

		//localhost:9898/pagelist02/0
		//@RequestMapping("/pagelist02/{pageNo}")

		@RequestMapping("/pagelist02")
		public String index02 (@PathVariable Integer pageNo, Model model) {
			//첫번째 페이지에 5개씩 내림차순으로 출력하고싶다.
			PageRequest req = PageRequest.of(pageNo-1,5,Sort.Direction.DESC,"title");
			
			model. addAttribute("mybooks", this.service.findAll03(req));
			System.out.println(req.getPageNumber());
			System.out.println(req.getPageSize());
			System.out.println(req.getSort());
			return "index";
		}
}