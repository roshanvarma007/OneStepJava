package operator;

public class ConditaionalOperator {

	public static void main(String[] args) {
		
		int x= 5,y=3,z=9;
		
	boolean result;
	
	//&& And operator
	
	result = (x>y)&& (y<z);
	
	System.out.println("result :" + result);
	
	//|| OR operator
	
	result = (x>y) || (y<z);
	
	System.out.println("result :" + result);
	
	//? OR operator
	
	result = x<y ? true : false ;
	
	System.out.println("result :" + result);
	

	}

}
