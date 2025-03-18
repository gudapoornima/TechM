/* Write a Java program to get a list of all file/directory names 
in the given directory */

package Day2;
import java.io.File;

public class IOStream1 {
	public  static void main(String[] args) {
		File directory = new File("C:\\Users\\user\\eclipse-workspace\\Core JAVA\\src\\techM");
        String[] files = directory.list();

        if (files != null) {
        	System.out.println("Directory found with the following files: ");
        	for (int i = 0; i < files.length; i++) {
        	    System.out.println(files[i]);
        	}
        } 
        else {
            System.out.println("Directory not found or it is empty");
        }
    }
}


        