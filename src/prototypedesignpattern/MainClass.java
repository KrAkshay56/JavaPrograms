package prototypedesignpattern;

public class MainClass {
	public static void main(String[] args) {
		
		Employee emp=new Employee("TYC0204", "Nithesh", 5000);
		emp.showDetails();
		System.out.println("==============================");
		Employee emp1 = (Employee)emp.getClone();
		emp1.showDetails();
	}

}
