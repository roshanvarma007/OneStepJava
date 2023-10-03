package jewelleryProject;
import java.util.Scanner;
public class JewelleryShop {

	static class MetalPriceCalculator {
	    // Define metal prices per gram
	    private static final double GOLD_PRICE_PER_GRAM = 58;
	    private static final double SILVER_PRICE_PER_GRAM = 1;
	    private static final double PLATINUM_PRICE_PER_GRAM = 24;

	    public static  double calculateMetalPrice(String metal, double grams) {
	        switch (metal.toLowerCase()) {
	            case "gold":
	                return grams * GOLD_PRICE_PER_GRAM;
	            case "silver":
	                return grams * SILVER_PRICE_PER_GRAM;
	            case "platinum":
	                return grams * PLATINUM_PRICE_PER_GRAM;
	            default:
	                return 0.0; // Invalid metal type
	        }
	    }
	

	}
	
	static class JewelryShop {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Welcome to the Jewelry Shop!");

	        System.out.print("Enter the metal type (gold/silver/platinum): ");
	        String metal = scanner.nextLine();

	        System.out.print("Enter the grams you want: ");
	        double grams = scanner.nextDouble();

	        double metalPrice = 0;
			try {
				metalPrice = MetalPriceCalculator.calculateMetalPrice(metal, grams);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	        if (metalPrice > 0) {
	            System.out.println("Metal Price: $" + metalPrice);

	            System.out.print("Select the jewelry (Ring/Pendant/Earring/Neck/Bangle/Anklet/Toe Ring/Bracelet): ");
	            String jewelryType = scanner.next();

	            System.out.print("Enter the how many grams you want: ");
	            double gmQuantity = scanner.nextDouble();

	            double totalPrice = grams * metalPrice;
	            System.out.println("Total Price: $" + totalPrice);

	            System.out.print("Enter the payment amount: $");
	            double paymentAmount = scanner.nextDouble();

	            if (paymentAmount >= totalPrice) {
	                double change = paymentAmount - totalPrice;
	                System.out.println("Change: $" + change);
	                System.out.println("Thank you for your purchase! Enjoy your jewelry.");
	                

	                // You can add code here to send a nice message to the customer
	            } else {
	                System.out.println("Insufficient payment. Transaction canceled.");
	            }
	        } else {
	            System.out.println("Invalid metal type. Please choose from gold, silver, or platinum.");
	        }

	        scanner.close();
	    }
	}

}
