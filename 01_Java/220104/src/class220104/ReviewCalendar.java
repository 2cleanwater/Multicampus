package class220104;

import java.util.Scanner;

public class ReviewCalendar {

	void viewMonth(int month) {
		//입력받은 month를 이용해 2021년 month월이라는 문장을 출력하세요
		System.out.printf("2021년 %d월%n",month);
		//일요일부터 시작하는 요일을 tab만큼 띄워서 출력하시오.
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		//1~31일까지 자동으로 날짜를 달력 순서에 맞게 출력하는 코드를 작성
		for(int i=1; i<=31; i++) {
			System.out.print(i);
			if(i%7==0) {
				System.out.println();
			}
			else {
				System.out.print("\t");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// viewMonth를 호출하는 코드 작성
		ReviewCalendar vm  = new ReviewCalendar();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("input month please >>> ");
			int month = sc.nextInt();
			vm.viewMonth(month);
			System.out.println("Continue? (Yes:1, No:0) >>>");
			int cmd = sc.nextInt();
			if(cmd==0) {
				System.out.println("Good bye");
				break;
			}
		}
		sc.close();
	}

}
