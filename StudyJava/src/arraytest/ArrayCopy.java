package arraytest;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {10,20,30,40,50};
		int[] arr2 = {1,2,3,4,5};
		
		System.arraycopy(arr1, 0, arr2, 1, 4);
		//				복사할 배열, 복사 시작 위치, 붙여넣을 배열, 붙여 넣을 위치, 복사할 요소 개수
		
		for(int i=0;i<arr2.length;i++){
			System.out.println(arr2[i]);
			}
	}
		

}
