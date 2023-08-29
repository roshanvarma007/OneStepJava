package project;

import java.util.Random;

public class mehndiProjec {

	public static void main(String[] args) {
		
		String mehndi [] = {"Manu ki mhendi" , "Manu Art"};

		Random random = new Random();
		
		String call = mehndi[random.nextInt(0,2)];
System.out.println("Your Channel Name: "+call);
	}

}
