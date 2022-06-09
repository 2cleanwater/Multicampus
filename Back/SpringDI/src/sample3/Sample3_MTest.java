package sample3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Sample3_MTest {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("sample3/applicationContext.xml");
		
		UserVo mvo = ac.getBean("mvo", UserVo.class);
		System.out.println(mvo.getMy_date());
		System.out.println(mvo.getPer());
	}
}
