package condinationalstatement;

import java.util.Scanner;

public class IfElseNested {

	public static void main(String[] args) {
		
		Scanner number = new Scanner ( System.in);
		System.out.println("Enetr three number : ");
		
		int num1,num2,num3,largestnum;
		num1 = number.nextInt();
		num2 = number.nextInt();
		num3 = number.nextInt();
		
		
		if (num1>= num2) {
			if (num1>=num3) {
				largestnum = num1;
			} else {largestnum = num3;}
		}
		else {
			if (num2>= num3) {
				largestnum = num2;
			} else {
				largestnum = num3;
			}
		} System.out.println("Largest number : " + largestnum);
		
		number.close();
		

		//Below is age checker
		
		
//		Scanner enterAge = new Scanner (System.in);
//		
//		System.out.println("Enter your age");
//		
//		int yourAge = enterAge.nextInt();
//		
//		if (yourAge>12 && yourAge < 18) {
//			System.out.println("You are child");
//			
//			 		
//			
//		} else if (yourAge >18 && yourAge<65) 
//		{System.out.println("You are Teen age");}
//		
//		else {System.out.println("You are Senior");}

	}

}
