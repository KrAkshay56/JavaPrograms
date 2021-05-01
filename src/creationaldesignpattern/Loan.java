package creationaldesignpattern;

public abstract class Loan {
	double rate;
	abstract void getInterestRate(double rate);
	public void calculateLoanPayment(double loanAmount, int years) {
		double EMI;
		int n=years*12;
		rate=rate/1200;
		EMI=((rate*Math.pow((1+rate),n))/((Math.pow((1+rate),n))-1))*loanAmount;  
		  
		System.out.println("your monthly EMI is "+ EMI +" for the amount"+loanAmount+" you have borrowed");
	}
}
class HomeLoan extends Loan{
	@Override
	void getInterestRate(double rate) {
		super.rate=rate;
	}
}
class EducationalLoan extends Loan{

	@Override
	void getInterestRate(double rate) {
		super.rate=rate;
	}
	
}
