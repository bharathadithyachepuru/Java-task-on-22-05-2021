package reviews;

public class StringBuilderReplace {

	public static void main(String[] args) {

		StringBuilder str = new StringBuilder("I am good thanks");
		
		str.replace(0, 4, "Doing");
		
		System.out.println(str);
		
		

	}

}
