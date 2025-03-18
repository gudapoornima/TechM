package assign1;
import java.util.Scanner;
public class perfectSquares 
   {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		double sqrt=Math.sqrt(a);   
		System.out.println(((sqrt - Math.floor(sqrt)) == 0));   
		}  
	}