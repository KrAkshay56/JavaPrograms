package day4_CollectionProgram;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class ReverseTreeSet {
	
	public static void main(String[] args) {
		
		TreeSet<Character> set=new TreeSet<Character>();
		
		set.add('z');
		set.add('a');
		set.add('b');
		set.add('m');
		set.add('c');
		
//		for(Character ch:set) {
//			System.out.println(ch);
//		}
		
		NavigableSet<Character> na = set.descendingSet();
		Iterator<Character> itr = na.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
