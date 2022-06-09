package p10872;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Main m = new Main();
		int answer = m.factorial(sc.nextInt());
		System.out.println(answer);
	}
	
	public int factorial(int n) {
		
		if(n<2) {
			return 1;
		}
		return factorial(n-1)*n;
	}
}
