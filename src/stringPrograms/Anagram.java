package stringPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first word");
		String str1=scan.nextLine();
		System.out.println("Enter second word");
		String str2=scan.nextLine();
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		if(str1.length()!=str2.length()) {
			System.out.println("string length are not equal");
		}
		else {
		char[] string1 = str1.toCharArray();
		char[] string2 = str2.toCharArray();
		Arrays.sort(string1);
		Arrays.sort(string2);
		if(Arrays.equals(string1, string2)) {
			System.out.println("both are anagram");
		}else
		{
			System.out.println("Not Anagram");
		}
			
		}
		scan.close();
		
	}
}
