package interviewProg;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str=scan.nextLine();
		String[] string=str.split(" ");
		String rev=" ";
		for(int i=string.length-1;i>=0;i--) {
			rev=rev+string[i]+" ";
		}
		System.out.println(rev);
		scan.close();
	}

}
