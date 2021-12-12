package arrays;

public class Array_Object {

	public static void main(String[] args) {
		Object [][] arr = {{"Mayur", 33, 5.11, "M"}, {"Bianca", 22, 5.9, "F"}};
		
		for (Object [] x : arr) {
			for(Object y : x) {
				System.out.println(y + " ");
			}
			System.out.println("\n");
		}

	}

}
