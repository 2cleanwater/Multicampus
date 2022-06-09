package com.test01.Anno;

import org.springframework.stereotype.Component;


//5. class Nic_Name 를 @Component 을 통해서 객체가 생성된다.
@Component	//<= <bean id="nic_Name" class="com.test01.Anno.Ni_Name/>  태그로 인지하여 생성된다
public class Nic_Name {

	@Override
	public String toString() {
		return "Nic_name [야옹이]";
	}

}
