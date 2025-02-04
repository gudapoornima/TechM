/* Write a JAVA Program that throws an exception 
and catch it using a Try-Catch block */ 

package Day2;
import java.util.Scanner;

public class Exception1 {
	public static void main(String args[]) {
		int res;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number values:");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		try {
			res=n1/n2;
			System.out.println("The division result is: " +res);
		}
		catch(ArithmeticException e) {
			System.err.println("Cannot divide the number with 0");
			//e.printStackTrace();
		sc.close();	
		}
	}
}






	