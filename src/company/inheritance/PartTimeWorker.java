package company.inheritance;

import java.util.Date;

public class PartTimeWorker extends Employee {

	private int workTimeProperty;
	
	public PartTimeWorker(String employeeName, double salary, Date birthday, int workTimeProperty){
		super(employeeName, salary, birthday);
		this.workTimeProperty = workTimeProperty;
	}
	
	public String getDetail(){
		return super.getDetail() + ", " + workTimeProperty;
	}
	
	public double reportSalary(){
		return workTimeProperty * 6030;
	}
}
