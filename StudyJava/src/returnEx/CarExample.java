package returnEx;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car myCar = new Car();
		
		myCar.setGas(5);		//Car 의 SetGas 메소드 호출
		
		boolean gasState = myCar.isLeftGas();
		if(gasState){
			System.out.println("start!");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("no more gas!");
		} else {
			System.out.println("more gas!");
		}
	}

}
