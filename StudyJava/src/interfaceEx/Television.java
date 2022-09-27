package interfaceEx;

public class Television implements RemoteConrtrol{
	
	//필드
	private int volume;

	//구현 클래스
	//	 보통의 클래스와 동일,
	//	인터페이스 타입으로 사용할 수 있음을 알려주기 위해 클래스 선언부에 implement 키워드를 추가 & 인터페이스명을 명시 해야함
	
	//RemoteControl에는 3개의 추상 메소드가 있기 때문에 Television과 Audio는 추상 메소드들에 대한 실체 메소드를 가지고 있어야 함
	
	
	@Override
	//turnOn() 추상메서드의 실체 메소드
	public void turnOn() {
		System.out.println("TV On!!");
	}
	
	@Override
	//turnOff() 추상메서드의 실체 메소드
	public void turnOff() {
		System.out.println("TV Off!!");
	}

	@Override
	//setVolume() 추상메서드의 실체 메소드
	//인터페이스 상수를 이용해서 volume 필드의 값을 제한
	public void setVolume(int volume) {
		if(volume>RemoteConrtrol.MAX_VOLUME){
			this.volume = RemoteConrtrol.MAX_VOLUME;
		}else if(volume<RemoteConrtrol.MIN_VOLUME){
			this.volume = RemoteConrtrol.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		
		System.out.println("now TV volume : " + this.volume);
	}

	
	
}
