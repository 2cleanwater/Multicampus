package com.test;

/*
 * 이름 주소 전화번호
 * 홍길동 서울 02-0000
 * 정길동 인천 032-0000
 * 박길동 부산 051-0000
 */
// 멤버변수는 은닉화 private하고 오픈된 public 메소드를 통해서 값 전달 및 변경하고(setter) 리턴하는(getter) 구조
public class Address { //public class Address extends Object{}
	private String name;
	private String addr;
	private String tel;
	
	
	
	
	public Address() { // 명시된 기본 생성자 _멤버변수 초기화
		super(); // this = 현재 오브젝트를 지칭하는 연산자
		// TODO Auto-generated constructor stub
		this.addr=null;
		this.tel=null;
	}
	
	public Address(String name, String addr, String tel) {
		super();
		this.name = name;
		this.addr = addr;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "Address [name=" + name + ", addr=" + addr + ", tel=" + tel + "]";
	}
	
	
	
}
