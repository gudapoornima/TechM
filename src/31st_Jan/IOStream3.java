/* Write a Java program to check if a file or directory 
specified by pathname exists or not */ 

package Day2;

import java.util.Scanner;
import java.io.File;

public class IOStream3 {
	public  static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the path: ");
        String filePath = scanner.nextLine(); 
        File file = new File(filePath);
      
        if (file.exists()) {
        	if (file.isFile()) {
                System.out.println("File exists in the specified path");
            } 
        	else if (file.isDirectory()) {
                System.out.println("Directory exists in the specified path");
        	} 
        else {
            System.out.println("File not found");
        }
        }
	}
}

