package prototypedesignpattern;

public class Employee implements Prototype {
	String empId;
	String empName;
	int empSalary;

	public Employee() {
		System.out.println("Emp ID"+"\t"+"Emp Name"+"\t"+"Emp Salary");
	}
	
	public Employee(String empId,String empName, int empSalary) {
		this();
		this.empId=empId;
		this.empName=empName;
		this.empSalary=empSalary;
	}
	
	public void showDetails() {
		System.out.println(empId+"\t"+empName+"\t\t"+empSalary);
	}

	@Override
	public Prototype getClone() {
		// TODO Auto-generated method stub
		return new Employee(empId, empName, empSalary);
	}
	
	
}
