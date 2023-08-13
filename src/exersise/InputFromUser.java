package exersise;

import java.util.Scanner;

public class InputFromUser {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Entre Your Text");
		
//		int Number = input.nextInt();
//		System.out.println("Your Number : " + Number);
		
		String text = input.next();
		System.out.println("Your text: " + text);
		
		input.close();
	}

}
