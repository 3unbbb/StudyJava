package inheritance;

public class Computer extends Calculator{
	//자식클래스
	@Override
	double areaCircle(double r){
		System.out.println("Computer 객체의 areaCircle() 실행");
		super.areaCircle(r);
		return Math.PI*r*r;
	}
	

}

