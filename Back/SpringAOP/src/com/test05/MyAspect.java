package com.test05;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;



//@�� ȣ��
//@Component("myAdvice")
@Aspect
public class MyAspect  {
	
	//<aop:pointcut expression="execution(* classWork())" id="myClass"/> �Ʒ� �ڵ�� ���� �ǹ� 
	// * �� �ǹ̴� ��� �޼��� Ȥ�� ��� ��Ű�� 
	@Pointcut("execution(* classWork())")
	private void myClass() {}	// �ۿ��� ���̸� �ȵǼ� private �̰� {} ���� ����־����.

	@Before("myClass()")
	public void before(JoinPoint joinPoint) {
		//ProceedingJoinPoint �� ����� �� �ִ�.
		System.out.println("��Ʈ�� �� �α��� �� �����Ѵ�. �⼮üũ ");
	}
	

	@After("myClass()")
	public void After(JoinPoint joinPoint) {
		System.out.println("�α׾ƿ� �Ѵ�.");
	}
}
