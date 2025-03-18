package assign1;
import java.util.Scanner;
public class reverseOfNumber {

	public static void main(String[] args) {
		
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int a1=a;
      int rev=0;
      while(a!=0)
      {
    	  int d=a%10;
    	  rev=rev*10+d;
    	  a=a/10;
      }
      
      System.out.println(rev);
      
      
	}

}