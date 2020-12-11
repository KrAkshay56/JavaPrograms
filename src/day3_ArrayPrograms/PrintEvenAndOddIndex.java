package day3_ArrayPrograms;

public class PrintEvenAndOddIndex {
	public static void main(String[] args) {
	int[] arr= {10,20,30,40,50};
	for(int i=0;i<arr.length;i++) {
		if(i%2==0) {
			System.out.println("Even index "+arr[i]);
		}
		else
		{
			System.out.println("Odd index "+arr[i]);
		}
	}
	}
}
