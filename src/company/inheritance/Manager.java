package company.inheritance;

public class Manager extends Employee{

	private String department;
	
	public Manager(String employeeName){
		super(employeeName); // ���� Ŭ������ ����Ʈ constructor�� ȣ���Ѵ�.
	}
	
	public String getDetail(){
		return super.getDetail() + ", " + department;
	}
}
