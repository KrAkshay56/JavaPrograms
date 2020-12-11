package stringPrograms;

import java.util.Scanner;

public class GetAllNumericValueInString {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter alphanumeric word");
		String word = scan.nextLine();
		int num=0, sum=0;
		for(int i=0;i<word.length();i++) {
			char ch=word.charAt(i);
			if(ch>=47 && ch<=58) {
				num=Character.getNumericValue(ch);
				sum=sum*10+num;
			}
		}
		System.out.println(sum);
		scan.close();
	}

}
