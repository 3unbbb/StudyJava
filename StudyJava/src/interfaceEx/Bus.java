package interfaceEx;

public class Bus implements Vehicle{

	//구현클래스
	@Override
	public void run() {
		System.out.println("버스가 달림~");
	}
	
	public void checkFare(){
		System.out.println("승차요금을 체크함!");
	}
	
	

}
