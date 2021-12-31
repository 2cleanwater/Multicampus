package class211230;

public class Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 12345678;
		
		while(number != number/10) {
			int splitnumber = number % 10;
			System.out.println(splitnumber);
			number = number/10;
		// number가 int이기 때문에 10으로 나누면 1보다 작은 실수가 되어 0으로 계산된다.
		}
	}
}