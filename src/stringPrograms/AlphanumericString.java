package stringPrograms;

import java.util.Scanner;

public class AlphanumericString {
	
	public static boolean isAplhaNumeric(String str) {
		boolean flag=false;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>=47 && ch<=58) {
				flag=true;
				break;
			}
		}
		return flag;
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any Word");
		String str=scan.next();
		boolean flag = isAplhaNumeric(str);
		System.out.println(flag);
		scan.close();
	}

}
