package CollectApi;

import java.awt.Color;
import java.util.LinkedList;
import java.util.ListIterator;
public class reverseorder {
	public static void main(String[] arg) {
		LinkedList<String> colors=new LinkedList<>();
		colors.add("red");
		colors.add("blue");
		colors.add("green");
		colors.add("yellow");
		ListIterator<String> colorIter=colors.listIterator(colors.size());
		while(colorIter.hasPrevious()) {
			System.out.println(colorIter.previous());
		}
		
		
	}
}
