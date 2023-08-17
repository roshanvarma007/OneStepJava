package loop;

import java.util.Scanner;

public class fibonacciSeriesProject {

	public static void main(String[] args) {
		// fibonacci series 0,1,1,2,3,5,8,13,21,35,54,89
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Max Input Number Sequence");
		
		int num = input.nextInt();
		int fibPrevious = 0,fibnacci = 1,sum=0;
		for (int i = 0 ; i<=10 ; i++) {
			System.out.print(fibPrevious + " ");
			sum = fibPrevious + fibnacci;
			fibPrevious = fibnacci ;
			fibnacci = sum;
			
		}
		
		


	}
}
