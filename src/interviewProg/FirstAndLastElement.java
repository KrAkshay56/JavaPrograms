package interviewProg;
/*
 * Given an array of ints, return a new array length 2 containing the first and 
 * last elements from the original array. 
 * The original array will be length 1 or more.
makeEnds([1, 2, 3]) → [1, 3]
makeEnds([1, 2, 3, 4]) → [1, 4]
makeEnds([7, 4, 6, 2]) → [7, 2]
 */
public class FirstAndLastElement {
	public static void main(String[] args) {
		int[] arr= {};
		int[] arr1 = makeEnds(arr);
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+", ");
		}
	}
	
	public static int[] makeEnds(int[] arr) {
		int[] newArr=null;
		if(arr.length<0){
			return newArr=new int[0];
		}
		else
		 {
			newArr=new int[2];
			newArr[0]=arr[0];
			newArr[1]=arr[arr.length-1];
		}
		return newArr;
	}

}
