package findarray;

import java.util.HashSet;
import java.util.Set;



public class MyFindArray implements FindArray {

	private int[] array = null	;
	private int[] subArray = null ;
	private int counter = 0;
	public MyFindArray() {
		
		
	}
	
	public int findArray (int[] array, int[] subArray) {	
		this.array = array;
		this.subArray = subArray;

		//delete double from subArray
		Set<Integer> set = new HashSet<>();
		for (int num : this.subArray) {
			set.add(num);
		}
		
		//replace subArray by converting integer set
		this.subArray= new int[set.toArray().length];
		for(int i =0; i< this.subArray.length; i++) {
			this.subArray[i]= (int) set.toArray()[i];
		}
		
		//count how much number from subArray in array
		for (int i=0 ; i< this.subArray.length ; i++) {
			for (int j =0 ; j< this.array.length; j++){

				if (this.subArray[i] == this.array[j]){
					counter = counter + 1;
				}
			}
		}
		return counter;
	}

}
	


