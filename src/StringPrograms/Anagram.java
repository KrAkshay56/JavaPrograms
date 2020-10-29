package StringPrograms;

import java.util.Arrays;

public class Anagram {
	
	//Anagram
	
	/*
	 * str1="Grab" str2="Brag"
	 */
	
	public static void main(String[] args) {
		
		String str1="Grab";
		String str2="Brag";
		
		if(str1.length()==str2.length()) {
			
			str1=str1.toLowerCase();
			str2=str2.toLowerCase();
			
			char[] arr1 = str1.toCharArray();
			char[] arr2 = str2.toCharArray();
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			if(Arrays.equals(arr1, arr2)) {
				System.out.println("anagram");
			}
			

		}
		else
		{
			System.out.println("not anagram");
		}
	}

}
