package arrayFromWebsite;

public class practiceArrayQuestion {

	public static void main(String[] args) {
		
		// Create an array of 5 floats and calculate sum 
		
		float [] marks = {41.9f,65.9f,76.9f,49.9f,56.87f};
		
		float sum = 0;
		 for (float elements :marks) {
			 sum = sum+ elements;
		 }
		 
		 System.out.println("The Elements are : " + marks.toString() + " &" +  "The value of float value : " + sum);

	}

}
