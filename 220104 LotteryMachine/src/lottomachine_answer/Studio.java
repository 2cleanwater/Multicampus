package lottomachine_answer;

public class Studio {

	public static void main(String[] args) {
		Studio studio = new Studio();
		studio.onAir();
	}
	public void onAir() {
		LottoMachine machine = this.readyLottoMachine();
		System.out.println("지금부터 로또 추첨을 시작합니다");
		machine.startMachine();
		System.out.println("지금까지 로또 추첨을 완료했습니다. \n 감사합니다 " );
	}
	public LottoMachine readyLottoMachine() {	//로또 기계 준비
		LottoMachine machine = null;// null은 어떻게 만들지 결정안했습니다
		System.out.println("로또 공을 생성합니다");
		System.out.println("로또 공을 머신에 주입합니다");
		machine = new LottoMachine(null);
		return machine;
	}
}
