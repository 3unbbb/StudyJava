package staticeex;

public class StudentTest2 {

	public static void main(String[] args) {
		
		Student1 studentLee = new Student1();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum);
		System.out.println(studentLee.studentName+ " 학번 : "+ studentLee.studentID);
		
		Student1 studentSon = new Student1();
		studentSon.setStudentName("손수경");
		System.out.println(studentSon.serialNum);	//1002
		System.out.println(studentSon.studentName+ " 학번 : "+ studentSon.studentID);
		//=> static으로 선언한 변수는 모든 인스턴스가 공유함
		
		
		
		

	}

}
