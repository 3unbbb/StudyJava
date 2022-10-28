package classex;

public abstract class phone {

	//필드
	public String user;
	
	//생성자
	public phone(String user){
		this.user = user;
	}
	
	//메소드
	public void On(){
		System.out.println("phone on!");
	}
	
	public void Off(){
		System.out.println("phone off!");
	}
	
	
}
