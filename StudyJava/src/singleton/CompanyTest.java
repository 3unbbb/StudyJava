package singleton;

public class CompanyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Company myCom1 = Company.getInstance();
		Company myCom2 = Company.getInstance();
		System.out.println(myCom1 == myCom2);	//null
		//Company의 인스턴스는 static으로 유일한 하나
		//변수 두개에 각각 불러와도 어차피 같은 값

	}

}
