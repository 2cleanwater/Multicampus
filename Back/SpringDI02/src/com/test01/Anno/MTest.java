package com.test01.Anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


// 1. application load 
public class MTest {// ���α׷��� ������ 

	public static void main(String[] args) {
		
		//2.Context load : Bean.xml �� ������ü�� �޸𸮿� �ε�� �ּҸ� constext������ ���� 
	ApplicationContext context = 
			new ClassPathXmlApplicationContext(
					new String[] {"com/test01/Anno/Bean.xml"});
	
	//7. ��ϵ� �� ���丮�� ��ü �� MyTest��� ��<bean/>�� ȣ�� �Ѵ�. 
	Nic_NamePrn prn = context.getBean("MyTest", Nic_NamePrn.class);
	System.out.println(prn);

	}

}
