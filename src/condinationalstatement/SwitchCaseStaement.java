package condinationalstatement;

import java.util.Scanner;

public class SwitchCaseStaement {

	public static void main(String[] args) {
		
		System.out.println("Please enter a day of week");
		
Scanner number = new Scanner (System.in);
int dayNumber = number.nextInt();
String day;

switch (dayNumber){
	case 1:
	day = "Monday";
	break;
	 
	case 2 :
		day = "Tuesday";
		break;
		
	case 3 :
		day = "Wensday";
		break;
		
	case 4 :
		day = "Thrusday";
		break;
	
	case 5 :
		day = "Friday";
		break;
		
	case 6 :
		day = "Saterday";
		break;
		
	case 7 :
		day = "Sunday";
		break;
		
	default : 
		day = "SORRY Invalid";
		break;
	
}
System.out.println("Day : " + day);
number.close();
	}

}
