package StringPrograms;

public class SecondMinElementArray {
	//Find the 2nd min element from the given int array?
	public static void main(String[] args) {
		
		int[] arr= {12,55,60,5,3,6};
		int secondvalue=getSecondMin(arr,arr.length);
	
		System.out.println(secondvalue);
		
	}
	
	public static int getSecondMin(int[] arr,int length) {

		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr[length-2];
		
	}

}
