package com.test05;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Pointcut;



////ȯ�漳�� beans.xml <aop:>�� ����
//public class MyAspect02 {
//	
//	@Before("myClass()")
//	public void before(JoinPoint joinPoint) {
//		System.out.println("��Ʈ�� �� �α��� �� �����Ѵ�. �⼮üũ ");
//	}
//
//	@After("myClass()")
//	public void After(JoinPoint joinPoint) {
//		System.out.println("�α׾ƿ� �Ѵ�.");
//	}
//
//}


public class MyAspect02  {

	public void before(JoinPoint joinPoint) {
		System.out.println("��Ʈ�� �� �α��� �� �����Ѵ�. �⼮ üũ ");
	}
	

	public void After(JoinPoint joinPoint) {
	System.out.println("�α׾ƿ� �Ѵ�.");
}
	
}
