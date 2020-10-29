package day4_CollectionProgram;

public class Laptop implements Comparable<Laptop>{
	
	int price;
	int ram;
	int hardDisk;
	String name;
	public Laptop(int price, int ram, int hardDisk, String name) {
		super();
		this.price = price;
		this.ram = ram;
		this.hardDisk = hardDisk;
		this.name = name;
	}
	@Override
	public int compareTo(Laptop o) {
		if(this.price==o.price) {
			return 0;
		}else if(this.price>o.price) {
			return 1;
		}
		return -1;
	}
	
	
	
	

}
