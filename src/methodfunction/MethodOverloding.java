package methodfunction;

public class MethodOverloding {

	public static void main(String[] args) {
		
		System.out.println("Sum of two int value : "+add(10,20));
		System.out.println("Sum of three int value : "+add(10,20,30));
		System.out.println("Sum of two double value : "+add(10.3,5.4));
		

	}

	public static int add (int x,int y) {
		return x+y;
	}
	
	public static int add (int x,int y,int z) {
		return x+y+z; 
		}
	
	public static double add (double x,double y) {
		return x+y; 
		}
}
