package day3_ArrayPrograms;

public class BubbleSort {
	public static void main(String[] args) {
	int[] arr= {1,-2,11,7,66,13};
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+",");
	}
	
	}
}
