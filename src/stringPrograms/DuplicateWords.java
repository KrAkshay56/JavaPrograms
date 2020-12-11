package stringPrograms;

import java.util.Scanner;

public class DuplicateWords {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the sentence: ");
	String string = scan.nextLine();
	string=string.toLowerCase();
	String[] str = string.split(" ");
	for(int i=0;i<str.length;i++) {
		int count=1;
		for(int j=i+1;j<str.length;j++) {
			if(str[i].equals(str[j])) {
				count++;
				str[j]="0";
			}
		}
		if(count>1 && str[i]!="0") {
			System.out.println(str[i]+"=="+count);
		}
	}
	scan.close();
	}

}
