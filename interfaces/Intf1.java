package interfaces;

public interface Intf1 {
	static final int a = 100;
	void doThis();
	
	static void xyz() {
		System.out.println("Static xyz from Intf1");
	}
	
	default void uvw() {
		System.out.println("Default uvw from Intf1");
	}
}
