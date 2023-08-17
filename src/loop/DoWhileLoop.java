package loop;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		/*int number = 1;
		do {System.out.print(number + " ");
		number ++;
		}while (number<=15);*/

		//Import scanner class
		
		Scanner input = new Scanner (System.in);
		
		int choice;
		do {
			System.out.println("-----MENU-------");
			System.out.println("1. BANANA");
			System.out.println("2. APPLE");
			System.out.println("3. ORRAGNEG");
			System.out.println("4. GAVAVA");
			System.out.println("5. EXIT");
			System.out.print("Select one option");
			
			 choice = input.nextInt();
			 
			 switch (choice) {
			 case 1 :
				 System.out.print("BANANA");
				 break;
				
			 case 2 :
				 System.out.print("APPLE");
				 break;
				 
			 case 3 :
				 System.out.print("ORRANGE");
				 break;
				 
			 case 4 :
				 System.out.print("GAVAVA");
				 break;	
				 
			 }
		} while (choice !=5);
	}

}
