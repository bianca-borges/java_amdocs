package special_classes;

public class Math_Class {

	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 200;
		
		System.out.println(Math.min(num1, num2));
		System.out.println(Math.max(num1, num2));
		
		System.out.println(Math.pow(2, 10));
		System.out.println(Math.sqrt(num2));
		System.out.println(Math.cbrt(num2));
		
		double x = 12.98;
		double y = 10.24;
		
		System.out.println(Math.ceil(x));
		System.out.println(Math.ceil(y));
		
		System.out.println(Math.floor(x));
		System.out.println(Math.floor(y));
		
		System.out.println(Math.round(x));
		System.out.println(Math.round(y));
		
		System.out.println(Math.random());

	}

}
