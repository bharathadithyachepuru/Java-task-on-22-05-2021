package reviews;

public class StringBuilderCapacity {

	public static void main(String[] args) {

		StringBuilder str = new StringBuilder();
		System.out.println(str.capacity());
		
		str.append("This is a program");
		System.out.println(str.capacity());

	}

}
