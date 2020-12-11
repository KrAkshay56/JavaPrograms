package day3_ArrayPrograms;

public class BinarySearch {
	public static int binarySearch(int[] arr, int key)	
	{	
		int first=0;
		int last=arr.length-1;
		int mid=(first+last)/2;
		while(first<=last) {
			if(key==arr[mid]) {
				return mid;
				
			}
			else if(arr[mid]<key) {
				first=mid+1;
			}
			else
			{
				last=mid-1;
			}
			mid=(first+last)/2;
		}
		return -1;
		

	}	
	public	static void	main(String[] args)	
	{	
		int[] i={10,49,67,90,40,86};	
		System.out.println(binarySearch(i,49));	
	}	

}
