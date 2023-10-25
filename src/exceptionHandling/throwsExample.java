package exceptionHandling;

public class throwsExample {

	public static void divide ()
	            throws ArithmeticException , NumberFormatException 
	            
	            {
		int a = Integer.parseInt("8");
		int b = Integer.parseInt("0");
		int c = a/b;
		System.out.println("Result : "+ c);
	            }
	
	public static void main(String[] args) {

try {
divide();
	}
catch (NumberFormatException e) {
	System.out.println("Please enter invalid number");
} catch (ArithmeticException e) {
	System.out.println("Can't divide by zero");
}
}
}
