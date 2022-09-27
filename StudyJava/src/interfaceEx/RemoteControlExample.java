package interfaceEx;

public class RemoteControlExample {

	//인터페이스로 구현 객체 사용
	//	인터페이스 변수를 선언, 구현객체를 대입해야 함
	//	인터페이스 변수는 참조 타입이므로 구현 객체가 대입될 경우 구현 객체의 번지를 저장
	
	public static void main(String[] args){
		
		//RemoteConrtrol rc;
		
		//rc= new Television();
		//rc = new Audio();
		
		//익명 구현 객체 = 소스파일을 만들지 않고 구현객체를 만들 수 있는 방법을 제공
		//	new 연산자 뒤에는 클래스 이름이 와야하는데 없음
		//	인터페이스() {} 는 인터페이스를 구현해서 중괄호 {}와 같이 클래스를 선언하라는 뜻
		//	new 연산자는 이렇게 선언된 클래스를 객체로 생성
		/*
		 * RemoteConrtrol rc = new RemoteConrtrol() {
			
			//중괄효 에는 인터페이스에 선언된 모든 추상 메소드들의 실체 메소드를 작성해야 함	, 그렇지 않으면 컴파일 에러
			//추가적으로 필드와 메소드를 선언할 수 있지만, 익명 객체 안에서만 사용할 수 있고 인터페이스 변수로 접근 x
			@Override
			public void turnOn() {
				//실행문
			}
			
			@Override
			public void turnOff() {
				//실행문
			}
			
			@Override
			public void setVolume(int volume) {
				//실행문
			}
		};
	*/
		
		
		//추상메소드 사용
		
		//인터페이스 변수 선언
		RemoteConrtrol rc = null;
		
		//Television 객체를 인터페이스 타입에 대입
		rc = new Television();
		rc.turnOn();	//Television 객체를 인터페이스 타입에 대입
		rc.turnOff();	//인터페이스의 trunOn(), turnOff() 호출
		rc.setMute(true);
		
		//Audio 객체를 인터페이스 타입에 대입
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);
		
	}
	
}
