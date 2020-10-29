package StringPrograms;

public class OccranceOfWord {
	/*Write a java program to find the duplicate words and their number of occurrences in
	a string?*/
	public static void main(String[] args) {
		String str="java appium java api";
		String[] arr=str.split("\s");
		
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].equals(arr[j])) {
					count++;
				}
			}
			System.out.println(count+" "+arr[i]);
		}
	}

}
