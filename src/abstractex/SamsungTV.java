package abstractex;

public class SamsungTV extends TV{

	@Override
	public void channelUp() {
		channelNum++;
		System.out.println(channelNum);
	}

	@Override
	public void channelDown() {
		channelNum--;
		System.out.println(channelNum);
	}

	
}
