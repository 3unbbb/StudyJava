package cooperation;

public class Subway {
	
	String lineNumber;
	int passengerCount;
	int money;
	
	public Subway(String lineNumber){
		this.lineNumber = lineNumber;
	}
	


	public void take(int money){
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo(){
		System.out.println(lineNumber+"번의 승객은 " + passengerCount+"명");
		System.out.println("오늘 수입은 " + money+"원 입니다.");
	}
	
	
	

}
