package stringPrograms;

import java.util.Scanner;

public class StringTitle {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Type sentence");
		String str = scan.nextLine();
		System.out.println(title(str));
		scan.close();
	}
	
	public static String title(String str) {
		str=str.toLowerCase();
		String[] string = str.split(" ");
		String newStr="";
		for(int i=0;i<string.length;i++) {
			String word=string[i];
			for(int j=0;j<word.length();j++) {
				if(j==0) {
					newStr=newStr+(char)(word.charAt(j)-32);
				}
				else
				{
					newStr=newStr+word.charAt(j);
				}
			}
			newStr=newStr+" ";
		}
		return newStr;
	}

}
