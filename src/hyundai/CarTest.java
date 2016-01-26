package hyundai;

/* 
 * 자동차 회사가 있습니다.
 * 여러 대의 자동차를 가지고 있습니다.
 * 종류에 따라 가격이 다르다
 * 소나타 3대 3000
 * 그랜져 2대 4000
 * 제네시스 1대 5000
 * 회사가 가지고 있는 차의 가격의 합을 모두 출력하시오
 * 
 * 필요한 객체가 무엇인지 나열하세요
 * 각 객체를 클래스로 표현합니다.
 * 각 클래스간의 연관관계를 그림으로 그려봅니다.
 * 구하고자 하는 값이 어떻게 구할 수 있는지 생각해 봅니다.
 * 배열을 이용하는 방법이 좋습니다.
 * Singleton parttern을 반드시 사용하세요
 * 상속관계를 이용하여 차를 표현하시고 배열을 어떻게 선언할 것인가 잘 생각해 보세요
 * 자동차 값을 계산하는 부분을 class로 구현하세요
 */

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HyundaiAuto company = HyundaiAuto.getCompany();
		
		company.addCar(new Sonata(3000));
		company.addCar(new Sonata(3000));
		company.addCar(new Sonata(3000));
		company.addCar(new Grandeur(4000));
		company.addCar(new Grandeur(4000));
		company.addCar(new Genesis(5000));
		
		CarReport report = new CarReport();
		int price = report.getTotalPrice();
		System.out.println(price);

	}

}
