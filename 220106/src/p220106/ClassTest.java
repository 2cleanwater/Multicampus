package p220106;

import java.util.Random;

public class ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ClassTest().test1();
		// 생성하면서 바로 호출도 가능하다. 
	}
	
	public void test1() {
		//Math
		double rnd1 = Math.random();// 0.0<=rnd<1.0
		System.out.println(rnd1);
		//Random
		Random r = new Random();
		int rnd2 = r.nextInt(100); //0<=rnd2<100
		System.out.println(rnd2);
		//임의의 수가 1000~9999까지의 수중에서 선택되도록 하는 코드 작성하세요.
		int rnd3 = r.nextInt(1000,10000);
		System.out.println(rnd3);
		//중복되지 않는 4자리수 출력하시오.
		
	}
	
	//Random
	
	//Scanner
	
	
	
	//String

}
