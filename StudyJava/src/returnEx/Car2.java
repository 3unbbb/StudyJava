package returnEx;

public class Car2 {
	int speed;
	
	int getSpeed(){
		return speed;
	}

	void keyTrunOn(){
		System.out.println("Key trunon!");
	}
	
	void run(){
		for (int i = 10; i <= 50; i+=10) {
			speed = i;
			System.out.println("run! speed : " + speed + "km/h");
		}
	}
}


