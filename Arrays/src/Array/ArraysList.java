package Array;

import java.util.ArrayList;
import java.util.Collections;

public class ArraysList {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Bob");
		names.add("Gerald");
		names.add("Loretta");
		names.add("Brian");
		names.add("Gretta");
//		Print whole arraylist
		System.out.println(names);
//		Iterate list with standard for loop
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
//		Iterate loop with enhanced for loop
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println(names.get(1));
		names.set(1, "Hiru");
		System.out.println(names.get(1));
		names.remove(2);
		System.out.println(names);
		names.add("Richard");
		names.add("Rhys");
		Collections.sort(names);
		System.out.println(names);
		Collections.reverse(names);
		System.out.println(names);
		Collections.swap(names, 0, 1);
		System.out.println(names);
        ArrayList<String> arrayListClone =  (ArrayList<String>) names.clone();
		System.out.println(arrayListClone);


	}

}
