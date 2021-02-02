package interview;

public class ReverseArray {
	public static void main(String[] args) {
		int[] arr= {10,20,30,40};
		int[] newArr=new int[arr.length];
		int temp=0;
		for(int i=arr.length-1;i>=0;i--) {
			newArr[temp]=arr[i];
			temp++;
		}
		System.out.println("==============Before reversing===================");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("===============After reverse and coping to new Array==================");
		for(int i=0;i<newArr.length;i++) {
			System.out.println(newArr[i]);
		}
	}

}
