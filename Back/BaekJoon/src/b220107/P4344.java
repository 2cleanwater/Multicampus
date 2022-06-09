package b220107;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P4344 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int c = Integer.parseInt(bf.readLine());
		while(c>0) {
			String st = bf.readLine();
			String s = String.format("%.3f", per(st));
			bw.write(s+"%"+"\n");
			c--;
		}
		
		bw.flush();
		bw.close();
		bf.close();
	}
	
	public static float per(String st) {
		 float avr = 0;
		 float per = 0;
		 int sum = 0;
		 float students = 0;
		 String [] scoreSt = (st.split(" "));
		 for (int i=1; i<scoreSt.length;i++) {
			 sum = sum + Integer.parseInt(scoreSt[i]);
			 
		 }
		 avr = sum/Integer.parseInt(scoreSt[0]);
		 System.out.println(avr);
		 for (int i=1; i<scoreSt.length;i++) {
			 if((Integer.parseInt(scoreSt[i]))>avr) {
				 students++;
				 System.out.println();
			 }
		 }
		 System.out.println(students);
		 per = (float) (students/Float.parseFloat(scoreSt[0])*100);
		 
		 return per;
	}

}
