package oops_concepts;

public class Methods {

	public static void main(String[] args) {
		Methods m = new Methods();
		m.doThis();
		m.addition(100, 300);
		int x = m.multiply(10, 20);
		System.out.println(x);

	}
	
	public void doThis() {
		System.out.println("Do this executed.");
	}
	
	public void addition(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	public int multiply(int num1, int num2) {
		int num3 = num1*num2;
		return num3;
	}

}
