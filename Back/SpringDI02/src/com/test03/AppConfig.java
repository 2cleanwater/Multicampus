package com.test03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.PropertySource;


//2. @Configuration	//<beans/> 로 인해 각각의 @Bean의 객체를 생성해서 <bean/>으로 관리 
@Configuration	//<beans/> 얘랑 같은 의미
@PropertySource("classpath:/com/test03/a.properties") //3. 리소스로 호출 
public class AppConfig {
	
	//@Bean 얘가 있으면 component 쓰면 안된다, 여러개 이름으로 줄수 있다. @Bean({"b1", "b2"}) 
	@Bean(name="school")	
	@DependsOn("student")	// @DependsOn은 단일 모드를 실행할게 아니면 주는게 좋다. 
							//school호출할때 student를 먼저 호출해라. 
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
