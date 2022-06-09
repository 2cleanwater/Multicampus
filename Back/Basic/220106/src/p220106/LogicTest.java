package p220106;

public class LogicTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LogicTest lt = new LogicTest();
		lt.cal_2(1);
	}
	
	//합계 구하기
	public void plus(int a,int b) {
		int plus = a+b;
		System.out.printf("합계는 %d 입니다.",plus);
	}
	
	//두개의 값 교환하기
	public void convert(int a, int b) {
		int c = 0;
		c = a;
		a = b;
		b = c;
		System.out.printf("이제 a = %d, b = %d 입니다.",a,b);
	}

	//윤년여부 확인하기
	public void leapYear(int year) {
		if(year%400==0 || (year%4==0 &&year%100!=0)) {
			System.out.println("윤년입니다.");
		}else {
			System.out.println("윤년이 아닙니다.");
		}
	}
	
	//구구단(세로)
	public void gugusero() {
		for(int j =2; j<10; j++) {
			for(int i = 1;i < 10;i++){
				System.out.printf("%d X %d = %d\n",j,i,j*i);
			}
			System.out.println();
		}
	}
	
	//구구단(가로)
	public void gugugaro() {
	
		for(int i = 1;i < 10;i++){
			for(int j =2; j<10; j++) {
				System.out.printf("%d X %d = %d\t",j,i,j*i);
			}
			
		System.out.println();
		}
	}
	//숫자분리하기
	public void separate(int n) {
		int m = 0;
		while(n>0) {
			m = n%10;
			n = n/10;
			System.out.println(m);
		}
	}
	
	//달력버젼 2021 8월 달력 1부터 시작 31로 종료
	public void cal_1() {
		System.out.println("2021년 8월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		int day = 1;
		for(int i=0;i<31;i++) {
			System.out.print(day+"\t");
			if(day%7==0) {
				System.out.println();
			}
			day = day + 1;
		}
	}
	
	// 21 1~12월 달력 배열추가
	public void cal_2(int mon) {
		int year = 2021;
		int month = mon;
		int[] spaces = new int[12];
		int[] lastDays = {31,28,31,30,31,30,31,31,30,31,30,31};
		spaces[0] = (2+31)%7;
		for(int i=1;i<12;i++) {
			spaces[i] = (spaces[i-1]+lastDays[i-1])%7;
		}
		int space = spaces[month-1];
		
		System.out.printf("%d년 %d월 %n",year,month);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for(int i=0;i<space;i++) {
			System.out.print("\t");
		}
		int day = 1;
		//    
		for(int i=0;i<lastDays[mon-1];i++) { 
			System.out.print(day+"\t");
			if((space+day)%7==0) {
				System.out.println();
			}
			day = day + 1;
		}
		
		System.out.println("\n");
	}
	// 만년달력 -> 클래스 추가
	
	// 달력만드는 엔진을 이용한 사용자 인터페이스

	//void는 리턴을 받지 않는 타입이다.
	//
}
