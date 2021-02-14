package arrayProgram;

public class SecondMin {
	public static void main(String[] args) {
		int[] arr= {100,2,3,7,4,5,8,6,9};
		//System.out.println(secondMax(arr));
		smax(arr);
	}
	public static int secondMax(int[] arr) {
		int max=arr[0];
		int index=0;
		int secondMax=0;
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];	
				index=i;
			}
		}
		arr[index]=-1;
	//	System.out.println(index);
		for(int i=1;i<arr.length;i++) {
			if(secondMax<arr[i]) {
				secondMax=arr[i];
			}
		}
		return secondMax;
	}
	static void smax(int[] arr) {
		int max=arr[0];
		int resMax=0;
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				resMax=max;
				max=arr[i];
				
			}
		}
		System.out.println(resMax);
	}

}
