package b211229;
import java.util.*;

public class P10950 {

	//케이스 개수만큼 A+B 반복
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i = 1; i<=T; i++){
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println(A+B);
		}
		
		sc.close();
	}

}

//ln을 하지 않아 틀렸다.