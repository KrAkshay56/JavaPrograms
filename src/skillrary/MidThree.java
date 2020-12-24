package skillrary;
/*
 * Given an array of ints of odd length, return a new array length 3 
 * containing the elements from the middle of the array. The array length will be at least 3.


midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
midThree([1, 2, 3]) → [1, 2, 3]
 */
public class MidThree {
	public static void main(String[] args) {
		int[] arr= {1, 2, 3};
		int[] arr1 = mid3(arr);
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+", ");
		}
	}
	public static int[] mid3(int[] arr) {
		int[] newArr=new int[3];
		newArr[0]=arr[(arr.length/2)-1];
		newArr[1]=arr[arr.length/2];
		newArr[2]=arr[(arr.length/2)+1];
		return newArr;
	}

}
