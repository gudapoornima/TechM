package assign1;
import java.util.Scanner;
public class spaceCharCount
 {

	public static void main(String[] args) {
		
       Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
       int c=0;
       int s=0;
       for(int i=0;i<str.length();i++)
       {
    	   if(str.charAt(i)==' ')
    	   {
    		   s++;
    	   }
    	   else {
    	   c++;
    	   }
       }
       System.out.println("No of Spaces " + s);
       System.out.println("No of Characters " + c);
	}

}