package Generic;

import java.util.ArrayList;
import java.util.List;

public class Generic5{
    public static <T> List<T> reverseList(List<T> list) {
        List<T> reversedList = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList; 
    }

    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Banana", "Cherry", "Grapess");
        List<String> reversedFruits = reverseList(fruits);
        System.out.println("Original List: " + fruits);
        System.out.println("Reversed List: " + reversedFruits);
    }
}
