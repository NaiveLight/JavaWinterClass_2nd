package company.inheritance;

import java.util.Date;

public class Manager extends Employee{

	private String department;
	
	public Manager(String employeeName, double salary, Date birthday, String department){
		super(employeeName, salary, birthday); // ���� Ŭ������ ����Ʈ constructor�� ȣ���Ѵ�.
		this.department = department;
	}
	
	public String getDetail(){
		return super.getDetail() + ", " + department;
	}
	
	public double reportSalary(){
		return super.salary*1.5;
	}
}
