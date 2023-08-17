package project;

import java.util.Scanner;

public class ProjectWithMT {
    public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter one to ten value in String");
		String Userinput ;
		Userinput = input.nextLine().toUpperCase();
	switch (Userinput) {
	case "ONE" :
		System.out.println("Your String Number :" +1);
		break;
		
	case "TWO" :
		System.out.println("Your String Number :" +2);
		break;
		
	case "THREE" :
		System.out.println("Your String Number :" +3);
		break;
		
	case "FOUR" :
		System.out.println("Your String Number :" +4);
		break;
		
	case "FIVE" :
		System.out.println("Your String Number :" +5);
		break;
		
	case "SIX" :
		System.out.println("Your String Number :" +6);
		break;
		
	case "SEVEN" :
		System.out.println("Your String Number :" +7);
		break;
		
	case "EIGHT" :
		System.out.println("Your String Number :" +8);
		break;
		
	case "NINE" :
		System.out.println("Your String Number :" +9);
		break;
		
	case "TEN" :
		System.out.println("Your String Number :" +10);
		break;
		
		default :
			System.out.println("SORRY");
			break;
	}

	
	input.close();
	}

}
