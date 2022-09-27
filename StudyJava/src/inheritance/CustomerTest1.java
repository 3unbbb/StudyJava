package inheritance;

public class CustomerTest1 {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer();
		//Customer() 생성자 호출
//		이순신님의 등급은 SILVER이au, 보너스 포인트는 1000입니다.
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("이순신");
		
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer vipc = new VIPCustomer();
//		Customer() 생성자 호출
//		VIP Customer() 생성자 호출
//		김유신님의 등급은 VIP이au, 보너스 포인트는 10000입니다.
		
		//상속받은 하위 클래스가 생성될 때는 반드시 상위 클래스의 생성자가 먼저 호출됨
		
		vipc.setCustomerID(10020);
		vipc.setCustomerName("김유신");
		vipc.bonusPoint = 10000;
		System.out.println(vipc.showCustomerInfo());
		
		

	}

}
