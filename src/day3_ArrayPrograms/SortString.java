package day3_ArrayPrograms;

import java.util.Scanner;

public class SortString {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Type the senetence");
		String str=scan.nextLine();
		String[] string = str.split(" ");
		for(int i=0;i<string.length;i++) {
			for(int j=i+1;j<string.length;j++) {
				if(string[i].compareTo(string[j])<0) {
					String temp=string[i];
					string[i]=string[j];
					string[j]=temp;
				}
			}
		}
		for(int i=0;i<string.length;i++) {
			System.out.print(string[i]+" ");
		}
		scan.close();
	}

}
