package StringPrograms;

public class OccuranceofGivenelement {
	
	public static int secondOccuranceOf(int[] arr, int ele) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==ele) {
				count++;
			}
			if(count==2) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int[] arr= {10,20,30,10,10,409};
		int index=secondOccuranceOf(arr, 10);
		System.out.println(index);
	}

}
