package objectorientedprogramming;

public class CAR {

	

		private String model;
		private int currentSpeed;
		private String color;
		private int year;
		
		
		// Now decleair public cunstrocto
		
		public CAR (String model) {
			this.model = model;
		}
		
		//Again declair constructor it hold three parameter
		
		public CAR (String model,String color,int year) {
			this.model = model;
			this.color = color;
			this.year = year;
		}
		
	//declear public method 4 Car class
		
		public void start () {
			System.out.println( this.model+" has started");
		}
		public void accelearate () {
			this.currentSpeed += 20;
		}
		public void stop () {
			System.out.println( this.model+" has stoped");
			this.currentSpeed = 0;
			
		}
		public void showSpeed () {
			System.out.println( "Current speed of "+ this.model+ " is :"+ this.currentSpeed);
		}
		public String toString () {
			return "Model : " + this.model + "Color : " + this.color + "Year" + this.year;
		}

}
