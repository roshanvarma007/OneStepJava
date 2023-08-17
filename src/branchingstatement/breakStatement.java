package branchingstatement;

public class breakStatement {

	public static void main(String[] args) {

		for (int i = 0; i<=10 ; i++) {
			if (i==7)
				break;       //We can not use break outside switch or loop
		
			System.out.println(i);
		}
		
		
		/*int a= 1;
		switch(a) {
		
		case 0 :
			System.out.println("hi");
			
		break;
		
		case 1 :
			System.out.println("hello");
			
		break;
		
		}*/
		
	}

}
