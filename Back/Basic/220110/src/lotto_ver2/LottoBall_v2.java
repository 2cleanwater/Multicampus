package lotto_ver2;

public class LottoBall_v2 {
	private int ballNumber;

	public LottoBall_v2(int ballNumber){
		this.ballNumber = ballNumber;
	}
	
	public int getBallNumber() {
		return ballNumber;
	}
	
//		
//	private void setBallNumber(int ballNumber) {
//		this.ballNumber = ballNumber;
//	}
//	
//		
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "나의 번호는 "+this.ballNumber+"입니다";
	}
	
}
