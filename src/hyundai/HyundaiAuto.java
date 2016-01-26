package hyundai;

public class HyundaiAuto {

	private static HyundaiAuto company = new HyundaiAuto();
	private Car[] carArr; 
	private int carindex;
	
	private HyundaiAuto(){
		carArr = new Car[6];
	}
	
	public static HyundaiAuto getCompany(){
		if (company == null){
			company = new HyundaiAuto();
		}
		return company;
	}
	
	public void addCar(Car car){
		carArr[carindex++] = car;
	}

	public Car[] getCarList(){
		return carArr;
	}
}
