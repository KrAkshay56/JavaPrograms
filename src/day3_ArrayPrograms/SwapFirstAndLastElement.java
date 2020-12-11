package day3_ArrayPrograms;

public class SwapFirstAndLastElement {

	public static void main(String[] args) {

		int[] arr= {1,2,3,4,5};
		System.out.println("before swapping the element");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
		int temp=arr[0];
		arr[0]=arr[arr.length-1];
		arr[arr.length-1]=temp;
		System.out.println("\nbefore swapping the element");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}

	}
}
