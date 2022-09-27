package interfaceEx;

public interface RemoteConrtrol {
	
	//인터페이스
	//	개발코드가 인터페이스 메소드를 호출 >> 인터페이스는 객체(= 인터페이스의 구현 객체 = implement)의 메소드를 호출
	//	구현 객체를 생성하는 클래스 = 구현 클래스
	
	//상수
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//추상메소드 > 객체에서 실행되므로 실행 블록이 필요 없는 추상 메소드로 선언
	//	리턴타입, 메소드명, 매개변수만 기술됨
	//	자동으로 public abstract가 컴파일 과정에서 붙게 됨
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	//디폴트메소드 > 실행내용까지 작성 가능
	//	public 특성을 가지므로 컴파일과정에서 자동으로 붙음
	default void setMute(boolean mute){
		if(mute){
			System.out.println("mute!!");
		}else{
			System.out.println("mute off!!");
		}
	}

	//정적메소드
	//	public 특성을 가지므로 컴파일과정에서 자동으로 붙음
	static void changeBattery(){
		System.out.println("change Batter!!");
	}
	
	
}
