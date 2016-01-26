package company.inheritance;

public class Employee {
	
	protected int employeeID;
	protected String employeeName;
	protected double salary;
	
	//�������̵� == ���� Ŭ������ �޼ҵ带 ���� Ŭ�������� ������ �ϴ°�
	
	
	public Employee(){}
	
	public Employee(String employeeName){
		this.employeeName = employeeName;
	}
	
	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
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
		return employeeID + ", " + employeeName + ", " + salary;
	}

}
