package superThis;

public class Car extends Vehical{

	boolean isAutomatic = false;
	
	//Constructor
	
	public Car(String type, String model, int maxSpeed,boolean isAutomatic) {
		super(type, model, maxSpeed); //Super class cunstroctor
		this.isAutomatic =  isAutomatic ;
		
	}
	//Getter method

	public boolean isAutomatic() {
		return isAutomatic;
	}
	
	

}
