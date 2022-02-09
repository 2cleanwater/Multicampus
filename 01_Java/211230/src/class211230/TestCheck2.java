package class211230;

public class TestCheck2 {

	public static void main(String[] args) {
		int[] lastDays;
		lastDays = new int[12]; // 크기가 결정되면서 초기화 된다.
	}
	
	public void test1() {
		// TODO Auto-generated method stub
		int year = 2021;
		int month = 12;
		int space = 6;
		int lastDays = 31;
		
		//월별 마지막 일 설정
		switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				lastDays = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				lastDays = 30;
				break;
			case 2:
				lastDays = 28;
		}
		//
		
		//윤년 판단 로직
		if(year%400==0 || (year%4==0 &&year%100!=0)) {
			lastDays = 29;
		}
		//
		
		/*
		 * for(int i=0;i<=11;i++) {
			System.out.println(month +"월");
			month=month+1;
		}
	       */
	       
		for(int i=0;i<space;i++) {
			System.out.print("\t");
		}
		for(int i=0;i<lastDays;i++) {
			int day = 1;
			System.out.print(day+"\t");
			if((space+day)%7==0) {
				System.out.println();
			}
			day = day + 1;
		
	}
	
		
		}
	}
