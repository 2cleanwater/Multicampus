package p220111;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadTest tt = new ThreadTest();
		tt.test2();
	}

	private void test2() {
		// TODO Auto-generated method stub
		//Runnable 객체를 이용한 쓰레드의 실행 코드 작성
		//Runnable을 구현한 클래스를 만들고
		//객체로 생성하여 Thread와 연결하세요
		// Runnable을 이용하는 이유 : 클래스 상속이 중복될 수 없기 때문에
		Runnable my = new MyRunnable();
		Runnable your = new YourRunnable();
		Thread t1 = new Thread(my);
		Thread t2 = new Thread(new YourRunnable());
		t1.start();
		t2.start();

	}

	private void test1() {
		// TODO Auto-generated method stub
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();
	}
}
