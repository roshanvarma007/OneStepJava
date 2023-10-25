package exceptionHandling;

public class Throw {
	
	public static double divide (double x , double y) {
		if (y == 0 ) {
		 throw new ArithmeticException("Divider can't be 0!");
		} return x/y ;
	}

	public static void main(String[] args) {
		
		double d;
		try {
			d = divide (9.1 , 0);
			System.out.println("Result : " + d);
		} catch (ArithmeticException e) {
			System.out.print("Divider can't divide by zero");
		}
		

	}

}
