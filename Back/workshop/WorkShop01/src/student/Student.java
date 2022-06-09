package student;

public class Student {

	private String name;
	private int korean;
	private int english;
	private int math;
	private int science;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(String name, int korean, int english, int math, int science) {
		super();
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getKorean() {
		return korean;
	}


	public void setKorean(int korean) {
		this.korean = korean;
	}


	public int getEnglish() {
		return english;
	}


	public void setEnglish(int english) {
		this.english = english;
	}


	public int getMath() {
		return math;
	}


	public void setMath(int math) {
		this.math = math;
	}


	public int getScience() {
		return science;
	}


	public void setScience(int science) {
		this.science = science;
	}

	public double getAvg() {
		return (this.korean + this.english + this.math + this.science) / 4.0;
		
	}
	
	public String getGrade() {
		String grade = null;
		double avg = getAvg();
		if(avg>=90) {
			grade = "A학점";
		} else if(avg>=70) {
			grade = "B학점";
		} else if(avg>=50) {
			grade = "C학점";
		} else if(avg>=30) {
			grade = "D학점";
		} else {
			grade = "F학점";
		}
		return grade;
	}


	@Override
	public String toString() {
		return name + " 평균: " + getAvg() + " 학점: " + getGrade();
	}
	
}
