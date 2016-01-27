package company.inheritance;

public class ArrayTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		
		int[][] arr2 = new int[3][4];
		System.out.println(arr2[0].length);
		System.out.println(arr2.length); //행 길이 반환
		
		int[][][] arr3 = new int[5][4][5];
		System.out.println(arr3.length);
		
		String[] arrString = new String[3];
		arrString[0] = new String("abc");
		arrString[1] = new String("dfg");
		arrString[2] = new String("hij");
		
		for (int i = 0; i <arrString.length; i++){
			System.out.println(arrString[i]);
		}
	
	}

}
