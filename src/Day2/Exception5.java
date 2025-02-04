/* Write a Java program that reads a file 
and throws an exception if the file is empty */

package Day2;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception5 {
	public static void main(String[] args) {
		File infile=new File("FileEx1.txt");
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(infile);
			int ch;
			if(infile.length()==0) {
				throw new IllegalArgumentException("File is empty");
			}	
			while((ch=fis.read())!= -1) {}
			System.out.println("File is not empty. Reading the file is done");
		}
		catch (FileNotFoundException e) {
			System.err.println("File not found "+e.getMessage());
		}
		catch (IOException | IllegalArgumentException e) {
			System.err.println("Could not read the file "+e.getMessage());
		}
		
		finally {
			try {
				fis.close();
			}
			catch (IOException e) {
				System.err.println("Error in closing the file: " + e.getMessage());
			}
		}
	}
}
            
