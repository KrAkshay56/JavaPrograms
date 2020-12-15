package collectionProgramming;

import java.util.TreeMap;

public class DescendingTreeMap {
	public static void main(String[] args) {
		TreeMap<Integer, String> map=new TreeMap<Integer, String>();
		map.put(10, "Ten");
		map.put(1, "One");
		map.put(5, "Five");
		map.put(3, "Three");
		map.put(4, "Four");
		map.put(2, "Two");
		System.out.println(map);
		System.out.println(map.descendingMap());
	}

}
