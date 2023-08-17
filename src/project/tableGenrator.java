package project;

import java.util.Scanner;

public class tableGenrator {

	public static void main(String[] args) {
		System.out.println("Enter You Value");
	
Scanner input =new Scanner (System.in);
int userInput = input.nextInt();

System.out.println("Your Table");
tableGenrator(userInput);

	}
public static void tableGenrator (int userInput) {
	int k;
	for ( k = 1 ; k <= 10 ; k++) {
		System.out.println(k*userInput);
	}
}
}
