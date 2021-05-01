package creationaldesignpattern;

public class FactoryCreator {

	public static AbstractFactory getFactory(String choice) {
		if(choice.equals("bank")) {
			return new BankFactory();
		}
		else if(choice.equalsIgnoreCase("loan")) {
			return new LoanFactory();
		}
		return null;
	}
}
