package p220106;

public class C220106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C220106 te = new C220106();
		te.test1();
		C220106 te2 = new C220106();
		te2.test2();
	}
	
	public void test1() {
		int a = 1;
		int b = 1;
		if(a==b) {
			System.out.println("==");
		} else {
			System.out.println("!==");
		}
	}
	
	public void test2() {
		//string 인스턴스 생성
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		System.out.printf("str1 = %s str2 = %s \n",str1, str2);
		if(str1==str2) {
			System.out.println("str1==str2");
		}else {
			System.out.println("str1!=str2");
		}
		// 정답은 같지 않다!!!!!!! 주소로 비교되기 때문.
		
		if(str1.equals(str2)) {
			System.out.println("str1.equals(str2");
		}else {
			System.out.println("!str1.equals(str2");
		}
	}
}
