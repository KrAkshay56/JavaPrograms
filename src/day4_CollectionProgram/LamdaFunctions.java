package day4_CollectionProgram;

import java.util.ArrayList;

public class LamdaFunctions {
	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		
		arr.stream().forEach(ele -> System.out.println(ele));
		
	}

}
