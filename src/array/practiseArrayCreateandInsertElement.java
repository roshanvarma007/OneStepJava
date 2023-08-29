package array;

import java.util.Scanner;

public class practiseArrayCreateandInsertElement {

	public static void main(String[] args) {
//		int x,y,z;
//		
//			Scanner input = new Scanner (System.in);
//			System.out.println("Enter the size of element of array");
//		
//			x  = input.nextInt();
//			int a[] = new int [x];
//			
//			System.out.println("Enter elements in Array");
//			
//			for (int i =0; i<x ; i++) {
//				a [i] = input.nextInt();
//			}
//			
//			System.out.println("Elements are : ");
//          for (int i = 0; i <x ; i++) {
//        	  System.out.println(a[i]);
//          }
		
		int x,y,z;
		
			Scanner input = new Scanner (System.in);
		System.out.println("Enter the size of element of array");
		
			x  = input.nextInt();
			int a[] = new int [x];
			int b[] = new int [x+1];
			System.out.println("Enter Value");
			for (int i=0; i<x ; i++) {
				a [i] = input.nextInt();
			}
			System.out.println("Enter number of position you want to insert in array");
			
			y = input.nextInt();
			
			System.out.println("Enter the value you want insert in array");
			
			z = input.nextInt();
			
			for (int i = 0 ; i<x ; i++) {
				if (i<y) {
					b[i] = a[i];
				} else if (i==y) {
					b[i] = z;
				} else {b[i] = a[i];
				}
			}
		System.out.println("Elements are : ");	
		
		for (int i = 0 ; i<x ; i++) {
			System.out.println(b[i]);
		}
	}

}
