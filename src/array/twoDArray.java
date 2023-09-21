package array;

import java.util.Scanner;

public class twoDArray {

	public static void main(String[] args) {
		
Scanner scan = new Scanner (System.in);
int n,m,p;
System.out.println("Enter Number Of Rows");
n = scan.nextInt();

System.out.println("Enter Number Of Colom");
m = scan.nextInt();
int a[][] = new int[n][m];

System.out.println("Enter Value");

for (int i=0; i<n ; i++) {
	
	for (int j=0 ; j<m ; i++) {
		a[i][j] = scan.nextInt(); //taking two input from user
	}
}

for (int i=0; i<n ; i++) {
	
	for (int j=0 ; j<m ; i++) {
		System.out.println(a[i][j]); 
	}
}
	}

}
