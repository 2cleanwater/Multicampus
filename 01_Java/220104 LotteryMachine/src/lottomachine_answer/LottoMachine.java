package lottomachine_answer;
import java.util.Random;
public class LottoMachine {// 추첨 기계
// 데이타 는 공
	LottoBall[] balls; // 공이 여러개니까 배열로 만듦
	LottoMachine(LottoBall[] balls){
		this.balls = balls;
	}
	
	void startMachine() {// 하나씩 뽑는 기계
		System.out.println("로또 번호를 뽑습니다");
		for(int i=0;i<6;i++) {
			LottoBall ball = this.getBall();
		}
	}
	
	LottoBall getBall() {	// 로또 볼
		LottoBall ball = null;
		Random r = new Random();
		// 1~45까지의 수 6개를 생성하는 코드를 작성하시오
		for(int i=0;i<6;i++) {
		int rnd = r.nextInt(45)+1;	//0<=rnd<45
		System.out.printf("%2d ", rnd); // format에서 %2d는 2칸 띄어라.
		}System.out.println();
		return ball;
	}
}
