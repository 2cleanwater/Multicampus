package com.test01.Anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//6. @Component("MyTest") 를 이용해서 
@Component("MyTest")	// <bean id="MyTest" class="com.test01.Anno.Nic_NamePrn"/>
public class Nic_NamePrn {
	
	/*
	 * <bean id="MyTest" class="com.test01.Anno.Nic_NamePrn">
	 * 	<property name = "nic_name" ref="nic_Name">
	 * </bean>		처럼 만든다. 
	 */
				
	//4.
	@Autowired	// public Nic_NamePrn(Nic_Name nic_name){} 를 찾는다.
				// 만약 윗줄이 없으면 public void setNic_name(Nic_Name nic_name) {}
				//를 찾아 대신해서 @Autowired가 쓰인다. 
	Nic_Name nic_name;

//	public void setNic_name(Nic_Name nic_name) {
//		this.nic_name = nic_name;
//	}

	@Override
	public String toString() {
		return "Nic_NamePrn [Nic_name=" + nic_name + "]";
	}
	
	
}
