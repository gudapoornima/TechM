package CollectApi;
import java.util.ArrayList;
import java.util.Collections;

public class sortArray {
	public static void main(String[] args) {
		ArrayList<Integer> numbers=new ArrayList<>();
		ArrayList<String> colors=new ArrayList<>();
		numbers.add(24);
		numbers.add(21);
		numbers.add(495);
		numbers.add(21);
		numbers.add(-1);
		numbers.add(0);
		colors.add("red");
		colors.add("blue");
		colors.add("pink");
		colors.add("yellow");
		System.out.println("Before Sorting : "+numbers);
		System.out.println("Before Sorting : "+colors);
		Collections.sort(numbers);
		Collections.sort(colors);
		System.out.println("After Sorting : "+numbers);
		System.out.println("After Sorting : "+colors);
	}

}
