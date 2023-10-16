package encapsulation;

public class Car extends Vehical{
	
	private boolean isAutmatic = false;

	public Car(String model, int maxSpeed,boolean isAutmatic) {
		super(model, maxSpeed);
		this.isAutmatic = isAutmatic;
	}

	public boolean isAutmatic() {
		return isAutmatic;
	}

	public void setAutmatic(boolean isAutmatic) {
		this.isAutmatic = isAutmatic;
	}

}
