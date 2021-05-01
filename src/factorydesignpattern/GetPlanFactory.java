package factorydesignpattern;

import java.util.Scanner;

public class GetPlanFactory {

	public Plan getPlan(String planType) {
		if(planType.equalsIgnoreCase("Domestic")) {
			return new DomesticPlan();
		}
		else if(planType.equalsIgnoreCase("Commercial")) {
			return new CommercialPlan();
		}
		else if(planType.equalsIgnoreCase("Institutional")) {
			return new InstitutionalPlan();
		}
		return null;
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the plan type");
		String planType=scan.next();
		Plan plan=new GetPlanFactory().getPlan(planType);
		plan.getRate();
		plan.calculateBill(10);
		scan.close();
	}
}
