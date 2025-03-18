package Generic;

import java.util.List;

public class Generic4  {
    public static <T> int findFirstOccurrence(List<T> list, T target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) {
                return i; 
            }
        }
        return -1; 
    }
    
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 3, 7);
        Integer target = 3;
        
        int index = findFirstOccurrence(numbers, target);
        if (index != -1) {
            System.out.println("First occurrence of " + target + " is at index: " + index);
        } else {
            System.out.println(target + " not found in the list.");
        }
    }
}
