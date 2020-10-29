package day4_CollectionProgram;

import java.util.ArrayList;

public class ArraylistContainsAllList {
	public static void main(String[] args) {
		//How to find does ArrayList contains all list elements or not?
		ArrayList<Integer> first=new ArrayList<Integer>();
		first.add(10);
		first.add(20);
		first.add(30);
		first.add(10);
		
		System.out.println(first.size());
		
		ArrayList<Integer> second=new ArrayList<Integer>(first);
		
		second.add(123);
		second.add(456);
		
		System.out.println(second.size());
		
		first.add(89);
		System.out.println(second.containsAll(first));
	}

}
