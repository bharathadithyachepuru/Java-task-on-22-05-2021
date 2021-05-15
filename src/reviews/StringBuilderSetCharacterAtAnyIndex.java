package reviews;

public class StringBuilderSetCharacterAtAnyIndex {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("Home Town");
		
		sb.setCharAt(5, 't');
		
		System.out.println(sb);

	}

}
