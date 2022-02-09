package lotto_ver2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class LottoMachine_v2 {
	ArrayList<LottoBall_v2> balls;
	LottoMachine_v2(ArrayList<LottoBall_v2> balls){
		this.balls = balls;
	}
	
	void startMachine() {
		System.out.println("로또 번호를 뽑습니다.");
		Integer[] choiceBalls = new Integer[6]; 
		int count = 0;
		while(true) {
			LottoBall_v2 ball = this.getBall();
			
			choiceBalls[count] = ball.getBallNumber();
			System.out.printf("뽑힌 공은 %d번입니다. %n",ball.getBallNumber());
			count += 1;
			
			
			if(count==6) {
				break;
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Arrays.sort(choiceBalls);
		System.out.printf("제532회차 추첨된 번호는 %s 입니다.%n",Arrays.toString(choiceBalls));
	}
	void shuffle(LottoBall_v2[] balls) {
		
	}
	LottoBall_v2 getBall() {
		LottoBall_v2 ball = null;
		Random r = new Random();
		int idx = r.nextInt(balls.size());
		ball = balls.remove(idx);
		System.out.println("로또볼을 하나 선택했습니다.");
		return ball;
	}
}


