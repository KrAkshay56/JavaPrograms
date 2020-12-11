package stringPrograms;

import java.util.Scanner;

public class LengthOfStringWithoutUsingLengthMethod {
	
	public static int getLength(String word) {
		int length=0;
		char[] arr = word.toCharArray();
		for(char a:arr) {
			length++;
		}
		return length;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the word");
		String word = scan.nextLine();
		int length = getLength(word);
		System.out.println(length);
		scan.close();
	}
	
}
