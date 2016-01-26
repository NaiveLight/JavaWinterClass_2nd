package company.inheritance;

import java.util.Date;

public class Manager extends Employee{

	private String department;
	
	public Manager(String employeeName, double salary, Date birthday, String department){
		super(employeeName, salary, birthday); // 상위 클래스의 디폴트 constructor를 호출한다.
		this.department = department;
	}
	
	public String getDetail(){
		return super.getDetail() + ", " + department;
	}
	
	public double reportSalary(){
		return super.salary*1.5;
	}
}
