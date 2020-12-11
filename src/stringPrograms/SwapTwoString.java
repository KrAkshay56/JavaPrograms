package stringPrograms;

import java.util.Scanner;

public class SwapTwoString {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter string1: ");
		String string1 = scan.next();
		System.out.println("Enter string2: ");
		String string2 = scan.next();
		System.out.println("Before swapping");
		System.out.print("string1 = "+string1+"\t"+"string2 = "+string2);
		string1=string1+string2;
		string2=string1.substring(0, string1.length()-string2.length());
		string1=string1.substring(string2.length());
		System.out.println("\nAfter swapping");
		System.out.print("string1 = "+string1+"\t"+"string2 = "+string2);
		scan.close();
	}

}
