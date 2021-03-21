package builderdesginpattern;

public class ConstructionEngineerTest {
	
	public static void main(String[] args) {
		
		HouseBuilder concreteHouseBuilder=new ConcreteHouseBuilder();
		ConstructionEngineer engineerA = new ConstructionEngineer(concreteHouseBuilder);
		House houseA = engineerA.constructHouse();
		System.out.println("House is: "+houseA);
	}

}
