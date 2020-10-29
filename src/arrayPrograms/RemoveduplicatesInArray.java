package arrayPrograms;

import java.util.Arrays;

public class RemoveduplicatesInArray {
	
	public static int removeDuplicates(int[] arr,int length) {
		if(length==0 || length==1) {
			return length;
		}
		
		int[] temp=new int[length];
		int j=0;
		
		for(int i=0;i<length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j++]=arr[i];
			}
		}
		
		temp[j++]=arr[length-1];
		
		for(int i=0;i<j;i++) {
			arr[i]=temp[i];
		}
		return j;
	}
	
	
	public static void main(String[] args) {
		
		int[] arr= {10,20,20,30,30,40,50,50};
		
		int lenth=removeDuplicates(arr, arr.length);
		
		for(int i=0;i<lenth;i++) {
			System.out.println(arr[i]);
		}
		
	}

}
