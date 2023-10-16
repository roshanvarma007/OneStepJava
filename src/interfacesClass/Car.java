package interfacesClass;

public class Car implements Drivable {

	@Override
	public void turnLeft() {
		System.out.println("Car Can TURN Left");
		
	}

	@Override
	public void turnRight() {
		System.out.println("Car Can TURN Right");
		
	}

}
