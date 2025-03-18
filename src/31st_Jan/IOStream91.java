/* Write a Java program to read file content line by line */

package Day2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class IOStream91 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String name = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(name))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } 
        catch (IOException e) {
            System.out.println("Error in reading the file: " + e.getMessage());
        }
    }
}