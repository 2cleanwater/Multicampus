package com.test05;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;



//@로 호출
//@Component("myAdvice")
@Aspect
public class MyAspect  {
	
	//<aop:pointcut expression="execution(* classWork())" id="myClass"/> 아래 코드랑 같은 의미 
	// * 의 의미는 모든 메서드 혹은 모든 패키지 
	@Pointcut("execution(* classWork())")
	private void myClass() {}	// 밖에서 보이면 안되서 private 이고 {} 안이 비어있어야함.

	@Before("myClass()")
	public void before(JoinPoint joinPoint) {
		//ProceedingJoinPoint 를 사용할 수 있다.
		System.out.println("노트북 줌 로그인 후 실행한다. 출석체크 ");
	}
	

	@After("myClass()")
	public void After(JoinPoint joinPoint) {
		System.out.println("로그아웃 한다.");
	}
}
