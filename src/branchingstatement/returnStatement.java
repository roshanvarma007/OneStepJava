package branchingstatement;

public class returnStatement {

	public static void main(String[] args) {
		
		int k = 2;
		
		switch(k) {
		case 1:
			System.out.println(k);
			break;
			
		case 2:
			System.out.println(k);
			return;
		}
System.out.println("Welcome");
	}

}
