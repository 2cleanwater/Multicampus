package lotto_ver2;

import java.util.ArrayList;

public class Studio_v2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studio_v2 studio = new Studio_v2();
		studio.onAir();
	}
	
	public void onAir() {
		LottoMachine_v2 machine = this.readyLottoMachine();
		System.out.println("지금부터 로또 추첨을 시작합니다.");
		machine.startMachine();
		System.out.println("지금까지 로또 추첨이었습니다.\n감사합니다.");
	}
	
	public LottoMachine_v2 readyLottoMachine() {
		LottoMachine_v2 machine = null;
		machine = new LottoMachine_v2(this.makeBall());
		return machine;		
	}
	
	public ArrayList<LottoBall_v2> makeBall() {
		ArrayList<LottoBall_v2> balls = new ArrayList<LottoBall_v2>();
		for(int i=0;i<45;i++) {
			balls.add(new LottoBall_v2(i+1));
		}
		return balls;
	}

}
