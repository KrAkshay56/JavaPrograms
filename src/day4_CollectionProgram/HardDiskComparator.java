package day4_CollectionProgram;

import java.util.Comparator;

public class HardDiskComparator implements Comparator<Laptop>{

	@Override
	public int compare(Laptop o1, Laptop o2) {
		if(o1.hardDisk==o2.hardDisk) {
			return 0;
		}else if(o1.hardDisk>o2.hardDisk) {
			return 1;
		}else {
			return -1;
		}
	}

}
