package day4_CollectionProgram;

import java.util.HashSet;

public class RetainTheElements {
	/*
	 *  How to compare two sets and retain elements which are same on both sets? 
	 */
	
	public static void main(String[] args) {
		
		HashSet<Character> set1=new HashSet<Character>();
		set1.add('1');
		set1.add('Z');
		set1.add('@');
		set1.add('?');
		
		HashSet<Character> set2=new HashSet<Character>();
		set2.add('1');
		set2.add('Z');
		set2.add('@');
		set2.add('?');
		set2.add('A');
		
		System.out.println(set2.hashCode()==set1.hashCode());
		set2.retainAll(set1);
		
		for(Character ch:set2) {
			System.out.println(ch);
		}
	}

}
