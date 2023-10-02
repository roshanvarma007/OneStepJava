package pacakgeTest;


//in build package
import java.util.Scanner;


//User define pakage
import pacakgeOperation. *;

public class multiplyTest {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner (System.in);
		System.out.println("Rnter two value : ");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		multipy obj = new multipy ();
		
		Add obj1 = new Add();
		Subtract obj2 = new Subtract();
		Divide obj3 = new Divide();
		
		
		System.out.println("You Entered : " + num1 + " ," + num2 );
		System.out.println("Result of multiply: " + obj.multiply(num1, num2));
		System.out.println("Result of addition : " + obj1.add(num1, num2));
		System.out.println("Result of subtraction : " + obj2.subtract(num1, num2));
		System.out.println("Result of divide : " + obj3.divide(num1, num2));

	}

}
