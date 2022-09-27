package object;

public class CarExample {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
//		Car myCar = new Car();
//		
//		System.out.println("company: " + myCar.company);
//		System.out.println("color: " + myCar.color);
//		System.out.println("Maxspeed: " + myCar.MaxSpeed);
//		
//		//필드값 변경
//		myCar.MaxSpeed = 400;
		
	Car car1 = new Car();
	System.out.println("car1.company : " + car1.company );
	
	Car car2 = new Car("자가용");
	System.out.println("car2.company : " + car2.company);
	System.out.println("car2.model : " + car2.model);
	
	Car car3 = new Car("자가용", "red");
	System.out.println("car3.company : " + car3.company);
	System.out.println("car3.model : " + car3.model);
	System.out.println("car3.color : " + car3.color);
	
	Car car4 = new Car("자가용", "red", 200);
	System.out.println("car4.company : " + car4.company);
	System.out.println("car4.model : " + car4.model);
	System.out.println("car4.color : " + car4.color);
	System.out.println("car4.maxSpeed : "+ car4.MaxSpeed);
	
	}
	
	
		
		
		
		

}
