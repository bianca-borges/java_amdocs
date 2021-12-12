package arrays;

public class Array_2D {

	public static void main(String[] args) {
		String [] [] arr = {{"a", "b", "c"}, {"d", "e", "f"}, {"asd", "dsfg", "klsdk"}};
//		System.out.println(arr.length);
//		System.out.println(arr[0].length);
//		System.out.println(arr[0][0]);
		arr[0][0] = "Something else";
//		System.out.println(arr[0][0]);	
		
		for(String[] x : arr) {
			for(String y : x) {
				System.out.println(y);
			}
			System.out.println("-----");
		}

	}

}
