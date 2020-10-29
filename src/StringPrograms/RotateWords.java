package StringPrograms;

public class RotateWords {
	/*
	 *  Rotate the string word wise by one
	 */

	public static void main(String[] args) {
		String str="java appium java api";
		String[] arr=str.split("\s");
		
		for(int i=0;i<2;i++) {
			String first=arr[0];
			int j;
			for(j=0;j<arr.length-1;j++) {
				arr[j]=arr[j+1];
				
			}
			arr[j]=first;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
