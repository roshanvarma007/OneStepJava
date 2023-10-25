package exceptionHandlingBankProject;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		BankAccount account = new BankAccount ();
		
		Scanner scan = new Scanner (System.in);
		int choice ;
		
		do {
			System.out.println("...BANK ACCOUNT MENU...");
			System.out.println("...1 - Deposite...");
			System.out.println("...2 - Withdraw...");
			System.out.println("...3 - Show Current Balance...");
			System.out.println("...4 - Quit...");
			System.out.println("...Select An Option...");
			
			choice = scan.nextInt();
			switch (choice){
			case 1 : 
				System.out.println("Deposite Ammount  : ");
				account.Deposite(scan.nextInt());
				break;
				
			case 2 : 
				System.out.println("Current Balance : " + account.getBalance());
				System.out.println("Withdraw Ammount : ");
				try {
					account.Withdraw(scan.nextInt());
				} catch (inSufficientFundException e) {
					
					e.printStackTrace();
				}
				
				break;
				
			case 3 : 
				System.out.println("Current Balance : " + account.getBalance());
				break;
				
			}
		
		} while (choice != 4);
		
		System.out.println("Bye....");

	}

}
