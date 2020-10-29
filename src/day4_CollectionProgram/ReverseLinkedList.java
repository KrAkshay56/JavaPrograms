package day4_CollectionProgram;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseLinkedList {
	/*
	 * How to reverse LinkedList content?
	 */
	public static void main(String[] args) {
		
		LinkedList<Character> list=new LinkedList<Character>();
		list.add('A');
		list.add('B');
		list.add('C');
		list.add('D');
		list.add('E');
		list.add('F');
		
//		Iterator<Character> itr = list.descendingIterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		ListIterator<Character> itr = list.listIterator(list.size());
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	}

}
