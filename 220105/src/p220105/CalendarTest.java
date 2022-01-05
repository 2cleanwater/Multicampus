package p220105;

public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalendarTest cp = new CalendarTest();
		cp.calenderPrinter(12);
		}
	
	void calenderPrinter(int month) {
		
		int[] spaces = {5,1,1,4,6,2,4,0,3,5,1,3};
		int[] lastDays = {31,28,31,30,31,30,31,31,30,31,30,31};
		int space = spaces[month-1];
		int lastDay = lastDays[month-1];
		
		System.out.printf("2021년 %d월 \n", month);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		int day = 1;
		for(int i=0;i<space;i++) {
			System.out.print("\t");
		}
		for(int i=0; i<lastDay; i++) {
			System.out.print(day+"\t");
			if((space+day)%7==0) {
				System.out.println();
			}
			day++;
			}
		}
	}

