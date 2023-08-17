package loop;

public class ForEachLoop {

	public static void main(String[] args) {
		
		char [] letters = {'R','A','D','H','E','S','H','Y','A','M'};
		for (char item : letters) {
			System.out.println(item);
		}

		System.out.println("----------------------");
		int [] number= {6,5,8,4};
		int sum=0;
		for (int num : number) {
			sum +=num;
			
			System.out.println(num);
		} System.out.print("Sum of numbers : "+sum);
	}

}
