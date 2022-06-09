package b211229;
import java.util.*;

public class P2739 {

	//구구단을 외자
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		
		for(int i = 1;i < 10;i++){
			System.out.printf("%d * %d = %d\n",A,i,A*i);
		}
		
		sc.close();
	}

}
