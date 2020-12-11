package stringPrograms;

import java.util.Scanner;

public class CharacterPresentInString {
	
	public static boolean isPresent(String str,char ch) {
		boolean flag=false;
		for(int i=0;i<str.length();i++) {
			if(ch==str.charAt(i)) {
				flag=true;
				return flag;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Word");
		String str=scan.next();
		str=str.toLowerCase();
		System.out.println(isPresent(str, 'N'));
		scan.close();
	}

}
