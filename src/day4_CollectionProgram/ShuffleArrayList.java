package day4_CollectionProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ShuffleArrayList {
	//How to shuffle elements in ArrayList?
	public static void main(String[] args) {
		ArrayList<Integer> first=new ArrayList<Integer>();
		first.add(10);
		first.add(20);
		first.add(30);
		first.add(10);
		first.add(60);
		first.add(66);
		first.add(90);
		first.add(150);
		System.out.println("Before shuffle");
		Iterator<Integer> itr=first.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Collections.shuffle(first);
		System.out.println("After shuffle");
		ListIterator<Integer> litr = first.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		
	}

}
