package builderdesginpattern;

public interface HouseBuilder {

	public void buildFoundation();
	
	public void buildStructure();
	
	public void buildRoof();
	
	public void paintHouse();
	
	public void furnishHouse();
	
	public House getHouse();
}
