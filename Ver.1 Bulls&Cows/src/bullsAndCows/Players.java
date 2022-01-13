package bullsAndCows;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Players {
	static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	//숫자를 입력받음
	//숫자를 어레이로 처리해서 출력
	public static int[] ThrownBalls() throws IOException{
		// br.readline을 입력받아
		// String[]을 int[]로 변환하여
		// int[]를 리턴함
		System.out.println("입력을 받습니다.");
		String input = bf.readLine();
		String[] inputAry = input.split("");
		int[] playerBalls = new int[inputAry.length];
		for(int i = 0;i<inputAry.length;i++) {
			playerBalls[i] = Integer.parseInt(inputAry[i]);
			System.out.println(playerBalls[i]);
		}
		return playerBalls;
	}
}
