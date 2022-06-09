package com.test03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.PropertySource;


//2. @Configuration	//<beans/> �� ���� ������ @Bean�� ��ü�� �����ؼ� <bean/>���� ���� 
@Configuration	//<beans/> ��� ���� �ǹ�
@PropertySource("classpath:/com/test03/a.properties") //3. ���ҽ��� ȣ�� 
public class AppConfig {
	
	//@Bean �갡 ������ component ���� �ȵȴ�, ������ �̸����� �ټ� �ִ�. @Bean({"b1", "b2"}) 
	@Bean(name="school")	
	@DependsOn("student")	// @DependsOn�� ���� ��带 �����Ұ� �ƴϸ� �ִ°� ����. 
							//schoolȣ���Ҷ� student�� ���� ȣ���ض�. 
	public School getSchool() {
		
		School sm = new School();
		sm.setGrade(3);
		return sm;
		
	}
	@Bean(name="student")
	public Student getStudent() {
		Student s = new Student();
		s.setAddress("11111111111");
		return s;
	}
	
}
