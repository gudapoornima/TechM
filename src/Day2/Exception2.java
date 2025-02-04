/* Write a Java program to create a method that takes an integer as a parameter 
 * and throws an exception if the number is odd */
 
package Day2;

import java.util.Scanner;

public class Exception2 {
	public static void checkEven(int n) {
		if(n%2!=0) {
			throw new IllegalArgumentException("The "+n+" is odd. Enter an even number");
		}
		else {
			System.out.println("The number "+n+" is even");
		}	
	}
	public static void main(String args[]) throws Exception {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		n = sc.nextInt();
		try {
			checkEven(n);
		}
		catch(IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		sc.close();	
		}
}
	 

	 