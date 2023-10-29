package exceptionHandlingBankProject;

public class BankAccount {

	private double balance;
	
	//Consturctor 
	
	public BankAccount () {
		balance = 0.0;
		}
	
	//Deposite method
	
	public void Deposite(double ammount) {
		balance =  balance + ammount ;
		
		}
	
	//Withdraw method
	
	public void Withdraw (double ammount) throws inSufficientFundException {
		
		if (ammount > balance) {
			throw new inSufficientFundException("inSufficient Balance... Withdraw could'nt be completed");
		}
		balance = balance - ammount;
	}
	
	//getter method of balance

	public double getBalance() {
		return balance;
	}
	
}
