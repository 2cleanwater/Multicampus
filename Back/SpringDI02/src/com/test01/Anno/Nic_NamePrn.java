package com.test01.Anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//6. @Component("MyTest") �� �̿��ؼ� 
@Component("MyTest")	// <bean id="MyTest" class="com.test01.Anno.Nic_NamePrn"/>
public class Nic_NamePrn {
	
	/*
	 * <bean id="MyTest" class="com.test01.Anno.Nic_NamePrn">
	 * 	<property name = "nic_name" ref="nic_Name">
	 * </bean>		ó�� �����. 
	 */
				
	//4.
	@Autowired	// public Nic_NamePrn(Nic_Name nic_name){} �� ã�´�.
				// ���� ������ ������ public void setNic_name(Nic_Name nic_name) {}
				//�� ã�� ����ؼ� @Autowired�� ���δ�. 
	Nic_Name nic_name;

//	public void setNic_name(Nic_Name nic_name) {
//		this.nic_name = nic_name;
//	}

	@Override
	public String toString() {
		return "Nic_NamePrn [Nic_name=" + nic_name + "]";
	}
	
	
}
