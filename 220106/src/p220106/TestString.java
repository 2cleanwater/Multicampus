package p220106;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestString ts = new TestString();
		ts.test1();
	}
	
	public void test2() {
		String studentKim = "kim,39,49,59";
		String studentLee = "lee,39,49,59";
		String studentPark = "park,39,49,59";
	}
	
	public void test1() {
		String number = "123456";
		String[] numArray = number.split("");
		int sum = 0;
		for(int i=0;i<numArray.length;i++) {
			sum = sum + Integer.parseInt(numArray[i]);
		}
		System.out.println(sum);
	}
	
	public void test1_1() {
		String number = "123456";
		
		int sum = 0;
		for(int i =0;i<number.length();i++) {
			char digitLetter = number.charAt(i);
			System.out.println(digitLetter);
			String temp = String.valueOf(digitLetter);
			int num = Integer.parseInt(temp);
			sum = sum + num;
		}
	}
	
	public void String() {
	
	}

}
