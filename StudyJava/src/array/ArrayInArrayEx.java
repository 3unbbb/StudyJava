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
	
	
	String[] strArray = new String[3];
	strArray[0] = "java";
	strArray[1] = "java";
	strArray[2] = new String("java");
			
	System.out.println(strArray[0] == strArray[1]);
	System.out.println(strArray[0] == strArray[2]);
	System.out.println(strArray[0].equals(strArray[2]));
	
	}

}
