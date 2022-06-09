package calculator;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc ca = new Calc();
		int sum = ca.calcSum(100, 97, 80, 70);
		double avg = sum / 4.00;
		String grade= null;
		if(avg>=90) {
			grade = "A학점";
		} else if(avg>=70) {
			grade = "B학점";
		} else if(avg>=70) {
			grade = "B학점";
		} else if(avg>=70) {
			grade = "C학점";
		} else if(avg>=70) {
			grade = "D학점";
		} else {
			grade = "F학점";
		}
		
		System.out.println("Sum:"+sum);
		System.out.println("avg:"+avg);
		System.out.println(grade);
	}

}
