package stringPrograms;

import java.util.Scanner;

public class LongestWordInString {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any sentence: ");
		String str=scan.nextLine();
		String[] string = str.split(" ");
		int maxLength=0;
		String word="";
		for(int i=0;i<string.length;i++) {
			if(maxLength<string[i].length()) {
				maxLength=string[i].length();
				word=string[i];
			}
		}
		System.out.println("word: "+word+" and the length is"+maxLength);
		scan.close();
	}
}
