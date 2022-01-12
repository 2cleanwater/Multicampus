package p220110;

public class Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Review rv = new Review();
		rv.score();
	}
	
	public void score() {
		Review rv = new Review();
		String studentKim = "kim,39,49,59";
		String studentLee = "lee,48,89,64";
		String studentPark = "park,90,81,100";
		
		String[] scores = {studentKim,studentLee,studentPark};
		System.out.println("name\tkor\teng\tmath\ttotal\tavg");
		System.out.println("=================================");
		
		for(int i = 0; i<scores.length;i++) {
			String[] temp = scores[i].split(",");
			String name = temp[0];
			int kor = Integer.parseInt(temp[1]);
			int eng = Integer.parseInt(temp[2]);
			int math = Integer.parseInt(temp[3]);
			int total = rv.total(kor,eng,math);
			double avg = rv.getAvg(kor, eng, math);
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f\n",name,kor,eng,math,total,avg);
		}
	}
	
	public int total(int kor,int eng,int math ) {
		int total = kor+eng+math;
		return total;
	}
	
	public double getAvg(int kor,int eng,int math) {
		double avg = total(kor, eng, math)/3.0;
		return avg;
	}

}
