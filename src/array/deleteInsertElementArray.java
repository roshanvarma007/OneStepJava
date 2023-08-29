package array;

import java.util.Scanner;

public class deleteInsertElementArray {

	public static void main(String[] args) {
		int x,y,z;
		
		Scanner input = new Scanner (System.in);
	System.out.println("Enter the size of element of array");
	
		x  = input.nextInt();
		int a[] = new int [x];
		int b[] = new int [x-1];

		System.out.println("Enter the element of array");
		for (int i = 0 ; i<x ; i++) {
			a[i] = input.nextInt();
		}
		System.out.println("Enter the position of delte element in array");
		
		y = input.nextInt();
		
		for (int i = 0 ; i<x ; i++) {
			if (i <y) {
				b[i] = a[i];
			} else if (i ==y) {
				continue;
			} else {
				b[i] =a[i];
			}
		}
		
		System.out.println("Elements are : ");
		for (int i = 0 ; i<x-1 ; i++) {
			System.out.println(b[i]);
		}
	}

}
