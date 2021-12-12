package sets_maps;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Iterating_Sets {

	public static void main(String[] args) {
		HashSet<Integer> set1 = new HashSet<Integer>();
		
		set1.add(100);
		set1.add(200);
		set1.add(300);
		set1.add(400);
		set1.add(500);
		
		for(int x : set1) {
			System.out.println(x);
		}
		
		var set2 = new TreeSet<String>();
		
		set2.add("Sun");
		set2.add("Mon");
		set2.add("Tue");
		set2.add("Wed");
		set2.add("Thu");
		
		Iterator it1 = set2.iterator();
		
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}

	}

}
