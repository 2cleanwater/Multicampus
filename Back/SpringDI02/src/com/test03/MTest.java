package com.test03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MTest {

	public static void main(String[] args) {
		// 1. context�ε� register(AppConfig.class)�� ���� 
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		((AnnotationConfigApplicationContext) ctx).register(AppConfig.class);
		
		
		((AbstractApplicationContext) ctx).refresh();

		
		School st = ctx.getBean("school", School.class);
		System.out.println(st.toString());
		ctx.close();
	}

}
