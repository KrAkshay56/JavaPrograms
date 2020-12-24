package interviewProg;
/*
 * Given 2 int arrays, a and b, of any length, return a new array with the first element of each array. If either array is length 0, ignore that array.


front11([1, 2, 3], [7, 9, 8]) → [1, 7]
front11([1], [2]) → [1, 2]
front11([1, 7], []) → [1]
 */
public class MultiDimension {

	public static void main(String[] args) {
		int[] a= {};
		int[] b= {1,2};
		int[] arr = newArr(a, b);
		//System.out.println(newArr(a, b));
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+", ");
		}
	}
	public static int[] newArr(int[] a,int[] b) {
		int[] arr = null;
		if(a.length>0 && b.length>0) {
			arr=new int[2];
			arr[0]=a[0];
			arr[1]=b[0];
		}else if(a.length==0 && b.length>0) {
			arr=new int[1];
			arr[0]=b[0];
		}else if(a.length>0 && b.length==0) {
			arr=new int[1];
			arr[0]=a[0];
		}
		
		return arr;
	}
}
