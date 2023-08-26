package objectorientedprogramming;

public class carTest {

	public static void main(String[] args) {
		
		CAR myCar = new CAR("Tata");
		myCar.start();
		myCar.accelearate();
		myCar.showSpeed();
		myCar.stop();
		myCar.showSpeed();
		
		CAR myCar1 = new CAR ("Tata","Red",1999);
		System.out.println(myCar1);   // Call toString Method
	}

}
