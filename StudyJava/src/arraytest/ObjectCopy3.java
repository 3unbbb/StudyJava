package arraytest;

public class ObjectCopy3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//얕은 복사
		Book[] bookarr1 = new Book[3];
		Book[] bookarr2 = new Book[3];
		
		bookarr1[0]= new Book("태백", "조정래");
		bookarr1[1] = new Book("데미안", "헤세");
		bookarr1[2] = new Book("어떻게", "유씨");
		
		//디폴트 생성자로 bookarr2배열 인스턴스 생성
		bookarr2[0] = new Book();
		bookarr2[1] = new Book();
		bookarr2[2] = new Book();
		
		for(int i=0;i<bookarr2.length;i++){
			bookarr2[i].setAuthor(bookarr1[i].getAuthor());
			bookarr2[i].setBookName(bookarr1[i].getBookName());
		}
		
		System.out.println("=====bookarr2====");
		
		for(int i=0;i<bookarr2.length;i++){
			bookarr2[i].showBookInfo();
		}
		
		bookarr1[0].setAuthor("박완서");
		bookarr1[0].setBookName("나목");
		
		
		System.out.println("=======bookarr1====");
		
		for(int i=0;i<bookarr1.length;i++){
			bookarr1[i].showBookInfo();
		}
		
		System.out.println("=====bookarr2_update====");
		
		for(int i=0;i<bookarr2.length;i++){
			bookarr2[i].showBookInfo();
		}
	}

}
