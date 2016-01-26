package hyundai;

public class CarReport {
	
	private int total;
	HyundaiAuto company = HyundaiAuto.getCompany();
	
	public int getTotalPrice(){
		Car[] carList = company.getCarList();
		
		for(int i=0; i < carList.length; i++){
			total += carList[i].getPrice();
		}
		
		return total;
	}

}
