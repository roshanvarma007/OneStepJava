package exersise;

import java.util.Scanner;

public class InputUserCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
	
		System.out.println("Welcome On Genral Calculator");
		
	//First You have to take two values
		
		System.out.println("Enter Your First Value");
		double num1 = scan.nextDouble();
		
		
		System.out.println("Enter Your Second Value");
		double num2 = scan.nextDouble();

	//Now you must take *char* data type for your operator
		
		System.out.println("Enter An Operator (+,-,*,/): ");
		char operator = scan.next().charAt(0);
	
		double result;
	
	//Now you have to apply switch case 
		
		switch (operator) {
		
		case '+' :
			result = num1+num2;
			break;
			
		case '-' :
			result = num1-num2;
			break;
			
		case '*' : 
			result = num1*num2;
			break;
			
		case '/' :
			if (num2 !=0) {
				result = num1/num2;
			}else {System.out.println("Can not divide by Zero");
			
			scan.close();
			return;
			}
			
			break;
			default:
				System.out.println("Invalid Operator");
				scan.close();
				return;
		
				
		}

		System.out.println("Result : " + result);
		scan.close();

		System.out.println("Thank You For Using MY Calculator");
	}
	

}
