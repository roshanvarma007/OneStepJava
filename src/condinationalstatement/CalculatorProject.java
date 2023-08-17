package condinationalstatement;

import java.util.Scanner;

public class CalculatorProject {

	public static void main(String[] args) {
		
		//First improt scanner class
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("-----Calculator-----");
		System.out.println("Enter 2 value : ");
		
		//Than take two value from user
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		System.out.println("Chooes one operator (+,-,*,/,%");
		
		//than take char value from user
		
		char operator = input.next().charAt(0);
		
		double result = 0.0;

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
			result = num1/num2;
			break;
			
		case '%' : 
			result = num1%num2;
			break;
			
			default :
				System.out.println("Invalid Choice Operator");	
		return;
		}
		//Display the result
		System.out.println(num1 + "" + operator +"" + num2 +"=" + result);
		input.close();
	}

}
