package reviews;

public class UnBoxing {

	public static void main(String[] args) {
		
		//Creating Wrapper class object

		Integer obj = new Integer(10);
		
		//Converting Wrapper object to primitive data type
		
		int num = obj.intValue();
		
		System.out.println(num+ " "+ obj);

	}

}
