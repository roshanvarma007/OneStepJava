package project;

import java.util.Scanner;

public class stockAverageCalculator {

	public static void main(String[] args) {
	Scanner inputVal = new Scanner (System.in);
	
	System.out.println("------Hey You Are Buying MS Stock------");
	
	System.out.println("------Enter How Much Stock You Want------");
	
	double unit1 = inputVal.nextDouble();
	
	System.out.println("------Enter What is The Pricng Of Stock------");
	
	double price1 = inputVal.nextDouble();
	
	System.out.println("------Buy More------");
	
System.out.println("------Enter How Much Stock You Want------");
	
	double unit2 = inputVal.nextDouble();
	
	System.out.println("------Enter What is The Pricng Of Stock------");
	
	double price2 = inputVal.nextDouble();
	
	
	double invesment = (unit1*price1 + unit2*price2);
	double totalUnit = unit1+unit2;
	
	double average = invesment/totalUnit;
			
			System.out.println("-----Invesment-------" + invesment);	
	System.out.println("-----totalUnit-------" + totalUnit);
	System.out.println("-----average-------" + average);
	
	
	
	}

}
