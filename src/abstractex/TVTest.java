package abstractex;

public class TVTest {

	public static void main(String[] args){
		
		TV lgtv = new LgTV();
		lgtv.turnOn();
		lgtv.channelUp();
		lgtv.turnOff();
		
		TV samsungtv = new SamsungTV();
		samsungtv.turnOn();
		samsungtv.channelUp();
		samsungtv.turnOff();
		
	}

}

/*
 * 
 * 
 */
