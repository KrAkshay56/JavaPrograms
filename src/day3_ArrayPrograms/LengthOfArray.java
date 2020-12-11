package day3_ArrayPrograms;

public class LengthOfArray {
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		int length=0;
		for(int a:arr) {
			length++;
		}
		System.out.println(length);
	}
}
