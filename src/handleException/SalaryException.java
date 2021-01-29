package handleException;

public class SalaryException extends RuntimeException {
	
	public void info() {
		System.out.println("salary is less than 30000/-");
	}

}
