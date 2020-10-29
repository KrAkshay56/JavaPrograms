package StringPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class SuffleElementsInArraylist {
/*
 * How to swap 2 elements in ArrayList?
 */
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(60);
		al.add(0);
		al.add(5);
		al.add(66);
		al.add(45);
		System.out.println("===before swap===");
		System.out.println(al);
		Collections.swap(al, 0, al.size()-1);
		System.out.println("===after swap===");
		System.out.println(al);
		
	
	}
	
}
