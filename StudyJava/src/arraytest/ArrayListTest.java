package arraytest;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Book> bookArr = new ArrayList<Book>();

		bookArr.add(new Book("XOQOR", "WHWJDFO"));
		bookArr.add(new Book("EPALDKS", "GPTP"));
		bookArr.add(new Book("DFW", "DSDD"));
		bookArr.add(new Book("BEBF", "SE"));
		bookArr.add(new Book("WQTNN", "DSGAG"));
		
		for(Book book : bookArr){
			book.showBookInfo();
		}
		
		
		
	}

}
