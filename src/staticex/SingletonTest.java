package staticex;

import java.util.Calendar;

public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1 == s2);
		
		Calendar cal1 = Calendar.getInstance();
		System.out.println("");
	}

}
