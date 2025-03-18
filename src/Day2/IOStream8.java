/* Write a Java program to get the file size in bytes, KB, MB */

package Day2;

import java.io.File;
import java.util.Scanner;

public class IOStream8 {
	public  static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the path: ");
        String filePath = sc.nextLine(); 
        File file = new File(filePath);
      
        if (file.exists()) {
        	if(file.length()<1024) {
        		System.out.println("Size of the file: "+file.length()+ " bytes");
        	}
        	else if(file.length()<1024*1024) {
        		System.out.println("Size of the file: "+((file.length())/1024)+ " KB");
        	}
        	else {
        		System.out.println("Size of the file: "+((file.length())/(1024*1024))+ " MB");
        	}
        } 
        else {
            System.out.println("File  not found");
        }
    }
}
