/* Use ArrayCopyRange() function to demonstrate and 
example such that you copy the range of values in an array */

package Day1;
import java.lang.System;

public class alternateCopy {
    public static void main(String args[]) {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int arr2[] = {10, 20, 30, 40, 50, 60, 70, 80};

        
        for (int i = 1; i < arr2.length; i += 2) {
            System.arraycopy(arr1, i, arr2, i, 1); 
        }

      
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
