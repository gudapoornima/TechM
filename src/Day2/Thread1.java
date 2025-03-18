/* Write a Java program to create a basic Java thread 
that prints "Hello, Java!" when executed */

package Day2;

public class Thread1 extends Thread{
		public void run() {
					System.out.println("Hello, Java!");
			}
		public static void main(String args[]) {
			Thread1 t=new Thread1();
			t.start();	
	}
}