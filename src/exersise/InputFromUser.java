package exersise;

import java.util.Scanner;

public class InputFromUser {

	public static void main(String[] args) {
		
		//First you must import the scanner class
		
		Scanner input = new Scanner(System.in);
		System.out.println("Entre Your Text");
		
		//Now next step what you want to import you write int value or string
		
//		int Number = input.nextInt();
//		System.out.println("Your Number : " + Number);
		
		String text = input.next();
		System.out.println("Your text: " + text);
		
		//In last you have to close your object
		
		input.close();
	}

}
