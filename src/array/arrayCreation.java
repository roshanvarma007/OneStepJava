package array;

import java.util.Scanner;

public class arrayCreation {

	public static void main(String[] args) {
		
		int n;
		
		try (Scanner input = new Scanner (System.in)) {
			System.out.println("Enter the no of element of array");
			
			n = input.nextInt();   //Taking value from user , varibale name "n"
			int a[] = new int[n];
			System.out.println("Enter Value");
			
			//Sari value user ke through input karayenge
			
			for (int i=0; i<n; i++) {
				a[i] = input.nextInt();
			}
			System.out.println("Elements are : " );
			
			
			for (int i=0; i<n; i++) {
				System.out.println(a[i] );
			}
		}
		
	}

}
