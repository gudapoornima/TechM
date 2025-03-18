package Generic;

import java.util.ArrayList;
import java.util.List;

public class Generic6{
    public static <T> List<T> mergeAlternately(List<T> list1, List<T> list2) {
        List<T> mergedList = new ArrayList<>();
        int size1 = list1.size();
        int size2 = list2.size();
        int maxSize = Math.max(size1, size2);
        for (int i = 0; i < maxSize; i++) {
            if (i < size1) {
                mergedList.add(list1.get(i));
            }
            if (i < size2) {
                mergedList.add(list2.get(i)); 
            }
        }
        return mergedList; 
    }

    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 3, 5, 7);
        List<Integer> list2 = List.of(2, 4, 6, 8, 10);
        List<Integer> mergedList = mergeAlternately(list1, list2);
        System.out.println("Merged List: " + mergedList);
    }
}
