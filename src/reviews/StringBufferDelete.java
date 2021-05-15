package reviews;

public class StringBufferDelete {

	public static void main(String[] args) {

		StringBuffer myString = new StringBuffer("BharathAdithya");
	    System.out.println("Original String: " + myString);
	    
	    myString.delete(0, 2);
	    System.out.println("Modified String " + myString);

	}

}
