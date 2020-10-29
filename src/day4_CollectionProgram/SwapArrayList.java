package day4_CollectionProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class SwapArrayList {
	/*
	 * How to swap two elements in a ArrayList? 
	 */
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
		
		System.out.println("Before swapping");
		ListIterator<Integer> litr = first.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		
		Collections.swap(first, 0, first.size()-1);
		
		System.out.println("After swapping");
		ListIterator<Integer> litr1 = first.listIterator();
		while(litr1.hasNext()) {
			System.out.println(litr1.next());
		}
	}

}
