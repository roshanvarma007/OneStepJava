package exceptionHandling;

public class throwbaleMethod {
	
	public static double divide (double x , double y) {
		if (y == 0 ) {
		 throw new ArithmeticException("Divider can't be 0!");
		} return x/y ;
	}


	public static void main(String[] args) {
		
		double d;
		try {
			d = divide (7.7,0);
		} catch (ArithmeticException e) {
		System.out.println("Can't divide by zero");
		
		//Useful method
		System.out.println  (e.getMessage());
		e.printStackTrace();
		
		}

	}

}
