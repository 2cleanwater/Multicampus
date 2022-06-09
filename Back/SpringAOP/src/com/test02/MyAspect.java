package com.test02;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


// invoke()라는 재정의 메소드를 통해서 가로채기한 메소드를 실행하고 리턴하는 인터페이스.
//<property name="advice" ref="myAdvice"></property>  <= 얘로 인해서 실행 
public class MyAspect implements MethodInterceptor {

	//8. 가로채기한 메소드들 가지고 invoke가 실행된다. 
	@Override		//13~18줄까지 공통사항.
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		System.out.println("method "+invocation.getMethod()+" is called on "+
				invocation.getThis()+" with args "+invocation.getArguments());
		Object res =null;
		System.out.println("노트북 줌 로그인 후 실행한다. 출석 체크 ");
		try {
			//핵심로직
			res = invocation.proceed();	// G7_Class, Student classWork()
		}catch(Exception e){
			System.out.println("멀티 캠퍼스 공사 하는 날");
		}finally {
			System.out.println("퇴실 카드 체크.");
		}
		System.out.println("로그아웃 한다.");
		
		
		System.out.println("method "+invocation.getMethod()+" returns "+res);


		return res;
	}

}
