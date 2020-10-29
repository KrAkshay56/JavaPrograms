package StringPrograms;

import java.util.ArrayList;

public class CopyArraylistToArray {
	/*
	 * How to copy ArrayList to array
	 */
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(60);
	al.add(0);
	al.add(5);
	al.add(66);
	al.add(45);
	
	int[] arr=new int[al.size()];
	for(int i=0;i<al.size();i++) {
		arr[i]=al.get(i);
	}
	
	for(int ar:arr) {
		System.out.println(ar);
	}
}
}
