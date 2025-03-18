/* Write a Java program to determine the last modified date of a file */

package Day2;

import java.util.Scanner;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class IOStream6 {
	public  static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the path: ");
        String filePath = sc.nextLine(); 
        File file = new File(filePath);
      
        if (file.exists()) {
        	long lastModify = file.lastModified();
        	Date date = new Date(lastModify);
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
            
            // Print the last modified date in the specified format
            System.out.println("Last modified date: " + sdf.format(date));
        	} 
        else {
            System.out.println("No File / Directory is found");
        }
	}
}

