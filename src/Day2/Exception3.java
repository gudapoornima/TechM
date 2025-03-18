/* Write a JAVA program to create a method that reads a file 
and throws and exception if the file is not found */

package Day2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception3 {
	public static void main(String[] args) throws IOException {
		File file=new File("FileEx1.txt");
		try {
			if(file.createNewFile()) {
				System.out.println("New File created: "+file.getName());
			}
			else {
				System.out.println("File already exists");
			}	
		}
		catch (FileNotFoundException e) {
			System.err.println("File is not found" + e.getMessage());	
		}
	}
}


