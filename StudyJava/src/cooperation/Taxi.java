package cooperation;

public class Taxi {
	
	int TaxiNum;
	int money;
	int passengerCount;
	
	public Taxi(int TaxiNum){
		this.TaxiNum = TaxiNum;
	}
	
	
	public void take(int money){
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo(){
		System.out.println(TaxiNum+"번의 승객은 " + passengerCount+"명");
		System.out.println("오늘 수입은 " + money+"원 입니다.");
	}

}
