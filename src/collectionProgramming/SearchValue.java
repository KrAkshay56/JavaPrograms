package collectionProgramming;

import java.util.HashMap;

public class SearchValue {
	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "Iphone");
		map.put(2, "Xiomi");
		map.put(3, "Real me");
		map.put(4, "Asus Rog");
		map.put(5, "Nokia");
		System.out.println(map);
		System.out.println(searchValue(map, "Nokia"));
	}
	
	public static boolean searchValue(HashMap map,Object value) {
		if(map.containsValue(value)) {
			return true;
		}
		else
		{
			return false;
		}
	}

}
