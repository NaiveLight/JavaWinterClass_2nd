package staticex;

public class StaticTest {

	int num = 10; //�ν��Ͻ� ����
	static int snum = 20; //Ŭ���� ����
	
	public static void main(String[] args) {
		
		StaticTest test = new StaticTest();
		test.num++;
		StaticTest.snum++;
		System.out.println("num = "+test.num);
		System.out.println("snum = "+StaticTest.snum);
		
		StaticTest test2 = new StaticTest();
		
		test2.num++;
		StaticTest.snum++;
		System.out.println("num = "+test2.num);
		System.out.println("snum = "+StaticTest.snum);
		
		System.out.println(StaticTest.getSnum());
	}
	
	public static int getSnum(){
		
		int i = 10;
		//num++;
		return snum;
	}

}
