package collectionProgramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ShuffleTheElments {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(10);
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println(list);
	}

}
