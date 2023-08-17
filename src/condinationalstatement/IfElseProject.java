package condinationalstatement;

import java.util.Scanner;

public class IfElseProject {

	public static void main(String[] args) {
		
		Scanner topper = new Scanner (System.in);
		
		int Rahul,Shikher,Rohit,Virat;
		
		System.out.println("Enter Player Score");
		
		System.out.println("Rahul : ");
		Rahul = topper.nextInt();
		 
		 System.out.println("Shikher : ");
		 Shikher = topper.nextInt();
		 
		 System.out.println("Rohit : ");
		 	Rohit  = topper.nextInt();
		 	
		 	System.out.println("Virat : ");
		 Virat = topper.nextInt();
		 
		

		
		if (Rohit + Virat > Shikher +Rahul) {
			System.out.println("RCB & MUMBAI WON");
		}else { if (Rohit + Virat < Shikher +Rahul)
		{
		
		}else {
			System.out.println("We Lost");
		}
		}
	}

}
