package b211229;
import java.util.*;

public class P14681 {

	//사분면 고르기
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		if(X > 0 && Y > 0) {
			System.out.println("1");
		}
		else if(X < 0 && Y > 0) {
			System.out.println("2");
		}
		else if(X < 0 && Y < 0) {
			System.out.println("3");
		}
		else {
			System.out.println("4");
		}
		sc.close();
	}

}
