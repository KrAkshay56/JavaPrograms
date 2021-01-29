package handleException;

import java.util.Scanner;

public class Employee {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the salary amount: ");
	int salary = scan.nextInt();
	scan.close();
	if(salary<30000) {
		try {
		throw new SalaryException();
		}
		catch (SalaryException e) {
			e.printStackTrace();
		}
	}
	else
	{
		System.out.println("salary amount is greater than 30000/-");
	}
	}
}
