package arraytest;

public class ObjectCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book[] bookarr1 = new Book[3];
		Book[] bookarr2 = new Book[3];
		
		bookarr1[0]= new Book("태백", "조정래");
		bookarr1[1] = new Book("데미안", "헤세");
		bookarr1[2] = new Book("어떻게", "유씨");
		
		System.arraycopy(bookarr1, 0, bookarr2, 0, 3);
		
		for(int i=0; i<bookarr2.length;i++){
			bookarr2[i].showBookInfo();
		}

	}

}
