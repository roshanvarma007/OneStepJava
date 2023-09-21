package arrayFromWebsite;

import java.util.Arrays;
import java.util.List;

public class arrayMethods {

	public static void main(String[] args) {
	
		//asList
		
		String [] arr = {"Radhe","Shyam","Love","EachOther"};
		
List<String> list = Arrays.asList(arr);

for (String s : list) {
	System.out.print(s + " ");
}



	}

}
