package array;

public class findDublicate {

	public static void main(String[] args) {
	
		int [] arry = {1,2,3,2,4,2,6,5,4};
		for (int i = 0 ; i<arry.length; i++) {
			for (int j = i+1; j<arry.length; j++) {
				if (arry [i] == arry [j]) {
					System.out.println("Dublicate Element : " + arry[i]);
				}
			}
		}

	}

}
