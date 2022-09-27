package array;

public class AdvancedForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] scores = {95,71,86,93,87};
		
		int sum=0;
		for(int score : scores){
			sum = sum + score;
		}
		
		System.out.println("점수 총합 : " + sum);
		
		
		
		
		Season December = Season.WINTER;
		
		System.out.println(December == Season.WINTER);
		
		
	}

}
