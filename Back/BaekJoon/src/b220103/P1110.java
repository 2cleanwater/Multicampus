package b220103;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1110 {
	//A숫자를 잘라 B의 1의 자리, A의 1의 자리는 B의 10의자리
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String A = br.readLine();
		String B = "0";
		String C = "0";
		int count = 0;
		String N = new String(A);
		
		
		String[] AA = new String[2];
		String[] BB = new String[2];
		String[] CC = new String[2];
		
		//어레이의 크기는 0부터 시작이 아니다.
		while(true) {
			count++;
			
			if(Integer.parseInt(A)<10) {
				AA[0] = "0";
				AA[1] = A;
			}
			else {
				AA = A.split("");
			}
			//입력된 숫자 Array화
			
			B = String.valueOf(Integer.parseInt(AA[0]) + Integer.parseInt(AA[1]));
			//bw.write("B ="+ B);
			if(Integer.parseInt(B)<10) {
				BB[0] = "0";
				BB[1] = B;
			}
			else {
				BB = B.split("");
			}
			//각 자리수를 합한 수의 어레이화
			
			CC[0] = AA[1];
			CC[1] = BB[1];
			C = CC[0]+CC[1];
			
			if(Integer.parseInt(C)==Integer.parseInt(N)) {
				//bw.write(" C = "+C+"\n");
				//bw.write("마지막 카운트 " + String.valueOf(count));
				bw.write(String.valueOf(count));
				break;
			}
			else {
				//bw.write(" C = "+C+"\n");
				//bw.write("현재 카운트 " + String.valueOf(count)+"\n");
				A = String.valueOf(Integer.parseInt(C));
			}
		}
		bw.flush();
		bw.close();
		br.close();		
	}
}
