package stringPrograms;

import java.util.Scanner;

public class RemoveCharacterInString {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter word");
		String str=scan.next();
		System.out.println("Enter the character index to remove character");
		System.out.println(removeChar(str, scan.nextInt()));
		scan.close();
	}
	public static String removeChar(String str,int index) {
		String newStr="";
		if(index<0 || index>str.length()) {
			System.out.println("index is out of range");
		}else {
			for(int i=0;i<str.length();i++) {
				if(i==index) {
					newStr=newStr+"";
				}
				else
				{
					newStr=newStr+str.charAt(i);
				}
			}
		}
		return newStr;
	}

}
