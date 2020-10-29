package day4_CollectionProgram;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SubListOfLinkedList {
	/*
	 *  How to get sub list from LinkedList? 
	 */
	
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(123);
		list.add(456);
		list.add(12);
		list.add(-1);
		list.add(123);
		list.add(456);
		list.add(12);
		list.add(-1);
		
		List<Integer> li = list.subList(2, 6);
		Iterator<Integer> itr = li.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
