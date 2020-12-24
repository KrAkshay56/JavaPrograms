package interviewProg;
/*
 * Return a version of the given array where all the 10's have been removed. 
 * The remaining elements should shift left towards the start of the array as needed, 
 * and the empty spaces a the end of the array should be 0.
 *  So {1, 10, 10, 2} yields {1, 2, 0, 0}. You may modify and return the given array or make a new array.
 */
public class ShiftTens {
	public static void main(String[] args) {
		int[] arr= {1,99,10,10,2,11,10};
		arr=withoutTens(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+", ");
		}
	}
	
	public static int[] withoutTens(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==10) {
				arr[i]=0;
			}
			
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==0) {
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					
				}
			}
			
		}
		
		return arr;
	}

}
