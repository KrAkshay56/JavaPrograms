package interviewProg;
/*
 * Given an int array, return a new array with double the length where 
 * its last element is the same as the original array, and all the other elements are 0. 
 * The original array will be length 1 or more. Note: by default, a new int array contains all 0's.


makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
makeLast([1, 2]) → [0, 0, 0, 2]
makeLast([3]) → [0, 3]
 */
public class DoubleArray {
	public static void main(String[] args) {
		int[] arr= {1, 4};
		int[] arr1 = makeLast(arr);
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+", ");
		}
	}
	public static int[] makeLast(int[] arr) {
		int[] newArr=new int[2*arr.length];
		for(int i=0;i<newArr.length;i++) {
			if(i==newArr.length-1) {
				newArr[i]=arr[arr.length-1];
			}else
			{
				newArr[i]=0;
			}
		}
		return newArr;		
		
	}

}
