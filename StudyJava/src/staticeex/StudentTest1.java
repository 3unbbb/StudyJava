package staticeex;

public class StudentTest1 {

	public static void main(String[] args) {
		
		Student studentLee = new Student();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum);
		studentLee.serialNum++;
		
		Student studentSon = new Student();
		studentSon.setStudentName("손수경");
		System.out.println(studentSon.serialNum);	//1001
		System.out.println(studentLee.serialNum);	//1001
		//=> static으로 선언한 변수는 모든 인스턴스가 공유함
		
		
		
		

	}

}
