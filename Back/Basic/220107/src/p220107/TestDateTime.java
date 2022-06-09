package p220107;

import java.util.Calendar;
import java.util.Date;

public class TestDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDateTime tdt = new TestDateTime();
		tdt.testCalendar();
	}
	
	public void testCalendar() {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		System.out.printf("%d-%d-%d %d:%d:%d",year,month,day,hour,min,sec);
		
	}
	public void testDate() {
		//Date 클래스 인스턴스 생성하시오
		Date date = new Date();
		int year = date.getYear()+1900;
		int month = date.getMonth()+1;
		int day = date.getDate();
		
		int hour = date.getHours();
		int min = date.getMinutes();
		int sec = date.getSeconds();
		System.out.printf("%d-%d-%d %d:%d:%d",year,month,day,hour,min,sec);
	}

}
