package stringPrograms;

import java.util.Scanner;

public class DuplicateCharacterInWord {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter string: ");
		String str=scan.nextLine();
		str=str.toLowerCase();
		char[] string = str.toCharArray();
		for(int i=0;i<string.length;i++) {
			int count=1;
			for(int j=i+1;j<string.length;j++) {
				if(string[i]==string[j] && string[i]!='0') {
					count++;
					string[j]='0';
				}
			}
			if(count>1 && string[i]!='0') {
				System.out.println(string[i]+" occurred "+count+ " time");
			}
		}
		scan.close();

	}
}
