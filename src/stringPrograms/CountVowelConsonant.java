package stringPrograms;

import java.util.Scanner;

public class CountVowelConsonant {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str = scan.nextLine();
		str=str.toLowerCase();
		int vCount = 0,cCount=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				vCount++;
			}
			else
			{
				cCount++;
			}
		}
		
		System.out.println("Total number of vowels is "+vCount+" \n and "
				+ "total number of consonants is "+cCount);
		scan.close();
	}

}
