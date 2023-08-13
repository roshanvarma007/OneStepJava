package datatype;

public class DataTypeConversion {

	public static void main(String[] args) {
		
		int a = 120;
		long b = a;
		
		double d = b;
		
		System.out.println("int value : " +a);
		System.out.println("long value : " +b);
		System.out.println("double value : " +d);
		
		double s = 99.99 ;
				long l = (long) s;
				byte n = (byte) l;
				
				System.out.println(".............. ");
				
				System.out.println("double value : " +s);	
				System.out.println("long value : " +l);	
				System.out.println("byte value : " +n);	
				
	}

}
