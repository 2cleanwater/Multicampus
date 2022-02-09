package class211230;

public class TestCheck1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1+(-2)+3+(-4)+.....+9+(-10)
		TestCheck1 tc = new TestCheck1();
		tc.test1();
		
	}
	public void test5() {
		int number = 1;
		int sum = 0;
		while(true) {
			int temp = 1;
			if(number%2==0) {
				temp = -1;
			}
			sum = sum+number*temp;
			if(sum>=100) {
				break;
			}
			number = number + 1;
		}
		System.out.printf("number is %d , sum is %d %n",number,sum);
	}
	
	public void test4() {
		//1~10까지 출력하는 for문 작성하시오
		int n = 1;
		int total = 0;
		for(int k=0;k<10;k++) {
			int number = 1;
			int sum = 0;
			for(int i=0;i<n;i++) {
				sum = sum+number;
				//System.out.println(number);
				number = number + 1;
			}
			n = n + 1;
			total = total + sum;
			System.out.println(sum);
		}
		System.out.println(total);
	}
	public void test3() {
		//4-2
		int number = 1;
		int sum = 0;
		for(int i=0;i<20;i++) {
			if(!(number%2==0 || number%3==0)) {
				sum = sum+number;
			}
			number = number + 1;
		}
		System.out.println(sum);
	}
	public void test2() {
		//합계(누적) 로직
		//1~10까지 출력하는 for문 작성하시오
		int number = 1;
		int sum = 0;
		for(int i=0;i<10;i++) {
			sum = sum+number;
			System.out.println(number);
			number = number + 1;
		}
		System.out.println(sum);
		
			
	}
	public void test1() {
		int number = 123;
		//123456->12345->1234->123->12->1
		// 위의 number를 한자리씩 분리하여 출력하시오
		// 뒤에서 부터 분리하시오
		int sum = 0;
		while(true) {
			if(number==0) {
				break;
			}
			int splitNumber = number % 10;
			sum = sum + splitNumber;
			System.out.println(splitNumber);
			number = number / 10;
		}
		System.out.println(sum);

	}

}
