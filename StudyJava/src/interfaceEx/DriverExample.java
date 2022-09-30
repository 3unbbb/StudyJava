package interfaceEx;

public class DriverExample {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		//자동 타입변환
		//bus랑 taxi가 Vehicle을 implement 했기 때문에 자동타입변환
		driver.drive(bus);
		driver.drive(taxi);
		
	}

}
