/* Write a Java program to read the contents of a file into a byte array */

package Day2;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class IOStream9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String name = sc.nextLine();

        try {
            File file = new File(name);
            if (file.exists()) {
                FileInputStream fis = new FileInputStream(file);
                byte[] bytefile = new byte[(int) file.length()];
                fis.read(bytefile);
                fis.close();

                System.out.println("Successfully converted into byte array as: ");
                System.out.println(Arrays.toString(bytefile));
            } 
            else {
                System.out.println("File not found");
            }
        } 
        catch (IOException e) {
            System.out.println("Error in reading the file: " + e.getMessage());
        }
    }
}

