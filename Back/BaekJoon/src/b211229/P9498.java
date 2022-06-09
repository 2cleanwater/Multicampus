package b211229;
import java.util.*;

public class P9498 {

	//A를 입력받아 성적별로 나누기
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		
		if(A<=100 && A>=90) {
			System.out.println("A");
		}
		else if(A<=89 && A>=80) {
			System.out.println("B");
		}
		else if(A<=79 && A>=70) {
			System.out.println("C");
		}
		else if(A<=69 && A>=60) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
		sc.close();
	}

}
