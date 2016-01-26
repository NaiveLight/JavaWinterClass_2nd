package company.inheritance;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e = new Employee("Tomas");
		System.out.println(e.getDetail());
		
		Manager m = new Manager("James");
		System.out.println(m.getDetail());
		
		Employee em = new Manager("Edward");
		System.out.println(em.getDetail());
	}

}
