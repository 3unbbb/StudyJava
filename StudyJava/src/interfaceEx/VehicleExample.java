package interfaceEx;

public class VehicleExample {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFare();
		//vehicle인터페이스에는 checkFare()가 없음
		
		Bus bus = (Bus)vehicle; //강제 타입변환
		
		bus.run();
		bus.checkFare();
		//Bus클래스에는 checkFare()가 있음
	}

}
