package array;

public class ArrayInArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] mathScores = new int[2][3];
		
		for(int i=0;i<mathScores.length;i++){
			for(int k=0; k<mathScores[i].length; k++){
				System.out.println("mathScores["+i+"]["+k+"]=" + mathScores[i][k]);
			}
		}
		
		System.out.println();
	
	
		
		//[2행 선언]
		int[][] englishScores = new int [2][];
		//1행에 2열선언
		englishScores[0] = new int [2];
		//2행에 3열 선어
		englishScores[1] = new int [3];
		for(int i=0;i<englishScores.length; i++){
			for(int k=0; k<englishScores[i].length; k++){
				System.out.println("englishScores["+i+"]["+k+"]=" + englishScores[i][k]);
			}
		}
		
	
		int[][] javaScores = { {95,80},{92,96,80}};
		
		for(int i=0;i<javaScores.length; i++){
			for(int k=0; k<javaScores[i].length; k++){
				System.out.println("javaScores["+i+"]["+k+"]=" + javaScores[i][k]);
			}
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		//객체를 참조하는 배열
			String[] strArray = new String[3];
			strArray[0] = "java";
			strArray[1] = "java";
			strArray[2] = new String("java");
					
			System.out.println(strArray[0] == strArray[1]);			//true
			System.out.println(strArray[0] == strArray[2]);			//false
			System.out.println(strArray[0].equals(strArray[2]));	//true
	}

}
