package algo220121;

import java.sql.Timestamp;

public class EmpVO {
	private int emp_code;
	private String emp_name;
	private int emp_age;
	private Timestamp emp_hireday; 
	private int emp_salary;
	private String dept_code;
	
	
	public EmpVO(int emp_code, String emp_name, int emp_age, Timestamp emp_hireday, int emp_salary, String dept_code) {
		super();
		this.emp_code = emp_code;
		this.emp_name = emp_name;
		this.emp_age = emp_age;
		this.emp_hireday = emp_hireday;
		this.emp_salary = emp_salary;
		this.dept_code = dept_code;
	}
	
	public int getEmp_code() {
		return emp_code;
	}
	public void setEmp_code(int emp_code) {
		this.emp_code = emp_code;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public int getEmp_age() {
		return emp_age;
	}
	public void setEmp_age(int emp_age) {
		this.emp_age = emp_age;
	}
	public Timestamp getEmp_hireday() {
		return emp_hireday;
	}
	public void setEmp_hireday(Timestamp emp_hireday) {
		this.emp_hireday = emp_hireday;
	}
	public int getEmp_salary() {
		return emp_salary;
	}
	public void setEmp_salary(int emp_salary) {
		this.emp_salary = emp_salary;
	}
	public String getDept_code() {
		return dept_code;
	}
	public void setDept_code(String dept_code) {
		this.dept_code = dept_code;
	}

	@Override
	public String toString() {
		return "EmpVO [emp_code=" + emp_code + ", emp_name=" + emp_name + ", emp_age=" + emp_age + ", emp_hireday="
				+ emp_hireday + ", emp_salary=" + emp_salary + ", dept_code=" + dept_code + "]";
	}
	
}
