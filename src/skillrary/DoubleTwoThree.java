package skillrary;
/*
 * Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.
 */
public class DoubleTwoThree {
	public static void main(String[] args) {
		int[] arr= {1,2,3,3,};
		System.out.println(double23(arr));
	}
	public static boolean double23(int[] arr) {
		int count2=0;
		int count3=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==2) {
				count2++;
			}
			if(arr[i]==3) {
				count3++;
			}
		}
		if(count2==2) {
			return true;
		}else if(count3==2) {
			return true;
		}
		else 
		{
			return false;
		}
	}

}
