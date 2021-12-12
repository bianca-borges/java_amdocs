package java_basics;

public class Fibonacci {

	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		f.countTotalBirds(4);
		}
	
	public static int countTotalBirds(int rowNumber) {
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		for(int i = 1; i<= rowNumber; i++) {
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
		}
		System.out.println(num3);
		return num3;
	}

}
