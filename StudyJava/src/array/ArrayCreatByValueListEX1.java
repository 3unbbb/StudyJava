package array;

public class ArrayCreatByValueListEX1 {

	private static int[] scores;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] score = {83,90,87};
//		
//		System.out.println("score[0] : " + score[0]);
//		System.out.println("score[1] : " + score[1]);
//		System.out.println("score[2] : " + score[2]);
//		
//		int sum = 0;
//		for(int i =0;i<3;i++){
//			sum += score[i];
//		}
//		System.out.println("총합 : " + sum);
//		
//		double avg = (double)sum /3;
//		
//		System.out.println(avg);
//		
//		
//		int[] array;
//		array={1,2,3};
//		
		
		int[] scores;
		scores = new int[] {87,90,83};
		int sum1 = 0;
		for(int i=0;i<3;i++){
			sum1 += scores[i];
		}
		
		System.out.println("총합 : " + sum1);
		
		//리턴된 총합을 sum2에 저장
		
		int sum2 = add( new int[]{83,90,87});
		System.out.println("총합 : " + sum2);
		System.out.println();

	}

	public static int add(int[] scores){
		int sum =0;
		for(int i=0;i<3;i++){
			sum += scores[i];
		}
		return sum;
	}
	
}
