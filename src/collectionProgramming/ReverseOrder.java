package collectionProgramming;

import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseOrder {
	public static void main(String[] args) {
	LinkedList<Integer> list=new LinkedList<Integer>();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	list.add(50);
	System.out.println(list);
	ListIterator<Integer> itr = list.listIterator(list.size()-1);
	while(itr.hasPrevious()) {
		System.out.println(itr.previous());
	}
	}
}
