package arrayPrograms;

public class DeleteElement {
	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40};
		
		int element=10;
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element) {
				index=i;
			}
		}
		
		for(int i=index;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		
		for(int i=0;i<arr.length-1;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println(arr.length);
	}

}
