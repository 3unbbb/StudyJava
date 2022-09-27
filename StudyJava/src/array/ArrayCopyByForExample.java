package array;

public class ArrayCopyByForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] oldArr = {1,2,3};
//		int[] newArr = new int[5];
//		
//		for(int i =0; i<oldArr.length; i++) {
//			newArr[i] = oldArr[i];
//		}
//		
//		for(int i=0; i<newArr.length; i++){
//			System.out.print(newArr[i]+",");
//		}
//		
		
		String[] oldArr = {"java", "c++", "c#"};
		String[] newArr = new String[5];
		
		System.arraycopy(oldArr, 0, newArr, 0, oldArr.length);

		
		for(int i = 0; i<newArr.length; i++){
			System.out.print(newArr[i]+",");
		}
		
		
		
	}

}
