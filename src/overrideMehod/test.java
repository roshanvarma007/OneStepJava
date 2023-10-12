package overrideMehod;

public class test {

	public static void main(String[] args) {
		
		Vehical vehical = new Vehical();
		
		vehical.start();
		vehical.accelerate(80);
		vehical.stop();

		Car car = new Car ();
		car.start();
		car.accelerate(90);
		car.stop();
	}

	
	
	
}
