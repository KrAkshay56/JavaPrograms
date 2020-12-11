package day3_ArrayPrograms;

public class SearchElementInArray {
	
	public static int search(int[] arr,int element) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element) {
				return i;
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {
		
		int[] arr= {10,20,30,40,50};
		int index = search(arr, 40);
		System.out.println("The element present at a index of "+index);
	}

}
