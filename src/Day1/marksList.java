/*Write a java program to accept the students name and marks in subjects and 
find the total and average of the marks and sort the list accordingly.*/

package Day1;
 
import java.util.Scanner;
import java.util.*;

public class marksList {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int n = sc.nextInt();
        System.out.println("Enter the number of subjects:");
        int s = sc.nextInt();

        List<Integer> avg = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int sum = 0;
            System.out.println("Student " + (i + 1) + ": Enter marks of " + s + " subjects:");
            for (int j = 0; j < s; j++) {
                sum += sc.nextInt();
            }
            avg.add(sum / s);
            System.out.println("Avg marks:" + avg);
        }

        Collections.sort(avg, Collections.reverseOrder()); 

        System.out.println("\nSorted Order of Averages:");
       
            System.out.print(avg + " ");

        sc.close();
    }
}
