package skillrary;
/*
 * We'll say that an element in an array is "alone" if there are values before and after it, 
 * and those values are different from it. Return a version of the given array
 *  where every instance of the given value which is alone is replaced by 
 *  whichever value to its left or right is larger.


notAlone([1, 2, 3], 2) → [1, 3, 3]
notAlone([1, 2, 3, 2, 5, 2], 2) → [1, 3, 3, 5, 5, 2]
notAlone([3, 4], 3) → [3, 4]
 */
public class NotAlone {
	public static void main(String[] args) {
		int[] arr= {5,3,4};
		arr=notAlone(arr,3);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+", ");
		}
	}
	public static int[] notAlone(int[] arr,int value) {
		for(int i=1;i<arr.length-1;i++) {
			if(value==arr[i+1] && value==arr[i-1]) {
				arr[i]=arr[i];
			}
			else if(value<arr[i-1] || value<arr[i+1]) {
				if(arr[i-1]>arr[i+1]) {
					arr[i]=arr[i-1];
				}
				else
				{
					arr[i]=arr[i+1];
				}
			}
		}
		return arr;
	}

}
