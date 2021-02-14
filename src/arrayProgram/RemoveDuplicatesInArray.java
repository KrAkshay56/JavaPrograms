package arrayProgram;

import java.util.Arrays;

public class RemoveDuplicatesInArray {
public static void main(String[] args) {
	int arr[] = {10,20,20,30,30,40,50,50,10,10,10,60}; 
	System.out.println(Arrays.toString(removeDuplicates(arr)));
}
	public static int[] removeDuplicates(int[] arr) {
		int dup=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j] && arr[i]!=0) {
					dup++;
					arr[j]=0;
				}
			}
		}
		int[] newArr=new int[arr.length-dup];
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				newArr[temp]=arr[i];
				temp++;
			}
		}
		return newArr;
	}
}
