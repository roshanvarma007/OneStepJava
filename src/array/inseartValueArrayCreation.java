package array;

import java.util.Scanner;

public class inseartValueArrayCreation {

	public static void main(String[] args) {
		
int n , m , p;
		
Scanner input = new Scanner (System.in) ;
			System.out.println("Enter the no of element of array");
			
			n = input.nextInt();   //Taking value from user , varibale name "n"
			int a[] = new int[n];
			int b[] = new int[n+1];  //Making new array
			
			System.out.println("Enter Value");
			
			//Sari value user ke through input karayenge
			
			for (int i=0; i<n; i++) {
				a[i] = input.nextInt();
			}
			System.out.println("Enter indexnof new value to be inserted " );
			
			m = input.nextInt();
			
                 System.out.println("Enter value to be inserted " );
			
			p = input.nextInt();
			
			for (int i=0; i<n+1; i++) {
				if (i<m) {
					b[i] = a[i];
				}	else if (i==m) {
				b[i] = p;
			} else {
				b[i] = a[i];
			}
				
				
				 
			}  System.out.print("Elements are :");
			
			for (int i = 0; i<n+1; i++) {
				 System.out.print(b[i]);
			 }
			 
		}
	}
