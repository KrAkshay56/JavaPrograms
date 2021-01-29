package comparableEx;

public class Employee {
	String id;
	String name;
	Address add;
	public Employee(String id, String name, Address add) {
		this.id = id;
		this.name = name;
		this.add = add;
	}
	@Override
	public String toString() {
		return "|"+id+"|"+name+"|"+add.area+"|"+add.city+"|"+add.district+"|"+add.pin+"|";
	}
	public static void main(String[] args) {
		Address addr = new Address("Alur", "Alur", "Hassan", 543213);
		Employee emp = new Employee("TY_001", "Nithesh", addr);
		System.out.println(emp);
		Address addr1 = new Address("Alur", "Hassan", "Hassan", 543201);
		Employee emp1 = new Employee("TY_002", "Alex", addr1);
		System.out.println(emp1);
	}

}
