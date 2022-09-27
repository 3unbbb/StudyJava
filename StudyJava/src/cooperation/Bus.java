package cooperation;

public class Bus {
	
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber){
		this.busNumber = busNumber;
	}
	
	public void take(int money){
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo(){
		System.out.println(busNumber+"번의 승객은 " + passengerCount+"명");
		System.out.println("오늘 수입은 " + money+"원 입니다.");
	}
	
	
	

}
