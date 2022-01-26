package algo220124;

public class PrimeNumberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumberMain pnm = new PrimeNumberMain();
		int n = 125472787;
		boolean flag = pnm.isPrimeNumberV2(n);
		if(flag) {
			System.out.printf("주어진 수 %d 는 소수입니다.", n);
		} else {
			System.out.printf("주어진 수 %d 는 합성수입니다.", n);
		}
	}
	// 솟수 여부만 판단해라
	public boolean isPrimeNumber(int n) {
		boolean flag = false;
		int checkCount = 0;
		for(int i=1;i<n+1;i++) {
			if(n%i==0) {
				//for 끝날때까지 2번 들어오면 소수
				checkCount++;
			}
		}
		
		if(/*들어온 횟수가 2회이면*/checkCount==2) {
			//소수
			//System.out.printf("주어진 수 %d 는 소수입니다.", n);
			flag = true;
		}
		
		return flag;
	}
	
	//메소드를 선언해서 구현하시오 (소수인 조건은 나누어 떨어지는 경우가 한번도 없는 경우)
	public boolean isPrimeNumberV2(int n) {
		boolean flag = false; // 소수의 의미
		int count = 0;
		for(int i=2;i<n;i++) {
			count = count + 1;
			if(n%i==0) {
				//이곳에 들어오면 무조건 합성수이다.				
				flag = true; //합성수의 의미
				break;
			}
		}
		System.out.printf("나눈 횟수 %d %n", count);
		return !flag;
	}

}
