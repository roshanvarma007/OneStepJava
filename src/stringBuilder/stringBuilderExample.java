package stringBuilder;

public class stringBuilderExample {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("Welcom To");
		builder.append(" Our Home"); //mutable buffer object
		
	//buffer object pont out "Welcome to our home"
		System.out.println(builder);
		System.out.println(builder.length());
		System.out.println(builder.insert(builder.length(), " For Ganesh Chaturthi"));
		System.out.println(builder.reverse());
		System.out.println(builder.reverse());
		System.out.println(builder.delete(0, 18));

	}

}
