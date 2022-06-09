package b211229;
import java.util.*;

public class P8393 {

	//N!
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;

		while(n>0)
		{
			ans += n;
			n--;
		}
		System.out.print(ans);
		sc.close();
	}
}
