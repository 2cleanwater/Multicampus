package basicForm;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Buffer {
	// buffer를 이용한 합산
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		/* 
		 * String s = bf.readline();으로 string으로 받은뒤
		 * String array[] = s.split(" "); 식으로 데이터를 받는다.
		 */
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");;
		//int A = Integer.parseInt(st.nextToken());
		
		String B = st.nextToken();
		// int 형식의 값은 출력되지 않기 때문에 스트링 값만 출력 해야한다 
		bw.write(B);

		bw.flush();
		br.close();
		bw.close();
	}
}

