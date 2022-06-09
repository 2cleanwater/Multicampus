package b220106;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2942_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String croatia = bf.readLine();
		
		P2942_2 B = new P2942_2();
		String answer = String.valueOf(B.alp(croatia));
		
		bw.write(answer);
		bw.flush();
		bw.close();
		bf.close();
	}
	
	public int alp(String croatia) {
		croatia = croatia.replaceAll("c=","a");
		croatia = croatia.replaceAll("c-","a");
		croatia = croatia.replaceAll("dz=","a");
		croatia = croatia.replaceAll("d-","a");
		croatia = croatia.replaceAll("lj","a");
		croatia = croatia.replaceAll("nj","a");
		croatia = croatia.replaceAll("s=","a");
		croatia = croatia.replaceAll("z=","a");
		int count = croatia.length();
		return count;
	}

}
