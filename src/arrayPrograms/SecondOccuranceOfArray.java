package arrayPrograms;

public class SecondOccuranceOfArray {

	public static int secondocuurance(int[] arr,int element) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(element==arr[i]) {
				count++;
			}
			if(count==2) {
				return i;
			}
		}
		return -1;
		
	}
	


public static void main(String[] args) {
	int[] arr= {10,20,10,30,10,40,40};

	int index=secondocuurance(arr, 40);
	System.out.println(index);
}

}
