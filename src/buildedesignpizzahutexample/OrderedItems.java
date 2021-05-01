package buildedesignpizzahutexample;

import java.util.ArrayList;

public class OrderedItems {
	
	ArrayList<Items> itemList=new ArrayList<Items>();
	
	public void addItems(Items items) {
		itemList.add(items);
	}
	
	public float getCost() {
		float cost=0.0f;
		for(Items item:itemList) {
			cost+=item.price();
		}
		return cost;
	}
	public void showItems() {
		for(Items item:itemList) {
			System.out.println("Item is: "+item.name());
			System.out.println("Item size: "+item.size());
			System.out.println("Item price: "+item.price());
		}
	}

}
