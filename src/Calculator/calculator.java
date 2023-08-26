package Calculator;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Your First Value : ");
		int num1 = input.nextInt();
		
		System.out.println("Enter Second First Value : ");
		int num2 = input.nextInt();
		
		System.out.println("Choose Your Operator : +,-,/,*");
		
		char operator = input.next().charAt(0);
		
		switch (operator){
			case 1 : 
				operator = num1+num2;
				
			System.out.println("Plus" + num1+num2);
			break;
			
			case 2 : 
				System.out.println("Minus" + (num1-num2));
				break;
			
			case 3 : 
				System.out.println("Multiply" + num1*num2);
				break;
				
			case 4 : 
				System.out.println("Divide" + num1/num2);
				break;
				
			default :
				System.out.println("Sorry");
				return;
		
		}

	}

}
