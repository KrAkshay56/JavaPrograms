package builderdesginpattern;

public class PreFabricatedHouseBuilder implements HouseBuilder{

	private House house;
	public PreFabricatedHouseBuilder() {
		this.house=new House();
	}
	
	@Override
	public void buildFoundation() {
		house.setFoundation("Wood, laminate, and PVC flooring");
		System.out.println("PrefabricatedHouseBuilder: Foundation complete...");
	}

	@Override
	public void buildStructure() {
		house.setStructure("Structural steels and wooden wall panels");
		System.out.println("PrefabricatedHouseBuilder: Structure complete...");
	}

	@Override
	public void buildRoof() {
		house.setRoof("Roofing sheets");
		System.out.println("PrefabricatedHouseBuilder: Roof complete...");
		
	}

	@Override
	public void paintHouse() {
		house.setPainted(true);
		System.out.println("PrefabricatedHouseBuilder: Paint complete...");
		
	}

	@Override
	public void furnishHouse() {
		house.setFurnished(true);
		System.out.println("PrefabricatedHouseBuilder: Furnished complete...");
		
	}

	@Override
	public House getHouse() {
		return this.house;
	}

}
