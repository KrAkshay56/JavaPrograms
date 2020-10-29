package day3_ArrayPrograms;

import java.util.Scanner;

public class SearchAnElement {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] arr= {10,20,30,40,50};
		System.out.println("enter the element");
		int element=scan.nextInt();
		int index = 0;
		for(int i=0;i<arr.length;i++) {
			if(element==arr[i]) {
				index=i;
		}
			
	}
		System.out.println(element+" is present at index"+ index);
		scan.close();

}
}
