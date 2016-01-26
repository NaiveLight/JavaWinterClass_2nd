package abstractex;

public class LgTV extends TV{

	@Override
	public void channelUp() {
		channelNum+=2;
		System.out.println(channelNum);
	}

	@Override
	public void channelDown() {
		channelNum-=2;
		System.out.println(channelNum);
	}

}
