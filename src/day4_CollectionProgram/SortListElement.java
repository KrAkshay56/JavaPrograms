package day4_CollectionProgram;

import java.util.ArrayList;
import java.util.Collections;

public class SortListElement {
	public static void main(String[] args) {
		
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(10);
		al.add(-1);
		al.add(5);
		al.add(15);
		System.out.println("before sorting"+ al);
		
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("after sorting"+ al);
	}

}
