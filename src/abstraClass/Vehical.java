package abstraClass;

public abstract class Vehical {
String type,model;

//Declear public cunstroctor

public Vehical(String type,String model) {
	this.type = type;
	this.model = model;
}

//Now declear two non-abstract void method

public void start () {
	System.out.println("Vehical has started. ");
}

public void stop () {
	System.out.println("Vehical has stopped. ");
}
//abstract int method

public abstract int getSpeed();
}
