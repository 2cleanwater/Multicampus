package b220107;

public class P4673 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] check = new boolean[10001];
		
		for(int i = 0; i<10001;i++) {
			if(ns(i)<10001) {
				check[ns(i)] = true;
			}
		}
		for(int i = 0; i<10001;i++) {
			if(!check[i]) {
				System.out.println(i);
			}	
		}
	}
	public static int ns(int n) {
		int dn = n;
		while(n!=0) {
			dn = dn + (n%10);
			n = n/10;
		}
		return dn;
	}

}
