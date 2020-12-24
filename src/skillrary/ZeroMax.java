package skillrary;
/*
 * Return a version of the given array where each zero value in the array is replaced by the 
 * largest odd value to the right of the zero in the array. 
 * If there is no odd value to the right of the zero, leave the zero as a zero.


zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]
zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
zeroMax([0, 1, 0]) → [1, 1, 0]
 */
public class ZeroMax {
	public static void main(String[] args) {
		int[] arr= {0, 1, 0};
		arr=zeroMax(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+", ");
		}
	}
	public static int[] zeroMax(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==0 && arr[i+1]%2!=0) {
				arr[i]=arr[i+1];
			}
		}
		return arr;
	}

}
