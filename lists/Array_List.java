package lists;

import java.util.ArrayList;
import java.util.List;

public class Array_List {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		//List<String> arr1 = new ArrayList<String>();
		
		arr.add("Red");
		arr.add("Purple");
		arr.add("Blue");
		arr.add("Green");
		arr.add("Black");
		
		System.out.println(arr.get(3));
		System.out.println(arr.get(0));
		
		arr.set(3, "Pink");
		arr.set(4, "Pink");
		
//		arr.clear();
		
//		arr.remove(0);
//		arr.remove("Green");
		
		System.out.println(arr.indexOf("Pink"));
		System.out.println(arr.lastIndexOf("Pink"));
		System.out.println(arr.contains("Blue"));
		
		List<String> arr2 = arr.subList(2, 4);
		System.out.println(arr2);
		
		System.out.println(arr.isEmpty());
		System.out.println(arr.size());
		
		System.out.println(arr);
		
		for(String x : arr) {
			System.out.println(x);
		}

	}

}
