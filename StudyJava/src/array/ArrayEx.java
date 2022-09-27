package array;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 비정방형 배열 = 가변배열
		// 행마다 열의 개수가 다른 배열
		// 배열 생성 시 
		
		
		int[][] arr1 = new int[2][];
		arr1[0] = new int[2];
		arr1[1] = new int[3];
		
		arr1[0][0] = 1;			//행 우선
		arr1[0][1] = 2;
		arr1[1][0] = 3;
		arr1[1][1] = 4;
		arr1[1][2] = 5;
			
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j]+"\t");
				}
				System.out.println();
				
		}
		
		
		int [][] arr2 = new int[4][];
		arr2[0] = new int[3];
		arr2[1] = new int[2];
		arr2[2] = new int[3];
		arr2[3] = new int[2];
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) 
				arr2[i][j] = (i+1)*10 + j;
			
			
			for (int i2 = 0; i2 < arr2.length; i2++) {
				for (int j2 = 0; j2 < arr2[i2].length; j2++) 
					System.out.print(arr2[i2][j2] + " ");
				System.out.println();

				
			}
			
			
		}
		
		
		
	}

}
