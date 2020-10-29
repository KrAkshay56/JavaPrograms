package day4_CollectionProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ConvertLinkedListToArray {
	/*
	 * How to copy LinkedList to array? 
	 */
	public static void main(String[] args) {
		
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(123);
		list.add(456);
		list.add(12);
		list.add(-1);
		
//		Object[] arr = list.toArray();
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		
		
		int[] arr1=new int[list.size()];
		for(int i=0;i<list.size();i++) {
			arr1[i]=list.get(i);
			System.out.println(arr1[i]);
		}
		
		List<int[]> al=Arrays.asList(arr1);
		
		
				
		
	}

}
