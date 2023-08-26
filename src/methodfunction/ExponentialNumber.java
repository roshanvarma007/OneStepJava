package methodfunction;

import java.util.Scanner;

public class ExponentialNumber {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter Your Base number");
		
		int base , powers;
		base = input.nextInt();
		
		System.out.println("Enter Your Power number");

		powers = input.nextInt();
		
		for (int i = 0 ; i<=powers ; i++) {
			System.out.println(base + " to the power " + i + " " + "is :" + pow(base,i));
		}
		input.close();
		

	}
public static int pow(int num , int power) {
	return (int) Math.pow(num, power);
}
}
