package com.mydb.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mydb.boot.domain.User;
import com.mydb.boot.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping(value="/insert",
			consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
			produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public String insert(@RequestBody User user) {
		if(userService.insertOne(user)) {
			return "입력 성공!!";
		} else {
			return "실패 ㅠ";
		}
	}
	
	@PostMapping("/updateOne")
	public String updateOne(@RequestBody User user) {
		if(userService.updateOne(user)) {
			return "입력 성공!!";
		} else {
			return "실패 ㅠ";
		}
	}
	
	@PostMapping("/deleteOne/{id:.+}")
	public String deleteOne(@PathVariable("id")String userId) {
		if(userService.deleteOne(userId)) {
			return "입력 성공!!";
		} else {
			return "실패 ㅠ";
		}
	}
	
	@GetMapping("/selectOne/{id:[0-9]+}") //  [a-z] + [A-Z] 
	public User selectOne(@PathVariable("id")String userId) {
		return userService.selectOne(userId);
	}
	
	@GetMapping("/selectMany")
	public List<User> selectMany() {
		return userService.selectMany();
	}
}
