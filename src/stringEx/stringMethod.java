package stringEx;

public class stringMethod {

	public static void main(String[] args) {
	
		String s1 = "My fav language is java";
		String s2 = "Hey";
		String s3 [];
		
		System.out.println("Find first char :" + s1.charAt(0));
		System.out.println("Forget first 5 letter 'substring' :" + s1.substring(7));
		System.out.println("Length of sting :" + s1.length());
		System.out.println("is empty :" + s1.isEmpty());
		System.out.println("is equal :" + s1.equals(s2));
		System.out.println("Concat :" + s1.concat(s2));
		System.out.println("Lowercase :" + s1.toLowerCase());
		System.out.println("Uppercase :" + s1.toUpperCase());
		
		//split method
		
		s3 = s1.split(" ");
		for (String string : s3) {
			System.out.println(string);
		}
		
		//Replace method
		
		System.out.println("\nReplace 'v' with 'V' :" + s1.replace('v', 'V'));
		
	}

}
