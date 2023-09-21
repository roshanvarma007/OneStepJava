package methodfunction;

import java.util.Scanner;

public class MethodCalling {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int number1,number2,a,b;
		
		System.out.print("Enter 2 number : ");
		
		number1 = input.nextInt();
		number2 = input.nextInt();
		
		show(number1,number2); //calling void method
		
		a = add (number1,number2); //for calling int method
		b = min (number1,number2);  //for calling int method
		
		System.out.println("Sum of 2 number : " + a);
		System.out.println("Min 2 number : " + b);
		

	}
	//Display number
	
	public static void show (int num1, int num2) {
		System.out.println("Entered Two Number : " + num1 + " " + "&" + " " + num2);
	}
	
	//Adding two value
	
	public static int add (int num1,int num2) {
		int sum = 0;
		sum = num1 + num2;
		return sum;
	}
	
	//Find min 
	
	public static int min (int num1,int num2) {
		int min = 0;
		if (num1 > num2) {
			min = num2;
		} else {
			min = num1;
		} return min;
	}
}