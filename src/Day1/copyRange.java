package Day1;
import java.util.Arrays;
public class copyRange {
	
	public static void main(String args[]) {
        int source[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //Copying the array using copyOfRange()
        int dest[] = Arrays.copyOfRange(source,0,5);
        System.out.println("Copied Array:" +Arrays.toString(dest));
	}   
 
}