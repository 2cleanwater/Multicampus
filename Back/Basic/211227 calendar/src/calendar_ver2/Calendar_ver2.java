package calendar_ver2;

import java.util.Calendar;
import java.util.Scanner;

public class Calendar_ver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//실행부
		Calendar_ver2 cv = new Calendar_ver2();
		Calendar cal = Calendar.getInstance();
		
		System.out.println("달력 프로그램을 시작합니다.");
		cv.calOut();
		System.out.println("달력프로그램을 종료합니다.\n이용해주셔서 감사합니다.");
		//윤년체크
	}
	public void calOut() {
		//달력 출행부
		Scanner sc = new Scanner(System.in);
		System.out.println("년도를 입력해주십시오.");
		int year = sc.nextInt();
		System.out.println("월를 입력해주십시오. (0을 입력하면 전체 출력)");
		int month = sc.nextInt();
		
	}

}
