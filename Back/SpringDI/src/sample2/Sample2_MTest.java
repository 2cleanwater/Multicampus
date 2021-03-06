package sample2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Sample2_MTest {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("sample2/MyBeans.xml");
		
		Address myaddr01 = ac.getBean("myaddr01", Address.class);
		System.out.println(myaddr01);
		
		Address myaddr02 = ac.getBean("myaddr02", Address.class);
		System.out.println(myaddr02);
		
		Address myaddr03 = ac.getBean("myaddr03", Address.class);
		System.out.println(myaddr03);
		
		ListAddress mylist01 = ac.getBean("mylist01", ListAddress.class);
		System.out.println(mylist01);
		System.out.println(mylist01.getAddr());
		
		mylist01 = ac.getBean("mylist02", ListAddress.class);
		System.out.println(mylist01);
		System.out.println(mylist01.getAddr());
		
		mylist01 = ac.getBean("mylist03", ListAddress.class);
		System.out.println(mylist01);
		System.out.println(mylist01.getAddr());
		
		mylist01 = ac.getBean("mylist04", ListAddress.class);
		System.out.println(mylist01);
		System.out.println(mylist01.getAddr());
	}

}
