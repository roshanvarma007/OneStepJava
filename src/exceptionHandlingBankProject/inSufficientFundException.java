package exceptionHandlingBankProject;

public class inSufficientFundException extends Exception {

	private String message;
	
	//Constructor 
	
	public  inSufficientFundException (String message) {
		
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
