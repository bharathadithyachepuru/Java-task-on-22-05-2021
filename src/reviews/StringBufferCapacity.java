package reviews;

public class StringBufferCapacity {

	public static void main(String[] args) {

		StringBuffer str = new StringBuffer("I am Adithya");
		
	    int cap = str.capacity();
	    
	    System.out.println("Capacity : " + cap);

	}

}
