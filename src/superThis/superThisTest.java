package superThis;

public class superThisTest {

	public static void main(String[] args) {
		
		Car car = new Car ("Car", "Ferrari" , 320,true);
		
		System.out.print("Type of car" + car.getType() );
		System.out.print("Model of car" + car.getModel() );
		System.out.print("Max Speed of car" + car.getMaxSpeed() );
		System.out.print("Is car automatic ?" + car.isAutomatic);

	}

}
