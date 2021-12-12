package string_operations;

public class String_Basics {

	public static void main(String[] args) {
	/*
	 * Concatenate
	 * Length
	 * Trim
	 * Upper Case
	 * Lower Case
	 * Empty
	 */
		
		String str1 = "De Zinnia ";
		String str2 = "Institutes";
		
		String str3 = str1 + str2;
		System.out.println(str3);
		
		String str4 = str1.concat(str2);
		System.out.println(str4);
		
		
		System.out.println(str1.length());
		
		
		String str5 = "       LUYjfiasj  THGF asjfjasnfj  ansfj  ";
		System.out.println(str5.trim());
		
		
		
		System.out.println(str5.toUpperCase());
		System.out.println(str5.toLowerCase());
		
		
		System.out.println(str5.isEmpty());

	}

}
