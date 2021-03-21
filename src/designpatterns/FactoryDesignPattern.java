package designpatterns;
/**
 * Factory Design Pattern
 * @author Nitheesha
 *
 */
abstract class Vehicle{
	
	public abstract int getWheel();
	
	public String toString() {
		return "Wheel: "+ this.getWheel();
		
	}
}

class Car extends Vehicle{
	int wheel;
	
	public Car(int wheel) {
		this.wheel=wheel; 
	}

	@Override
	public int getWheel() {
		return this.wheel;
	}
}

class Bike extends Vehicle{
	int wheel;
	
	public Bike(int wheel) {
		this.wheel=wheel;
	}

	@Override
	public int getWheel() {
		return this.wheel;
	}
}

class VehicalFactory{
	
	public static Vehicle getInstance(String type,int wheel) {
		if(type.equals("car")) {
			return new Car(wheel);
		}
		else if(type.equals("bike")) {
			return new Bike(wheel);
		}
		return null;
	}
}


public class FactoryDesignPattern {
	
	public static void main(String[] args) {
		Vehicle car = VehicalFactory.getInstance("car", 4);
		System.out.println(car);
		Vehicle bike = VehicalFactory.getInstance("bike", 2);
		System.out.println(bike);
	}

}


