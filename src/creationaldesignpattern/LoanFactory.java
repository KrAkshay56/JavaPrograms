package creationaldesignpattern;

public class LoanFactory extends AbstractFactory{

	@Override
	Bank getBank(String bank) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Loan getLoan(String loan) {
		if(loan.equalsIgnoreCase("Home")) {
			return new HomeLoan();
		}
		else if(loan.equalsIgnoreCase("education")) {
		return new EducationalLoan();
		}
		return null;
	}

}
