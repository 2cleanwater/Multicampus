package sample1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest02 {

	// spring: 선언한 bean을 호출한 다음 메서드 호출
	public static void main(String[] args) {
		
		// 1. 클래스 작성
		// 2. beans.xml (applicationContext.xml) id로 bean 등록
		// 3. ClassPathXmlApplicationContext로 2번을 찾아온다
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("sample1/applicationContext.xml");
		MessageBean bean = ac.getBean("mi", MessageImpl.class);
		bean.sayHello();
		
		bean = ac.getBean("mi02", MessageImpl.class);
		bean.sayHello();
		
		ExampleBean bean02 = ac.getBean("exampleBean", ExampleBean.class);
		System.out.println(bean02);
	}
}
