package com.test.mytest;

public class Address {
	
	private String addr;
	private String name;
	private String tel;
	
	public Address(String addr, String name, String tel) {
		super();
		this.addr = addr;
		this.name = name;
		this.tel = tel;
		// TODO Auto-generated constructor stub
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "Address [addr=" + addr + ", name=" + name + ", tel=" + tel + "]";
	}

}
