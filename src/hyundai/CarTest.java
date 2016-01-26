package hyundai;

/* 
 * �ڵ��� ȸ�簡 �ֽ��ϴ�.
 * ���� ���� �ڵ����� ������ �ֽ��ϴ�.
 * ������ ���� ������ �ٸ���
 * �ҳ�Ÿ 3�� 3000
 * �׷��� 2�� 4000
 * ���׽ý� 1�� 5000
 * ȸ�簡 ������ �ִ� ���� ������ ���� ��� ����Ͻÿ�
 * 
 * �ʿ��� ��ü�� �������� �����ϼ���
 * �� ��ü�� Ŭ������ ǥ���մϴ�.
 * �� Ŭ�������� �������踦 �׸����� �׷����ϴ�.
 * ���ϰ��� �ϴ� ���� ��� ���� �� �ִ��� ������ ���ϴ�.
 * �迭�� �̿��ϴ� ����� �����ϴ�.
 * Singleton parttern�� �ݵ�� ����ϼ���
 * ��Ӱ��踦 �̿��Ͽ� ���� ǥ���Ͻð� �迭�� ��� ������ ���ΰ� �� ������ ������
 * �ڵ��� ���� ����ϴ� �κ��� class�� �����ϼ���
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
