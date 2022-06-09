package com.test02;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


// invoke()��� ������ �޼ҵ带 ���ؼ� ����ä���� �޼ҵ带 �����ϰ� �����ϴ� �������̽�.
//<property name="advice" ref="myAdvice"></property>  <= ��� ���ؼ� ���� 
public class MyAspect implements MethodInterceptor {

	//8. ����ä���� �޼ҵ�� ������ invoke�� ����ȴ�. 
	@Override		//13~18�ٱ��� �������.
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		System.out.println("method "+invocation.getMethod()+" is called on "+
				invocation.getThis()+" with args "+invocation.getArguments());
		Object res =null;
		System.out.println("��Ʈ�� �� �α��� �� �����Ѵ�. �⼮ üũ ");
		try {
			//�ٽɷ���
			res = invocation.proceed();	// G7_Class, Student classWork()
		}catch(Exception e){
			System.out.println("��Ƽ ķ�۽� ���� �ϴ� ��");
		}finally {
			System.out.println("��� ī�� üũ.");
		}
		System.out.println("�α׾ƿ� �Ѵ�.");
		
		
		System.out.println("method "+invocation.getMethod()+" returns "+res);


		return res;
	}

}
