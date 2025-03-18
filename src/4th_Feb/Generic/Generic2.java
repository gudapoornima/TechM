package Generic;

public class Generic2 {
    public static void main(String[] args) {
        Integer[] arr1 = {10, 20, 30};
        Integer[] arr2 = {10, 20, 30};

        Generic1<Integer> ob1 = new Generic1<>(arr1, arr2);
        System.out.println("Arrays are equal: " + ob1.check());
    }
}
