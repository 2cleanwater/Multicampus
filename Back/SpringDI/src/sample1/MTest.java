package sample1;

public class MTest {

	public static void main(String[] args) {
		// 객체를 생성한 다음 생성된 객체의 주소로 메서드 호출
		
		// 1. 기본 생성자
		MessageBean mi = new MessageImpl();
		mi.sayHello();
		
		// 2. 매개인자 전달 생성자
		MessageBean mi2 = new MessageImpl("melon", 7000);
		mi2.sayHello();
	}
}
