package tableGenrator;

import java.util.Scanner;

public class tableGenrator {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter You Value");
		
int	number = input.nextInt();
System.out.println("Your Table is : ");
tableGenrator(number);

	}
	
	public static void tableGenrator (int number) {
		for (int i = 1 ; i<=10 ; i++) {
			System.out.println( i*number);
		}
	}

}
