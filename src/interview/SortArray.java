package interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortArray  {
	public static void main(String[] args) {
		String[] arr= {"Flipkart","Amazon","Snapdeal","Alibaba"};
		List<String> list = Arrays.asList(arr);
		Collections.sort(list);
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	

}
