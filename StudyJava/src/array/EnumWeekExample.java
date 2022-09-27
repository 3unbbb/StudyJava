package array;

import java.util.Calendar;

public class EnumWeekExample {
	public static void main(String[] args) {

		Season today = null;
		
		Calendar cal = Calendar.getInstance();
		int season = cal.get(Calendar.MONTH);
		
		switch(season){
		case 1 :
			today = Season.WINTER; break;
		case 2 :
			today = Season.WINTER; break;
		case 3 :
			today = Season.SPRING; break;
		case 4 :
			today = Season.SPRING; break;
		case 5 :
			today = Season.SPRING; break;
		case 6 :
			today = Season.SUMMER; break;
		case 7 :
			today = Season.SUMMER; break;
		case 8 :
			today = Season.SUMMER; break;
		case 9 :
			today = Season.AUTUMN; break;
		case 10 :
			today = Season.AUTUMN; break;
		case 11 :
			today = Season.AUTUMN; break;
		case 12 :
			today = Season.WINTER; break;
		}		
		System.out.println("today season : " + today);
		
	}

}
