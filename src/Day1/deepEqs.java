/* Demonstrate with an example with the difference between 
equals() vs deepEquals() method */

package Day1;
import java.util.*; 

public class deepEqs {
	public static void main(String args[]) {
		//1D comparison using equals()
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {1,2,3,4,5};
		int arr3[]= {2,3,4,5,6};
		if(Arrays.equals(arr1,arr2))
			System.out.println("Arrays a1 and a2 are equal");
		else if(Arrays.equals(arr2,arr3))
			System.out.println("Arrays a2 and a3 are equal");
		else if(Arrays.equals(arr1,arr3))
			System.out.println("Arrays a1 and a3 are equal");
		else System.out.println("Arrays are not equal");

		//2D comparison using deepEquals()
		int arr4[][]= {{1,2,3},{1,2,3}};
		int arr5[][]= {{1,2,3},{1,2,3}};
		int arr6[][]= {{3,2,1},{3,2,1}};
		if(Arrays.deepEquals(arr4,arr5))
			System.out.println("Arrays a4 and a5 are deep equal");
		else if(Arrays.deepEquals(arr5,arr6))
			System.out.println("Arrays a5 and a6 are deep equal");
		else if(Arrays.deepEquals(arr4,arr6))
			System.out.println("Arrays a5 and a6 are deep equal");
		else System.out.println("Arrays are not equal");
			
	}

}




    