package b211229;
import java.util.Scanner;

public class P2753 {
	// 윤년을 구해라
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		// 연도를 입력받음
		
		if(year%400==0 || (year%4==0 &&year%100!=0)) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
		
		sc.close();
	}
}
