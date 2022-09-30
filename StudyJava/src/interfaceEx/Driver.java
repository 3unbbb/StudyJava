package interfaceEx;

public class Driver {

	//매개변수의 인터페이스화
	public void drive(Vehicle vehicle){
		
		if(vehicle instanceof Bus){			//vehicle 매개변수가 참조하는 객체가 Bus 인지 좌
			Bus bus = (Bus)vehicle;			//Bus 객체일 경우 안전하게 강제타입변환
			bus.checkFare();				//Bus 타입으로 강제형변환 하는 이유
		}
		
		vehicle.run();
	}
}
