package abstractex;

public abstract class TV {

	int channelNum;
	
	TV(){
		System.out.println("TV()");
	}
	
	public void turnOn(){
		System.out.println("Turn On();");
	}
	
	public void turnOff(){
		System.out.println("Tunr Off();");
	}
	
	public abstract void channelUp();
	public abstract void channelDown();
	
}

