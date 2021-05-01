package creationaldesignpattern;

public interface Bank {
	
	String getBankName();

}
class HDFCBank implements Bank{
String bankName;
	public HDFCBank() {
		bankName="HDFC Bank";
	}
	@Override
	public String getBankName() {
		return bankName;
	}	
}
class ICICI implements Bank{
	String bankName;
	public ICICI() {
		bankName="ICICI Bank";
	}
	@Override
	public String getBankName() {	
		return bankName;
	}
}
class SBI implements Bank{
	String bankName;
	public SBI() {
		bankName = "SBI";
	}
	@Override
	public String getBankName() {
		return bankName;
	}
	
}
