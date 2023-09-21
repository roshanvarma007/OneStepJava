package arrayFromWebsite;
import java.util.*;

public class asListMethod {

	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<>();
		
		l1.add(16);
		l1.add(11);
		l1.add(12);
		l1.add(13);
		l1.add(14);
		l1.add(15);
		
		for (int i=0; i<l1.size(); i++) {
			System.out.println(l1.get(i));
		}
		

	}

}
