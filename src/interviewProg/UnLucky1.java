package interviewProg;
/*
 * We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. 
 * Return true if the given array 
 * contains an unlucky 1 in the first 2 or last 2 positions in the array.
 * unlucky1([1, 3, 4, 5]) → true
unlucky1([2, 1, 3, 4, 5]) → true
unlucky1([1, 1, 1]) → false
 */
public class UnLucky1 {
	public static void main(String[] args) {
		int[] arr={1, 1, 1,3};
		System.out.println(unlucky1(arr));
	}
	public static boolean unlucky1(int[] arr) {
		boolean flag=false;
		for(int i=0;i<arr.length-1;i++) {
			if((index(arr, 1)==0 || index(arr, 1)==1) && arr[i]==1 && arr[i+1]==3) {
				flag=true;
				break;
			}
			else if(arr[i]==1 && arr[i+1]==3 && (index(arr, 1)==arr.length-2 || index(arr, 1)==arr.length-1 )) {
				flag=true;
				break;
			}
		}
		return flag;
	}
	public static int index(int[] arr,int value) {
		int position=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==value) {
				position=i;
				break;
			}
		}
		return position;
	}

}
