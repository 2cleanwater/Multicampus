package class211229;

public class Gugudan {

	public static void main(String[] args) {
		//2단 출력
		//9번 반복
		/*
		for(int i = 1;i <= 9;i++) {
			System.out.printf("2 X %d = %d\n",i,2*i);
		}
		//내가 푼거
		for(int i = 1;i <= 9;i++) {
			System.out.println("2X"+i+"="+(2*i));
		}
		*/
		for(int j =2; j<10; j++) {
			for(int i = 1;i < 10;i++){
				System.out.printf("%d X %d = %d\n",j,i,j*i);
			}
			System.out.println();
		}
	}
}
