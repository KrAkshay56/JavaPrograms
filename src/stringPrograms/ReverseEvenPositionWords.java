package stringPrograms;

import java.util.Scanner;

public class ReverseEvenPositionWords {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any sentence");
		String str = scan.nextLine();
		
		System.out.println(reverseEvenWord(str));
		scan.close();
	}
	public static String reverseEvenWord(String str) {
		String[] string = str.split(" ");
		String rev="";
		for(int i=0;i<string.length;i++) {
			if(i%2==0) {
				String word = string[i];
				for(int j=word.length()-1;j>=0;j--) {
					rev = rev+word.charAt(j);
				}
			}
			else
			{
				rev = rev+string[i];
			}
			rev = rev+" ";
		}
		return rev;
	}

}
