package overloading;

public class Car {
	
	//필드
	String model;
	int speed;
	
	//생성자
	Car(String model){
		this.model = model;
	}
	
	//메소드
	void setSpeed(int speed){
		this.speed = speed;
	}
	
	void run(){
		for (int i=10; i<=50; i+=10){
			this.setSpeed(i);
			System.out.println(this.model + "is run! (speed : " + this.speed + "km/h)" );
		}
	}
	

}
