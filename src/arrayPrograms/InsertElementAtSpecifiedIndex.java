package arrayPrograms;

public class InsertElementAtSpecifiedIndex {

	public static int[] insert(int[] arr,int element,int index) {
		if(index>arr.length || index<0) {
			System.out.println("invalid index");
		}else {
			int[] newArray=new int[arr.length+1];

			for(int i=0;i<arr.length;i++) {
				newArray[i]=arr[i];
			}

			for(int i=index;i<newArray.length-1;i++) {
				newArray[i+1]=newArray[i];
			}
			newArray[index]=element;
			newArray[newArray.length-1]=arr[arr.length-1];
			return newArray;
		}
		return arr;
	}

	public static void main(String[] args) {
		int arr[]= {10,20,30,40};

		int[] ar = insert(arr, 50, 3);
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
	}

}
