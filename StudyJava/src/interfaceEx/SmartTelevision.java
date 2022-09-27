package interfaceEx;

//다중 인터페이스 구현 클래스
//	다중 인터페이스를 구현할 경우, 구현 클래스는 모든 인터페이스의 추상 메소드에 대해 실체 메소드를 작성해야 한다.
//	하나라도 없으면 추상 클래스로 선언해야 함
public class SmartTelevision implements RemoteConrtrol, Searchable{
	
	private int volume;
	
	//Searchable의 추상메서드에 대한 실체 매서드
	@Override
	public void search(String url) {
		System.out.println(url+"을 검색합니다!");
	}
	
	//RemoteControl의 추상 메서드에 대한 실체 메소드
	@Override
	public void turnOn() {
		System.out.println("TV On!!");
	}
	
	@Override
	public void turnOff() {
		System.out.println("TV Off!!");
	}

	@Override
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
