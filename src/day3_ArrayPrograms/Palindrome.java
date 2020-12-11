package day3_ArrayPrograms;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the word here: ");
		String str=scan.next();
		String rev="";

		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}

		if(str.equalsIgnoreCase(rev)) {
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
		scan.close();

	}
}
