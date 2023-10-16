package abstraClass;

public class Car extends Vehical{

	public Car(String type, String model) {
		super(type, model);
		
	}

	@Override
	public int getSpeed() {
		final int MAX_CAR_SPEED = 320;
		System.out.println("Max Car Speed is : " + MAX_CAR_SPEED);
		return MAX_CAR_SPEED;
	}
	public void start () {
		System.out.println("CAR has started. ");
	}

	public void stop () {
		System.out.println("CAR has stopped. ");
	}
}
