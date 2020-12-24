package interviewProg;
/*
 * Given an int array length 2, return true if it does not contain a 2 or 3.
 */
public class NoTwoThree {
	public static void main(String[] args) {
		int[] arr= {2,3};
		System.out.println(no23(arr));
	}
	public static boolean no23(int[] arr) {
		boolean flag=true;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==2 || arr[i]==3) {
				flag=false;
			}
		}
		return flag;
	}

}
