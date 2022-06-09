package lotteryMachine;

import java.util.Random;

public class LottoMachine {

	// TODO Auto-generated method stub
	LottoBalls[] balls;
	LottoMachine(LottoBalls[] balls){
		this.balls = balls;
	}
	
	void startMachine() {
		System.out.println("로또번호를 뽑습니다.");
		for(int i = 0; i <6; i++) {
			LottoBalls ball = this.getBall();
		}
	}
	
	LottoBalls getBall() {
		LottoBalls ball = null;
		Random r = new Random();
		for(int i=0;i<6;i++) {
			int rndball
		}
		return ball;
		
	}

}
