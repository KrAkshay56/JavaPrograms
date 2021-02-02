package interview;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintDuplicates {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		String[] str= {"cat","dog","act","god"};
		for(String s:str) {
			list.add(s);
		}
		for(int i=0;i<str.length;i++) {
			str[i]=sortInAlpha(str[i]);
		}
		for(int i=0;i<str.length;i++) {
			for(int j=i+1;j<str.length;j++) {
				if(str[i].equals(str[j])) {
					System.out.println(list.get(i)+"-"+list.get(j));
					
				}
			}
		}
		
	}
	
	public static String sortInAlpha(String str) {
		String sort="";
		char[] arr=str.toCharArray();
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			sort+=arr[i];
		}
		return sort;
	}
	

}
