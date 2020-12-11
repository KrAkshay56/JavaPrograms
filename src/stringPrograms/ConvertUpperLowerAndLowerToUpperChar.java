package stringPrograms;

import java.util.Scanner;

public class ConvertUpperLowerAndLowerToUpperChar {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any word");
		String str=scanner.nextLine();
		char[] arr = str.toCharArray();
		String newStr="";
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=65 && arr[i]<=90) {
				newStr=newStr+(char)(arr[i]+32);
			}
			else if(arr[i]>=97 && arr[i]<=122)
			{
				newStr=newStr+(char)(arr[i]-32);
			}
			else if(arr[i]==' ') {
				newStr=newStr+' ';
			}
		}
		System.out.println(newStr);
		scanner.close();
	}
	
}
