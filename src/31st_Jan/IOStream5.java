/* Write a Java program to check if the given pathname is a directory or a file  */

package Day2;

import java.util.Scanner;
import java.io.File;

public class IOStream5 {
	public  static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the path: ");
        String filePath = sc.nextLine(); 
        File file = new File(filePath);
      
        if (file.exists()) {
        	if (file.isFile()) {
                System.out.println("File");
            } 
        	else if (file.isDirectory()) {
                System.out.println("Directory");
        	} 
        else {
            System.out.println("No File / Directory is found");
        }
        }
	}
}
