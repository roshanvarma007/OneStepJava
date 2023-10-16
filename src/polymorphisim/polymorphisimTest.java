package polymorphisim;

public class polymorphisimTest {

	public static void main(String[] args) {
		
		Vehical vehical = new Car();
		//this works because of Car is a sub class of vehical
		
		vehical.accelerate();
		
		Vehical vehical1 = new MoterCycle();
		
		vehical1.accelerate();

	}

}
