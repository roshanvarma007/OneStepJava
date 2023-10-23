package stringBuffer;

public class stringBufferExample {

	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("Welcom To");
		buffer.append(" Our Home"); //mutable buffer object
		
	//buffer object pont out "Welcome to our home"
		System.out.println(buffer);
		System.out.println(buffer.length());
		System.out.println(buffer.insert(buffer.length(), " For Ganesh Chaturthi"));
		System.out.println(buffer.reverse());
		System.out.println(buffer.reverse());
		System.out.println(buffer.delete(0, 18));	
	}

}
