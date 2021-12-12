package regular_expressions;

public class Quantifiers {

	public static void main(String[] args) {
//		String patt = "abc*";
//		String patt = "abc+";
		String patt = "abc?";
		String str1 = "ab";
		
		System.out.println(str1.matches(patt));

	}

}
