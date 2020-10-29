package day4_CollectionProgram;

import java.util.ArrayList;
import java.util.Collections;

public class LapTopList {
	public static void main(String[] args) {
		
	
	ArrayList<Laptop> al=new ArrayList<Laptop>();
	al.add(new Laptop(30000, 4, 512, "Avita"));
	al.add(new Laptop(55000, 8, 1024, "Lenovo"));
	al.add(new Laptop(100000, 8, 512, "Apple Mac"));
	al.add(new Laptop(70000, 16, 1024, "MSI"));
	
	System.out.println("Before sorting");
	for(int i=0;i<al.size();i++) {
		Laptop laptop = al.get(i);
		System.out.println(laptop.name+"|"+laptop.price+"|"+laptop.ram+"|"+laptop.hardDisk);
	}
	
	Collections.sort(al, new NameComparator());
	
	System.out.println("After sorting");
	for(int i=0;i<al.size();i++) {
		Laptop laptop = al.get(i);
		System.out.println(laptop.name+"|"+laptop.price+"|"+laptop.ram+"|"+laptop.hardDisk);
	}
}
}
