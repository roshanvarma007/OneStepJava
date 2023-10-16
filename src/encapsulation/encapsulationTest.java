package encapsulation;

public class encapsulationTest {

	public static void main(String[] args) {
		
		Car car = new Car("Ferari",360,true);
		System.out.println("Car model is : " + car.getModel());
		System.out.println("Car maxSpeed is : " + car.getMaxSpeed());
		System.out.println("Car is Automatic? : " + car.isAutmatic());
	}

}
