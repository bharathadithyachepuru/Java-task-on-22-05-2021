package reviews;

public class StringBuilderDelete {

	public static void main(String[] args) {
		
		StringBuilder str = new StringBuilder("Program");
		
		str.delete(0, 3);
		
		System.out.println(str);

	}

}
