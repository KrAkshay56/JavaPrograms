package handleException;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the age:");
		int age=scan.nextInt();
		scan.close();
		try {
			TestCustomException.generateVoterID(age);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
