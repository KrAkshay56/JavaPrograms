package day3_ArrayPrograms;

import java.util.Scanner;

public class StringNEqualParts {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter string");
		String str=scan.next();
		System.out.println("enter the number to make string n equal parts");
		int parts=scan.nextInt();
		int num=str.length()/parts;
		String[] newStr=new String[parts];
		int temp=0;
		if(str.length()%parts!=0) {
			System.out.println("String length cannot be divided into "+parts+" parts");
		}
		else {
		for(int i=0;i<str.length();i=i+num) {
			newStr[temp++]=str.substring(i, i+num);
		}
		}
		
		for(int i=0;i<newStr.length;i++) {
			System.out.println(newStr[i]);
		}
		scan.close();
	}

}
