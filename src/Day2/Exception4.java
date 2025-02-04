/*Write a JAVA program that reads a list of numbers from a file 
and throws an exception if any of the numbers are positive*/

package Day2;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception4 {
	public static void main(String[] args) {
		File infile=new File("FileEx1.txt");
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(infile);
			int ch;
			while((ch=fis.read())!= -1) {
				//to convert char to numeric value
				if(Character.isDigit(ch)) { 
					int num=Character.getNumericValue(ch);
					if(num>0) {
						throw new IllegalArgumentException("Positive numbers found: " + num);
					}		
				}	
			}	
		}
		catch (IOException e) {
			System.err.println("Error in finding and reading the file "+e.getMessage());
		}
		
		
		finally {
			try {
				fis.close();
			}
			catch (IOException e) {
				System.err.println("Error closing the file: " + e.getMessage());
			}
		}
	}
}
  