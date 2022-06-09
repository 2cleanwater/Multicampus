package b220107;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1065 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(bf.readLine());

		int count = hans(N);
		
		bw.write(String.valueOf(count));
		bw.flush();
		bw.close();
		bf.close();		
	}
	
	public static int hans(int N) {
		int count=0;
		if (N<100) {
			count = N;
			//System.out.println("100보다 작네요");
		}else {
			count = 99;
			for(int i = 100; i <= N;i++) {
				String iS = String.valueOf(i);
				String[] iAr = iS.split("");
				int[] check = new int[iS.length()-1];
				boolean same = false;
				for(int j =0;j<iS.length()-1;j++) {
					check[j] = Integer.parseInt(iAr[j+1])-Integer.parseInt(iAr[j]);
					//System.out.println(check[j] +"가 두 수의 차");
				}
				for(int j =0;j<iS.length()-2;j++) {
					if(check[j] != check[j+1]) {
						same = false;
						break;
						// false로 바꾸고 포문을 나와야 카운트 할 수 있다.
					}else {
						same= true;
					}
				}
				if(same == true) {
					count++;
				}	
			}
		}		
		return count;
	}

}
