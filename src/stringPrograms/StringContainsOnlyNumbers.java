package stringPrograms;

import java.util.Scanner;

public class StringContainsOnlyNumbers {
	
	public static boolean containsNumbers(String str) {
		String num="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>=47 && ch<=58) {
				num=num+ch;
			}
		}
		return (str.equals(num));
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter string here");
		String str=scan.next();
		System.out.println(containsNumbers(str));
		scan.close();
	}

}
