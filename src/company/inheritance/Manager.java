package company.inheritance;

public class Manager extends Employee{

	private String department;
	
	public Manager(String employeeName){
		super(employeeName); // 상위 클래스의 디폴트 constructor를 호출한다.
	}
	
	public String getDetail(){
		return super.getDetail() + ", " + department;
	}
}
