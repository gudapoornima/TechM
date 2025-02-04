/* Write a Java program to get specific files with extensions 
from a specified folder */

package Day2;
import java.io.File;

public class IOStream2 {
    public static void main(String[] args) {
        File directory = new File("C:\\Users\\user\\eclipse-workspace\\Core JAVA\\src\\techM");
        
        File[] files = directory.listFiles();

        if (files != null) {
            System.out.println("File names in the directory with extensions:");
            for (int i = 0; i < files.length; i++) {
                // Check if it is a file and get the name with extension
                if (files[i].isFile()) {
                    // Get the file name with its extension
                    System.out.println(files[i].getName());
                }
            }
        } else {
            System.out.println("Directory not found or it is empty.");
        }
    }
}
