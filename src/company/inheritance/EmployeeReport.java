package company.inheritance;

import java.util.Date;

public class EmployeeReport {

	//배열 : 동일한 Datatype 자료 , 순서 논리적,물리적 순서 동일
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Employee[] employeeList = new Employee[5];
		Manager manager1 = new Manager("James", 1000000.0, new Date(1988, 12, 30), "Dev");
		Manager manager2 = new Manager("Tomas", 2000000.0, new Date(1986, 12, 30), "Personal");

		Secretary sec = new Secretary("Edward", 3000000.0, new Date(1990, 1, 2), "Tomas");
		PartTimeWorker part1 = new PartTimeWorker("Tomy", 0 , new Date(1999,5,6), 50);
		PartTimeWorker part2 = new PartTimeWorker("Mike", 0 , new Date(1995,3,25), 90);
		
		employeeList[0] = manager1;
		employeeList[1] = manager2;
		employeeList[2] = sec;
		employeeList[3] = part1;
		employeeList[4] = part2;
		
		double totalSalary = 0.0;
		
		for(int i = 0; i < employeeList.length; i++){
			totalSalary += employeeList[i].reportSalary();
			String detail = employeeList[i].getDetail();
			System.out.println(detail);
		}
		
		System.out.println(totalSalary);
		
		//diamond problem 구글링 해보기
	}

	/*instanceof 연산자
	 * 
	 *  Employee me = new Manager("Test");
	 *  
	 *  if (me instanceof Manager){
	 *  	Manager m = (Manager) me;
	 *  }
	 *  
	 */
}
