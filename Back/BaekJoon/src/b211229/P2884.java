package b211229;
import java.util.*;

public class P2884 {

	//시간 15분 빼기
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if(M>=45) {
			M = M -45;
		}
		else if(M<45) {
			if(H>0) {
				H--;
			}
			else if(H==0) {
				H = 23;		
			}
			M = 60-(45-M);
		}
						
		System.out.println(H+" "+M);
		sc.close();
	}
}

// M이 45분인 케이스를 고려하지않았다!
// M이 0이되면 60이 되는 결과를 초래했다.