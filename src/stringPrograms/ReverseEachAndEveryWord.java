package stringPrograms;

import java.util.Scanner;

public class ReverseEachAndEveryWord {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String str=scan.nextLine();
		String[] string=str.split(" ");
		String rev="";
		for(int i=0;i<string.length;i++) {
			String word=string[i];
			for(int j=word.length()-1;j>=0;j--) {
				rev=rev+word.charAt(j);
			}
			rev=rev+" ";
		}
		System.out.println(rev);
		scan.close();
	}

}
