package skillrary;
/*
 * Given an array of ints, return the sum of the first 2 elements in the array. 
 * If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.


sum2([1, 2, 3]) → 3
sum2([1, 1]) → 2
sum2([1, 1, 1, 1]) → 2
 */
public class SumTwo {
	public static void main(String[] args) {
		int[] arr= {1,10};
		System.out.println(sum2(arr));
	}
	public static int sum2(int[] arr) {
		int sum=0;
		if(arr.length<=0) {
			return sum;
		}
		else
		{
			for(int i=0;i<2;i++) {
				sum=sum+arr[i];
			}
			return sum;
		}

	}

}
