package collectionProgramming;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveduplicatesInArrayList {
	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("Apple");
		list.add("Banana");
		list.add("Mango");
		list.add("Apple");
		list.add("Mango");
		System.out.println(list);
		
		LinkedHashSet<String> lset=new LinkedHashSet<String>();
		lset.addAll(list);
		System.out.println(lset);
	}

}
