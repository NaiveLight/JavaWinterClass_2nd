package company.inheritance;

import java.util.Date;

public class Secretary extends Employee {

	private String boss;
	
	public Secretary(String employeeName, double salary, Date birthday, String boss){
		super(employeeName, salary, birthday);
		this.boss = boss;
	}
	
	public String getDetail(){
		return super.getDetail() + ", " + boss;
	}
	
}
