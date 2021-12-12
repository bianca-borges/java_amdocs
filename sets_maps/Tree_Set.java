package sets_maps;

import java.util.TreeSet;

public class Tree_Set {

	public static void main(String[] args) {
		var set1 = new TreeSet<String>();
		
		set1.add("Rob");
		set1.add("Bob");
		set1.add("Andy");
		
		System.out.println(set1);
		
		var set2 = new TreeSet<Integer>();
		
		set2.add(100);
		set2.add(10);
		set2.add(50);
		set2.add(2);
		set2.add(0);
		
		System.out.println(set2);

	}

}
