/* You are required to create a string and captialize every alternative character
for eg : if the input is anurag then output should be AnUrAg */


package Day1;
import java.util.Scanner;

public class alternateCapital {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter you string:");
		String str=sc.nextLine();
		str=str.toLowerCase();
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i+=2) {
			ch[i]=Character.toUpperCase(ch[i]);
			
		}
		System.out.print("Alternatively capitalised string:" +new String(ch));
		
	}
}


//charAt-StringBuilder


	

