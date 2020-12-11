package stringPrograms;

import java.util.Scanner;

public class Count {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any sentence");
		String str=scan.nextLine();
		int lc=0,uc=0,sc=0,s=0,dc=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>=65 && ch<=90) {
				uc++;
			}else if(ch>=97 && ch<=122) {
				lc++;
			}else if(ch==' ') {
				s++;
			}else if(ch>=48 && ch<=57) {
				dc++;
			}else
			{
				sc++;
			}
		}
		System.out.println("Lowercase count: "+lc);
		System.out.println("Uppercase count: "+uc);
		System.out.println("digits count: "+dc);
		System.out.println("Special character count: "+sc);
		System.out.println("space count: "+s);
		scan.close();
	}

}
