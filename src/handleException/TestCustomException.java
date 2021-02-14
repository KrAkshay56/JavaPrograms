package handleException;

public class TestCustomException {
	
	public static void generateVoterID(int age) throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException("not eligible");
		}
		else
		{
			System.out.println("you are eligible to vote!!!");
		}
	}

}
