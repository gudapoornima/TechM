/*Write a Java program to check if a file or directory 
has read and write permissions  */

package Day2;
import java.io.File;
import java.util.Scanner;

public class IOStream4 {
	public  static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the file path: ");
        String filePath = sc.nextLine(); 
        File file = new File(filePath);
      
        if (file.exists()) {
        	if (file.canRead()) {
                System.out.println("Readable");
            } 
        	else if (file.canWrite()){
        		System.out.println("Writable");
        	}
        	else if (file.canRead() && file.canWrite()) {
                System.out.println("Readable and Writable");
            } 
        	else {
        		System.out.println("Not Readable nor Writable");
        	}
        }
	}     		
}


