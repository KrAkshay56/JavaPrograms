package collectionProgramming;

import java.util.ArrayList;
import java.util.Collections;

public class MaximumElementInList {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(1);
		list.add(5);
		list.add(-1);
		System.out.println(list);
		System.out.println(Collections.max(list));
	}
}
