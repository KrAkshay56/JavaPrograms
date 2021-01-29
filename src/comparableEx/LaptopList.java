package comparableEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class LaptopList {
	public static void main(String[] args) {
		ArrayList<LapTop> lap=new ArrayList<LapTop>();
		lap.add(new LapTop(80000, "Lenovo yoga", "profesional"));
		lap.add(new LapTop(50000, "ROG", "business"));
		lap.add(new LapTop(100000, "MSI", "gaming"));
		
		Iterator<LapTop> itr = lap.iterator();
		while(itr.hasNext()) {
			LapTop ref = itr.next();
			System.out.println(ref.price+"|"+ref.name+"|"+ref.type);
		}
		
		Collections.sort(lap);
		
		for(int i=0;i<lap.size();i++) {
			LapTop lapTop = lap.get(i);
			System.out.println(lapTop.price+"|"+lapTop.name+"|"+lapTop.type);
		}
	}

}
