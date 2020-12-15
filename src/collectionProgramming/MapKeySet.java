package collectionProgramming;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapKeySet {
	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");
		map.put(5, "Five");
		map.put(6, "Six");
		map.put(7, "Seven");
		map.put(8, "Eight");
		map.put(9, "Nine");
		map.put(0, "Zero");
		System.out.println(map);
		Set<Integer> set = map.keySet();
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+", ");
		}
		
	}

}
