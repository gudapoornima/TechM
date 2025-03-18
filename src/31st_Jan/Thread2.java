/* Write a Java program that creates two threads
to find and print even and odd numbers from 1 to 20 */

package Day2;

public class Thread2 {
	Thread even = new Thread(){
        public void run(){
            for (int i=1;i<=20;i++){
                if (i%2==0) 
                    System.out.println("Even: " +i);	
            }
        }
    };
	 
	 Thread odd=new Thread(){
		 public void run(){
			 for (int i=1;i<=20;i++){
				 if(i%2!=0)
					 System.out.println("Odd: "+i);	 
			 }
		 }
	 };
	 
public static void main(String args[]) {
	Thread2 t=new Thread2();

	t.even.start();	
	t.odd.start();
	}
}
