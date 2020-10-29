package day4_CollectionProgram;

import java.util.HashSet;
import java.util.Set;

public class CopySetToHashSet {
	
	/*
	 * How to copy Set content to another HashSet
	 */
	public static void main(String[] args) {
		
		Set<Integer> set=new HashSet<>();
		set.add(1);
		set.add(12);
		set.add(55);
		set.add(1);
		set.add(12);
		set.add(55);
		
//		for(Integer in:set) {
//			System.out.println(in);
//		}
		
		Set<Integer> set1=new HashSet<Integer>(set);
		for(Integer in:set1) {
			System.out.println(in);
		}
		
		
	}

}
