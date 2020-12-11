package day3_ArrayPrograms;

public class OccuranceOfElement {
	
	public static int occurance(int[] arr,int element) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[] arr=new int[] {1,2,3,4,1,5,1,1};
		System.out.println(occurance(arr, 1));
	}

}
