package regular_expressions;

public class Intro {

	public static void main(String[] args) {
		String str1 = "+1#678-675-(8765)";
		String str2 = str1.replace("+", "").replace("-", "").replace("(", "").replace(")", "");
		System.out.println(str2);
		
		String patt = "[^A-Za-z0-9]";
		String str3 = str1.replaceAll(patt, "");
		System.out.println(str3);

	}

}
