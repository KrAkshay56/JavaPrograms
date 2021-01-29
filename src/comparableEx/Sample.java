package comparableEx;

public interface Sample {
	
	 static void m1() {
		System.out.println("method inside interface");
	}

	default void m2() {
		System.out.println("default method inside interface");
	}
}
