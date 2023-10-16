package nestedClass;

public class staticNestedExample {

	static int a = 5;
	private static int b = 10;
	int c = 15;
	
	static class staticNestedClass {
		
		void show () {
			System.out.println("a  : " + a);
			System.out.println("b   :"  + b);
			System.out.println("c  : " + c);
		}
	}

	

}
