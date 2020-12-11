package day3_ArrayPrograms;

public class RemoveAnElement {
	
	public static int[] remove(int[] arr,int element) {
		int index = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element);
			{
				index=i;
			}
		}
		
		for(int i=arr.length-1;i>=index;i--) {
			arr[i-1]=arr[i];
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		arr=remove(arr, 10);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
