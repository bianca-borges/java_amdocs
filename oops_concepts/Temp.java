package oops_concepts;

public class Temp {

	public static void main(String[] args) {
		Cars c1 = new Cars();
		c1.color = "Red";
		c1.make = "BMW";
		
		Cars c2 = new Cars();
		c2.color = "Orange";
		c2.make = "Toyota";
		c2.type = "Sedan";
		
		c1.displayDetails();
		c2.displayDetails();

	}

}
