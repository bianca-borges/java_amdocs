package java_basics;

public class LogicalOperators {

	public static void main(String[] args) {
		// AND &&
				// OR ||
				// NOT !
				/*
				 * Bitwise
				 * 
				 * AND &
				 * OR |
				 * Compliment ~ 
				 * */
				
//				boolean a = true;
//				boolean b = false;
//				
//				System.out.println(a && b);
//				System.out.println(a || b);
//				System.out.println(!a);
				
				int num1 = 60; //111100 => 000011 ~
				int num2 = 42; //101010
				               //101000 => 40 AND
				               //111110 => 62 OR
				
				System.out.println(num1 & num2);
				System.out.println(num1 | num2);
				System.out.println(~num1);

	}

}
