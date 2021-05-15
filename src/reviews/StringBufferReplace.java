package reviews;

public class StringBufferReplace {

	public static void main(String[] args) {

		 StringBuffer s = new StringBuffer("BharathAdithya");
		    System.out.println("Original String: " + s);
		    
		    s.replace(7, 14, "Kumar");
		    System.out.println("Modified String after replacing: " + s);

	}

}
