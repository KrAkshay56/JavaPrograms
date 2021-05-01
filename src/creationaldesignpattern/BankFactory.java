package creationaldesignpattern;

public class BankFactory extends AbstractFactory{

	@Override
	Bank getBank(String bank) {
		if(bank.equalsIgnoreCase("HDFC")) {
			return new HDFCBank();
		}
		else if(bank.equalsIgnoreCase("ICICI")) {
			return new ICICI();
		}
		else if(bank.equalsIgnoreCase("SBI")) {
		return new SBI();
		}
		return null;
	}

	@Override
	Loan getLoan(String loan) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}
