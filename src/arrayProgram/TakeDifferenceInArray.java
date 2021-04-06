package arrayProgram;

public class TakeDifferenceInArray {
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		System.out.println(findDiff(arr));
	}
	
	public static int findDiff(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length-1;i++) {
			int diff=Math.abs(arr[i]-arr[i+1]);
			sum+=diff;
		}
		return sum;
	}

}
