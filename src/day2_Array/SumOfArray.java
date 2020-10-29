package day2_Array;

public class SumOfArray {
	public static void main(String[] args) {
		
		int arr[] =new int[] {1,2,3,4,5};
		
		//sum var
		int sum=0;
		//to fetch each int value 
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		
		//print the sum
		System.out.println(sum);
	}

}
