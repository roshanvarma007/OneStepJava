package array;

import java.util.Random;

public class headTeal {

	public static void main(String[] args) {
		
		
		
		Random random = new Random();
		
//		
//		
//		int toss = random.nextInt(0,2);
//		if (toss == 0) {
//			System.out.println("Head");
//		}else {
//			System.out.println("Tell");
//		}
//		
		
		String toss [] = {"Head" , "Tell"};
		
		String tos = toss[random.nextInt(0,2)] ;
		System.out.println(tos);
		
	}
}
