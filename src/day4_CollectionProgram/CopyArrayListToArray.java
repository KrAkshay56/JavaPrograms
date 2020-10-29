package day4_CollectionProgram;

import java.util.ArrayList;

public class CopyArrayListToArray {
	public static void main(String[] args) {
		ArrayList<Integer> first=new ArrayList<Integer>();
		first.add(10);
		first.add(20);
		first.add(30);
		first.add(10);
		
		int[] arr=new int[first.size()];
		
		for(int i=0;i<first.size();i++) {
			arr[i]=first.get(i);
			
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("arr1 array");
		Object[] arr1 = first.toArray();
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
