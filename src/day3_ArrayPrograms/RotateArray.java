package day3_ArrayPrograms;

public class RotateArray {
	public static void main(String[] args) {
		int[] arr= {10,20,13,11,4,5};
		arr=rotateArray(arr, 2);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+", ");
		}
	}
	
	public static int[] rotateArray(int[] arr,int rotation) {
		for(int i=0;i<rotation;i++) {
			int temp=arr[0];
			for(int j=0;j<arr.length-1;j++) {
				arr[j]=arr[j+1];
			}
			arr[arr.length-1]=temp;
		}
		return arr;
	}
	

}
