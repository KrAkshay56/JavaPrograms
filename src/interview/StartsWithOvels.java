package interview;

import java.util.ArrayList;

public class StartsWithOvels {
public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<String>();
	list.add("amazon");
	list.add("flipkart");
	list.add("myntra");
	
	for(int i=0;i<list.size();i++) {
		String word=list.get(i);
		if(word.charAt(0)=='a' || word.charAt(0)=='e'|| word.charAt(0)=='i' || word.charAt(0)=='o' ||word.charAt(0)=='u') {
			System.out.println(word);
		}
	}
}
}
