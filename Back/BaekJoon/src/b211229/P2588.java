package b211229;
import java.util.Scanner;

public class P2588 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		String Btext = String.valueOf(B);
		String[] BAry = Btext.split("");

		for(int i = 2; i >= 0; i-- ) {
			System.out.printf("%d\n",A*Integer.valueOf(BAry[i]));
		}
		System.out.print(A*B);
		sc.close();
	}

}

// String을 선언할 때 : String[] 변수명 = 형식으로 저장.
// String.valueOf, Integer.valueOf로 폼 변경 가능
// split()으로 단어 잘라내기