package object;

public class Car {
	
		 //필드
		 String company = "kia";
		 String color;
		 String model;
		 int MaxSpeed = 350;
	

		 Car(){
			 
		 }
		 
		 Car(String model){
			 this(model, "은색", 250);
		 }
		 
		 Car(String model, String color){
			 this(model, color, 250);
		 }
		 
		 Car(String model, String color, int maxSpeed){
			 this.model = model;
			 this.color = color;
			 this.MaxSpeed = maxSpeed;
		 }
}

