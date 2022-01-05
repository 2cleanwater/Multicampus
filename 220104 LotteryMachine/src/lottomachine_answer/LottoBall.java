package lottomachine_answer;

public class LottoBall {// 공
	int ballNumber; // 공의 번호 숫자 정보와 중복처리(내가 뽑힌적이 있다없다)가 있어야 함.
	boolean isSelected;	//	LottoBall 객체가 뽑혔는지 안 뽑혔는지를 확인하는 용도의 변수이고,
	//	기본 값이 false이니 생성자에서 따로 초기화하진 않는다
	//숫자가 원래 있는 상태에서 나와야 함. 즉, 생성자 
	LottoBall(int ballNumber){
		this.ballNumber = ballNumber;
	}
}
