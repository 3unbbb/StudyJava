package classtest;

public class AccountExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account account = new Account();
		
		account.SetBalance(10000);
		System.out.println("현재잔고 : " + account.GetBalance());
		
		account.SetBalance(-100);
		System.out.println("현재잔고 : " + account.GetBalance());
		
		account.SetBalance(2000000);
		System.out.println("현재잔고 : " + account.GetBalance());
		
		account.SetBalance(300000);
		System.out.println("현재잔고 : " + account.GetBalance());
		
	}

}
