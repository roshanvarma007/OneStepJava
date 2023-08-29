package array;

import java.util.Random;

public class arrayExample {

	 public static void main(String[] args) {
	        
	        String cards [] = {"Akka","Dhuri","Tiri","Chauka", "Puchka", "Chakka","Satta","Attha","Nauvaa","Thassa","Gulam","Rani","Badsah"};
	        
	        Random random = new Random ();
	        
	        System.out.println("---Mahesh Cards---");
	        
	 String m1 = cards[random.nextInt(0,13)];
	       	
	 System.out.println(m1); 
	 
	 String m2 = cards[random.nextInt(0,13)];
    	
	 System.out.println(m2); 
	 
	 String m3 = cards[random.nextInt(0,13)];
    	
	 System.out.println(m3); 
	 
	 
	  System.out.println("---Roshan Cards---");
      
		 String r1 = cards[random.nextInt(0,13)];
		       	
		 System.out.println(r1); 
		 
		 String r2 = cards[random.nextInt(0,13)];
	    	
		 System.out.println(r2); 
		 
		 String r3 = cards[random.nextInt(0,13)];
	    	
		 System.out.println(r3); 
		 
	    }
	}


