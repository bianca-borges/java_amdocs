package java_basics;

public class Break_and_Continue {

	public static void main(String[] args) {
		int a = 100;
		
		while(a > 500) {
			a-=5;
			if(a == 75) {
				break;
				// continue;
			}
			System.out.println(a);
		}

	}

}
