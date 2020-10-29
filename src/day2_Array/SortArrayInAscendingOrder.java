package day2_Array;

public class SortArrayInAscendingOrder {
	public static void main(String[] args) {
		
		int[] arr= {55,-1,60,0,1};
		
		System.out.println("===before sorting=====");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		MyArrays.sort(arr);
		
		
		System.out.println("===After sorting=====");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

}
}
