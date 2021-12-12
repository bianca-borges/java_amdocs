package java_basics;

public class Nested_If {

	public static void main(String[] args) {
		/*
		 * Create a program to find the grade of a stufrnt
		 * marks >= 90 - A
		 * marks >= 75 - B
		 * marks >= 60 - C
		 * marks >= 40 - D
		 * marks < 40 - F
		 */
		
		int marks = 99;
		
		if (marks >= 90) {
			System.out.println("A");
		} else if (marks > 75) {
			System.out.println("B");
		}else if (marks > 60) {
			System.out.println("C");
		}else if (marks > 40) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
		
		

	}

}
