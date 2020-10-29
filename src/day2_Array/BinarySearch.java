package day2_Array;

public class BinarySearch {
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,6,7,8};
		int search=7;
		
		int first=0;
		int last=arr.length-1;
		int middle=(first+last)/2;
		
		while(first<=last) {
			if(arr[middle]==search) {
				System.out.println("element present at index of "+middle);
				break;
			}
			else if(arr[middle]<search) {
				first=middle+1;
			}
			else
			{
				last=middle-1;
			}
			
			middle=(first+last)/2;
		}
		
		if(first>last) {
			System.out.println("element not found");
		}
	}

}
