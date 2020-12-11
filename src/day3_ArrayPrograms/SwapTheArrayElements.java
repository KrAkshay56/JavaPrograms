package day3_ArrayPrograms;

public class SwapTheArrayElements {
	
	public static int[] swap(int[] arr) {
		for(int i=0;i<arr.length/2;i++) {
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
		
		return arr;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,11,13,17};
		arr=swap(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
