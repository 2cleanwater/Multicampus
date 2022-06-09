package calendar01;
import java.util.Scanner;
import java.util.Calendar;

public class CalendarPractice {
	public static void monthCal(int year, int month,Calendar cal) {
		cal.set(year,month-1,1);
		//month가 0부터 시작하기 때문에 -1//
		int maxdate = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		int day_of_week = cal.get(Calendar.DAY_OF_WEEK);
		//일:6,월:7,화:1,수:2,목:3,금:4,토:5
		int num_of_day = (day_of_week+1)%7;
		//일:0,월:1,화:2,수:3,목:4,금:5,토:6
		int day;
		System.out.printf("====================%d년 %d월=====================\n",year,month);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		for(day = 1; day < maxdate+num_of_day+1; day++) {
			//공백수까지 카운트해서 반복함
			
			if(num_of_day!=0&&day<=num_of_day) {
				//일요일이 아니고 day가 주어진 요일에 다다를 때까지 반복
				System.out.print(" \t");
			}
			else {
				System.out.printf("%d",day-num_of_day);
				//공백수만큼 뺀 day 값을 출력
				if(day%7==0) {
					System.out.println();
					//매주마다 다음줄로 넘어가기
				}
				else {
					System.out.print("\t");
					//주의 마지막이 아닐경우 탭
				}
			}
		}
	}
				
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		
		while(true) {
			System.out.println("연도를 입력하시오 (0000을 입력하면 종료)");
			int input_year = sc.nextInt();
			if (input_year==0000) {
				break;
				// 0000입력하면 종료
			}
			System.out.println("월을 입력하시오(0을 입력하면 전체 출력)");
			int input_month = sc.nextInt();
			System.out.printf("20%d.%d\n", input_year, input_month);
			//연도와 월을 입력//
			
			if (input_month<0 || input_month>12) {
				System.out.printf("%d월은 없는 달입니다.",input_month);
				break;
				// 0~12월이 아닐경우//
			}
			if (input_month ==0) {
				for(int i = 1; i <=12; i++) {
					monthCal(input_year,i, cal);
					System.out.println("\n");
				}
			}
			else {
				monthCal(input_year,input_month, cal);
				System.out.println("\n");
			}
				}
		sc.close();
			}
		}


