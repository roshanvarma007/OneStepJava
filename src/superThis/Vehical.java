package superThis;

public class Vehical {
	String type,model;
	int maxSpeed;
	
	//Make a cunstroctor
	
	public Vehical(String type,String model,int maxSpeed) {
		this.type = type;
		this.model = model;
		this.maxSpeed = maxSpeed;
		
	}
	//Getter Method

	public String getType() {
		return type;
	}

	public String getModel() {
		return model;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	
	

}
