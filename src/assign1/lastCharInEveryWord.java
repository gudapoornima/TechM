package assign1;
import java.util.Scanner;


public class lastCharInEveryWord {

	public static void main(String[] args) {
		
      Scanner sc=new Scanner(System.in);
      String str="Hey3 Java   Learners";
      
      for(int i=0;i<str.length();i++)
      {
    	 if(str.charAt(i)==' '||i==str.length()-1) {
    		 char c=str.charAt(i-1);
    	     	 if(!Character.isDigit(c)) {
    	     		 if(c!=' '&&i!=str.length()-1)
    	     		 {
    	     			 System.out.print(c);
    	     		 }
    	     		 if(i==str.length()-1)
    	     		 {
    	     			 char b=str.charAt(i);
    	     			 if(b!=' ')
    	     			 {
    	     				 System.out.print(b);
    	     			 }
    	     		 }
    	     	 }

    	 }
    	 }
      
	}

}