package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
	
		int num1 = 0, num2 = 0 , result = 0 ;
	
		boolean isFlage = false;
		do {
			try {
			
			Scanner scan = new Scanner (System.in);
			
			System.out.println("Enter Your first number");
			
			num1 = scan.nextInt();
			
			System.out.println("Enter Your second number");
			num2 = scan.nextInt();
			result = num1/num2;
			System.out.println("Result : " + result);
			isFlage = true;
			scan.close();
			}
			
			catch(InputMismatchException e) {
				System.out.println("Please enter right value");
			}
			
			catch (java.lang.ArithmeticException e) {
				System.out.println("Second number can't divide by zero");
			}
			
			catch (Exception e) {
				System.out.println("An exception occured. ");
			}
			 finally {
				 System.out.println("This statement is already excuted");
			 }
		} 
		while (! isFlage);
		
		
		}
	}


