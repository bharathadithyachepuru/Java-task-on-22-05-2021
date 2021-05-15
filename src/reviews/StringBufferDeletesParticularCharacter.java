package reviews;

public class StringBufferDeletesParticularCharacter {

	public static void main(String[] args) {

		StringBuffer myString = new StringBuffer("BharathAdithya");
	    System.out.println("Original String: " + myString);
	    
	    myString.deleteCharAt(3);
	    System.out.println("Resulting String after deleting a character at 0th index: " + myString);
	    
	    myString.deleteCharAt(11);
	    System.out.println("Resulting String after deleting a character at 6th index: " + myString);

	}

}
