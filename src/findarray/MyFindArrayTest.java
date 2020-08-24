package findarray;


public class MyFindArrayTest {
	
	  public static void main(String[] args) {

	FindArray findArray = new MyFindArray();
	int[] array = {1, 2,3,4,5,7,7,7,7,22222,2,3,4};
	int[] subArray = {3,7};
	

		int result = findArray.findArray(array, subArray);
		
		System.out.println(result);


	}

}