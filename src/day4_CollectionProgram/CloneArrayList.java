package day4_CollectionProgram;

import java.util.ArrayList;

public class CloneArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> first=new ArrayList<Integer>();
		first.add(10);
		first.add(20);
		first.add(30);
		first.add(10);
		System.out.println("First arraylist");
		for(Integer i:first) {
			System.out.println(i);
		}
		
		ArrayList<Integer> second=new ArrayList<Integer>(first);
//		second=(ArrayList<Integer>) first.clone();
		System.out.println("second arraylist");
//		for(Integer i:second) {
//			System.out.println(i);
//		}
		
		for(Integer i:first) {
			second.add(i);
		}
		for(Integer i:second) {
			System.out.println(i);
		}
		
		second.addAll(first);
		
		
	}

}
