package algo220126;

public class RecurTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecurTest rt = new RecurTest();
		rt.test1();
	}
	
	public void test1() {
		//this.fac2(5);//4*3*2*1
		//System.out.println(result);
		this.gcdV2(118, 24);
		int result = this.gcdV3(3, 12);
		System.out.println("최대공약수 in test1 is "+result);
	}
	
	public int fac(int n) {
		int result = 0;
		if(n==1) {
			System.out.printf("%d = ", n);
			result = 1;
		} else if(n>1) {
			System.out.printf("%d X ", n);
			result = n * fac(n-1);
		}
		return result;
	}
	
	public void fac2(int n) {
		//재귀를 사용하지 않고 5! 계산하기  5 X 4 X 3 X 2 X 1 = 120
		int number = n;
		int result = 1;
		String sign = "X";
		for(int i=0;i<n;i++) {
			if(i==n-1) {
				sign = "=";
			}
			result = result * number;
			System.out.printf("%d %s ", number, sign);
			number = number - 1;
		}
		System.out.println(result);
		
	}
	
	//비재귀법으로 최대공약수 구하기
	public void gcd(int n, int m) {
		// n>m
		// n%m==0이면 m은 최대공약수
		// n%m==k이면 m%k가 0인지 아닌지 판별한다.(m이 1일때까지)
		while(true) {
			int result = n%m;
			if(result==0) {
				System.out.printf("최대공약수 %d %n",m);
				break;
			} else {
				n = m;
				m = result;
			}
		}
	}
	
	//재귀방법
	public void gcdV2(int n, int m) {
		int result = n%m;
		if(result==0) {
			System.out.printf("재귀방법 최대공약수 %d %n",m);
		} else {
			gcdV2(m,result);
		}
	}
	
	public int gcdV3(int n,int m) {
		return n%m==0?m:gcdV3(m,n%m);
	}

}
