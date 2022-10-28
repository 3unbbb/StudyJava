package classex;

public class iphoneXS {

	public static void main(String[] args) {
		
		//추상클래스를 사용한 객체생성 >> 오류
		//phone PH = new phone();
		
		//실체클래스를 사용한 객체생성
		iphone myPhone = new iphone("000");
		
		myPhone.On();			//phone on!
		myPhone.cameraOn();		//camera on!!
		myPhone.Off();			//phone off!
		
		
		
		
		
	}

}



