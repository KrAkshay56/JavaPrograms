package StringPrograms;

public class ReverseWords {
	/*
	 * Write a program to reverse the given string word wise?
	 */
	public static void main(String[] args) {
		String str="java appium java api";
		String[] arr=str.split("\s");
		
		String rev="";
		for(int i=0;i<arr.length;i++) {
			String word=arr[i];
			for(int j=word.length()-1;j>=0;j--) {
				rev=rev+word.charAt(j);
			}
			rev=rev+" ";
		}
		
		System.out.println(rev);
	}

}
