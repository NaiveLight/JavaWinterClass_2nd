package company.inheritance;

import java.util.Date;

public class Employee /*extends Object*/{
	
	protected String employeeName;
	protected double salary;
	protected Date birthday;
	
	//오버라이딩 == 상위 클래스의 메소드를 하위 클래스에서 재정의 하는것
		
	public Employee(){
		super();
	}
	
	public Employee(String employeeName, double salary, Date birthday){
		this.employeeName = employeeName;
		this.salary = salary;
		this.birthday = birthday;
	}
	
	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDetail(){
		return employeeName + ", " + salary + ", " + birthday;
	}
	
	public double reportSalary(){
		return salary;
	}

}
