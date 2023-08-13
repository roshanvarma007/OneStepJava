package array;

public class Array {

	public static void main(String[] args) {
		
		//first declear array
		
		int [] numbers;
		//Now declear how many numbers you wants to store
		
		numbers = new int[5];
		
		//Now assign value in array
		
		numbers[0] = -6;
		numbers[1] = 7;
		numbers[2] = 8;
		numbers[3] = 9;
		numbers[4] = 0;
		
		
		//Now cal sum of array values
		
		int sum = numbers[0] + numbers[1] + numbers[2] + numbers[1] +numbers[3] + numbers[4] ;
		
		System.out.println("Sum : " +sum);
		
		int number [] = {-6,7,8,9,0};
		number [4] = 6;
		
		System.out.println("--------------");
		System.out.println("New Sum : " + number[0]+number[1]+number[2]+number[3]+number[4]);
	}

}
