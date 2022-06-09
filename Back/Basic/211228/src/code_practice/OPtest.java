package code_practice;

public class OPtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		float b = 3f;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a/b);
		System.out.println(a*b);
		System.out.println(a%b);
		
		int number = 123456;
		
		System.out.println(number%10);
		System.out.println((number%100-number%10)/10);
		System.out.println((number%1000-number%100)/100);
		System.out.println((number%10000-number%1000)/1000);
		System.out.println((number%100000-number%10000)/10000);
		System.out.println((number-number%100000)/100000);
		
		int number2 = 123456789;

	      do {
	         System.out.println(number2 % 10);
	         number2 = (number2 / 10);
	      } while (number2 != 0);
	}

}
