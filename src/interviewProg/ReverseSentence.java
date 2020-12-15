package interviewProg;

import java.util.Scanner;

public class ReverseSentence {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str = scan.nextLine();
		String[] strArr=str.split(" ");
		String rev=" ";
		for(int i=strArr.length-1;i>=0;i--) {
			String word=strArr[i];
			for(int j=word.length()-1;j>=0;j--) {
				rev=rev+word.charAt(j);
			}
			rev=rev+" ";
		}
		System.out.println(rev);
		scan.close();
	}

}
