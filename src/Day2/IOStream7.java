/* Write a Java program to read input from the Java console */

package Day2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IOStream7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input data: ");
        String input = sc.nextLine();
       
        File file = new File("FileEx1.txt");

        // Adding the scanned data into file
        try (FileWriter writer = new FileWriter(file, true)) { 
            writer.write("\n"+ input + "\n");  
            System.out.println("Data added into file");
        } 
        catch (IOException e) {
            System.err.println("Error adding the data into file");
            e.printStackTrace();
        }
        
    }
}