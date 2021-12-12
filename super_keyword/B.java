package super_keyword;

public class B extends A{
	int num1;
	public void doThis() {
		System.out.println("Do this from B");
	}
	
	public void xyz() {
		super.doThis();
		System.out.println("XYZ executed.");
	}
}
