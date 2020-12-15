package collectionProgramming;

import java.util.HashMap;

public class Searchkey {
	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "Iphone");
		map.put(2, "Xiomi");
		map.put(3, "Real me");
		map.put(4, "Asus Rog");
		map.put(5, "Nokia");
		System.out.println(map);
		System.out.println(searchKey(map, 1));
		
	}
	
	public static boolean searchKey(HashMap map,Object key) {
		if(map.containsKey(key)) {
			return true;
		}else
		{
			return false;
		}
	}

}
