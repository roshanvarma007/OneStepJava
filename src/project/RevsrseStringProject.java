package project;

import java.util.Scanner;

public class RevsrseStringProject {

	public static void main(String[] args) {
	
		Scanner input = new Scanner (System.in);
System.out.println("Enter string value");
	String string = input.nextLine();
	int length = string.length();
	
	String reversedString = "";
	for(int i = length-1 ; i>=0 ; i--) {
		reversedString = reversedString + string.charAt(i);
	}

	System.out.println("reversedString value : "  + reversedString);
	input.close();
	}

}
