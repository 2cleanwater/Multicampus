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
		
		//4. �޼ҵ带 ����  value = "execution(public * *(..)) 
		p.classWork();// �갡 ȣ��Ǹ� xml�� �ٽ� ����. 
		
		((AbstractApplicationContext) ac).close();// ������ �Ҹ� 

	}

}
