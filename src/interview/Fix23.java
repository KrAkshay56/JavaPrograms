package interview;

public class Fix23 {
	public static void main(String[] args) {
		int[] arr= {3,2,3};
		arr=fix23(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static int[] fix23(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==2 && arr[i+1]==3) {
				arr[i+1]=0;
			}
		}
		return arr;
	}

}
