package condinationalstatement;

import java.util.Scanner;

public class IfElseStatement {

	public static void main(String[] args) {
		
		Scanner inputNumber = new Scanner (System.in);
				System.out.println("Enter your number");
				
				int number = inputNumber.nextInt();
				if (number %2==0) {
					System.out.println("NUmber is even");
				} else {
					System.out.println("Oh ho Your number is odd");
				}
inputNumber.close();
	}

}
