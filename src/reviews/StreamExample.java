package reviews;

import java.util.ArrayList;

public class StreamExample {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Bharath");
		names.add("Adithya");
		names.add("kareem");
		names.add("Sumanth");
		
		long count = names.stream().filter(str -> str.length()<6).count();
		
		System.out.println("There are" +count+ "string with less than 6");

	}

}
