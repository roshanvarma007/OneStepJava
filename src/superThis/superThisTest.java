package superThis;

public class superThisTest {

	public static void main(String[] args) {
		
		Car car = new Car ("Car", "Ferrari" , 320,true);
		
		System.out.println("Type of car " + car.getType() );
		System.out.println("Model of car " + car.getModel() );
		System.out.println("Max Speed of car " + car.getMaxSpeed() );
		System.out.println("Is car automatic ?" + car.isAutomatic);

	}

}
