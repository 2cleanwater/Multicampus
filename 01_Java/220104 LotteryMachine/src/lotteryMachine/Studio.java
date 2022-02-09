package lotteryMachine;

public class Studio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studio studio = new Studio();
		studio.onAir();
	}
	
	public void onAir( ) {
		LottoMachine machine = this.ready();
		System.out.println("추첨을 시작합니다.");
		LottoMachine.startMachine();
		System.out.println("추첨이 끝났습니다.");
		
	}
	
	public LottoMachine ready() {
		LottoMachine machine = null;
		System.out.println("로또 공을 생성합니다.");
		System.out.println("로또 공을 머신에 주입합니다.");
		machine = new LottoMachine(null);
		return machine;
	}

}
