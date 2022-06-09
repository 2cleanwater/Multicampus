package class211230;

public class totalsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0, total= 0;
		for(int i = 1; i <=10; i++) {
			sum += i;
			System.out.println(sum);
			total += sum;
		}
			System.out.println(total);
	}
}
