package arrayPrograms;

public class RemoveElementAtSpecifiedindex {
	
	public static int[] remove(int arr[],int element,int index) {
		if(index>arr.length || index<0) {
			System.out.println("invalid index");
		}else {
		int[] newArray=new int[arr.length-1];
		
		for(int i=0;i<newArray.length;i++) {
			newArray[i]=arr[i];
		}
		
		for(int i=index;i<arr.length;i++) {
			newArray[i-1]=arr[i];
		}
		return newArray;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int arr[]= {10,20,30,40};

		int[] ar = remove(arr, 10, 1);
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
	}

}
