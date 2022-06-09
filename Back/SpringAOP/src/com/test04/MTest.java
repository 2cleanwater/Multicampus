package com.test04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		//1. context_load 
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/test04/beans.xml");
		
		//3. student
		Person p = ac.getBean("student",Person.class);
		
		//4. 메소드를 실행  value = "execution(public * *(..)) 
		p.classWork();// 얘가 호출되면 xml로 다시 간다. 
		
		((AbstractApplicationContext) ac).close();// 마지막 소멸 

	}

}
