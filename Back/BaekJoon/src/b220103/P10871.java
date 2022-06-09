package b220103;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P10871 {
	// 수열에서 X보다 작은 수 출력
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		int[] A = new int[N];
		for(int i =0; i<N; i++) {
			A[i] = Integer.parseInt(st2.nextToken());
			if(A[i]<X) {
				bw.write(String.valueOf(A[i] + " "));
			}			
		}

		bw.flush();
		bw.close();
		br.close();
	}

}
