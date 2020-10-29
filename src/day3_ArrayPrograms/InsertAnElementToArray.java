package day3_ArrayPrograms;

public class InsertAnElementToArray {
	
	public static int[] insert(int[] arr,int index,int element) {
		if(index>arr.length || index<0) {
			System.out.println("specified index is out of range");
		}
		for(int i=arr.length-1;i>index;i--) {
			arr[i]=arr[i-1];
		}
		
		arr[index]=element;
		
		return arr;
	}
	
	public static void display(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		
		int[] arr= {10,20,30,40};
		System.out.println("before insertion");
		display(arr);
		
		insert(arr, 6, 50);
		System.out.println("after insertion");
		display(arr);
	}

}
