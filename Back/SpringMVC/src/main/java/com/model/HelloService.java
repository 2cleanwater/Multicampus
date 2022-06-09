package com.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
	
	@Autowired
	private HelloDao helldao;
	
	public String getHello() {
		return helldao.getHello(); 
	}
}
