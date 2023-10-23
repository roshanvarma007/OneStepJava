package stringEx;

import java.util.Scanner;

public class stringExersise {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
System.out.println("Enter Your School Name");

String school = scan.nextLine();

System.out.println("Your school name in lower case: "+school.toLowerCase());
System.out.println(school.valueOf(2));
	}

}
