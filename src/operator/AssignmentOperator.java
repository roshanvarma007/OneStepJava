package operator;

public class AssignmentOperator {

	public static void main(String[] args) {
		
		int x = 15,y=10,z=0;
		
		z = x+y;
		System.out.println("Z = X+Y : " + z);
		
		z +=x; // z=z+x
		System.out.println("z += x : " + z);
		
		z -= x;// z=z-x
		System.out.println("z -= x : " + z);
		
		z *= x;// z=z*x
		System.out.println("z *= x : " + z);
		
		z /= x;// z=z/x
		System.out.println("z /= x : " + z);
		
		z %= x;  // z=z%x
		System.out.println("z %= x : " + z);
		
		

	}

}
