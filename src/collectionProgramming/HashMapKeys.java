package collectionProgramming;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapKeys {
	public static void main(String[] args) {
		ConvertINTtoString(54321);
	}
	public static void ConvertINTtoString(int num) {
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
		ArrayList<String> list=new ArrayList<String>();
		while(num>0) {
			int rem=num%10;
			list.add(map.get(rem));
			num=num/10;
		}
	   for(int i=list.size()-1;i>=0;i--) {
		   System.out.print(list.get(i)+" ");
		   
	   }
	}

}
