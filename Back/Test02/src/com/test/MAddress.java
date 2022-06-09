package com.test;

/*
 * 이름 주소 전화번호
 * 홍길동 서울 02-0000
 * 정길동 인천 032-0000
 * 박길동 부산 051-0000
 */

public class MAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// M/M -> ds_data segment, cs_code segment, static, heap, stack 
		Address a1 = new Address(); // new : 갹체를 생성자를 통해서 생성하면서 메모리(자유영역공간)에 로드 시킨다. 
		a1.setName("홍길동");
		a1.setAddr("서울");
		a1.setTel("02-0000");
		System.out.println(a1);
		System.out.println(a1.getAddr());
		
		Address a2 = new Address(); // new : 갹체를 생성자를 통해서 생성하면서 메모리(자유영역공간)에 로드 시킨다. 
		a2.setName("정길동");
		a2.setAddr("인천");
		a2.setTel("032-0000");
		System.out.println(a2);
		System.out.println(a2.getAddr());
		
		Address a3 = new Address(); // new : 갹체를 생성자를 통해서 생성하면서 메모리(자유영역공간)에 로드 시킨다. 
		a3.setName("박길동");
		a3.setAddr("부산");
		a3.setTel("051-0000");
		System.out.println(a3);
		System.out.println(a3.getAddr());
		
		Address a4 = new Address(); // new : 갹체를 생성자를 통해서 생성하면서 메모리(자유영역공간)에 로드 시킨다. 
		a4.setName("홍길동");
		a4.setAddr("서울");
		a4.setTel("02-0000");
		System.out.println(a4);
		System.out.println(a4.getAddr());
		
//		*   생성자  
//	     *    1. 생성자는 반환형은 없고   클래스 이름과 동일하다. 
//	     *    2. 오버로드 할 수 있다. 
//	     *    3. 상속되지 않는다. 
//	     *    4. 멤버 변수 초기화의 목적을 가진다. 
//	     *    5. 생성자를 명시하지 않으면  기본 생성자가 제공된다. 
//	     *    6. 생성자를 명시하지 않으면 기본 생성자가 호출되어 객체가 생성되고 
//	     *     생성자를 명시하면 명시된 생성자가 호출된다.  
//	     *    7. 생성자는 객체를 생성할 때 (new) 단 한번만 호출되어 생성된다
		Address[] ar = new Address[3];
		ar[0] = new Address();
		ar[1] = new Address();
		ar[2] = new Address();
		for(Address res: ar) {
			System.out.println(res);
		}
	}

}
