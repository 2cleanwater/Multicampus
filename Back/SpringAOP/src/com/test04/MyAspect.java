package com.test04;

import org.aspectj.lang.JoinPoint;

public class MyAspect  {
		
	
	public void before(JoinPoint joinPoint) {
		System.out.println("��Ʈ�� �� �α��� �� �����Ѵ�. �⼮ üũ ");
	}
	
	public void throwing(JoinPoint joinPoint, Throwable e) {
	System.out.println("��Ƽ ķ�۽� ���� �ϴ� �� : "+e);
	}
	

	public void After(JoinPoint joinPoint) {
	System.out.println("�α׾ƿ� �Ѵ�.");
}
	
}
