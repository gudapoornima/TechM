package Generic;

import java.util.List;

public class Generic3 {
    
     public static <T extends Number> void sumEvenOdd(List<T> numbers) {
        int evenSum = 0;
        int oddSum = 0;
        for (T number : numbers) {
            if (number.intValue() % 2 == 0) {
                evenSum += number.intValue();
            } else {
                oddSum += number.intValue();
            }
        }
        System.out.println("Sum of Even Numbers: " + evenSum);
        System.out.println("Sum of Odd Numbers: " + oddSum);
    }

    public static void main(String[] args) {
         List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        sumEvenOdd(numbers);
    }
}
