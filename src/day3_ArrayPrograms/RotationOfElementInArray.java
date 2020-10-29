package day3_ArrayPrograms;

public class RotationOfElementInArray {
	
	public static void main(String[] args) {
		
		int n=2;
		int[] arr= {10,20,30,40};
		System.out.println("Before rotation");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		for(int i=0;i<n;i++) {
			int first=arr[0];
			int j;
			for(j=0;j<arr.length-1;j++) {
				arr[j]=arr[j+1];
			}
			arr[j]=first;
		}
		
		System.out.println("after rotation");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
