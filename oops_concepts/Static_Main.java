package oops_concepts;

public class Static_Main {

	public static void main(String[] args) {
		Static_Keywords sk1 = new Static_Keywords();
		Static_Keywords sk2 = new Static_Keywords();
		
		sk1.age = 7;
		sk1.grade = "2nd";
		Static_Keywords.name = "Rob";
		
		sk2.age = 8;
		sk2.grade = "3rd";
		Static_Keywords.name = "Shyam";
		
		sk1.displayDetails();
		sk2.displayDetails();
		

	}

}
