package com.test03;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;

	@Aspect
	public class MyAspect  {
		
	@Before("execution(public void com.test03.*.*(..))")
	public void before(JoinPoint joinPoint) {
		System.out.println("��Ʈ�� �� �α��� �� �����Ѵ�. �⼮ üũ ");
	}
	@AfterThrowing(pointcut="execution(public * *(..))", throwing="e")
	public void throwing(JoinPoint joinPoint, Throwable e) {
	System.out.println("��Ƽ ķ�۽� ���� �ϴ� �� : "+e);
	}
	
	@After("execution(public * *(..))")
	public void After(JoinPoint joinPoint) {
	System.out.println("�α׾ƿ� �Ѵ�.");
}
	
}
