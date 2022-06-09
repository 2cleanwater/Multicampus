

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class TypeCheck {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int b = Integer.parseInt(st.nextToken());
		int a = 1;
		String c = "fuck";
		bw.write(c.getClass().getName());
		bw.write(((Object)b).getClass().getName());
		//개체에서만 호출할수 있는 메서드이기 때문에 프리미티브 데이터 유형을 확인하려면 Object로 캐스팅해야한다.
		bw.flush();
		br.close();
		bw.close();		
	}
}
