package company.inheritance;

import java.util.Date;

public class Employee /*extends Object*/{
	
	protected String employeeName;
	protected double salary;
	protected Date birthday;
	
	//�������̵� == ���� Ŭ������ �޼ҵ带 ���� Ŭ�������� ������ �ϴ°�
		
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
