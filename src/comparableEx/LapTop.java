package comparableEx;

public class LapTop implements Comparable<LapTop>{
	int price;
	String name;
	String type;
	public LapTop(int price, String name, String type) {
		this.price=price;
		this.name=name;
		this.type=type;
	}

	@Override
	public int compareTo(LapTop lap) {
		return this.type.compareTo(lap.type);
	}

}
