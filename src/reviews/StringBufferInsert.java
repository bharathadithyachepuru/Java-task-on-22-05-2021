package reviews;

public class StringBufferInsert {

	public static void main(String[] args) {

		 StringBuffer stringName = new StringBuffer(" Supporting");
		    System.out.println(stringName);
		    
		    stringName.insert(11, " for ");
		    System.out.println(stringName);
		    
		    stringName.insert(15, " Shoppers Stop ");
		    System.out.println(stringName);
		    
		    stringName.insert(29, " Client ");
		    System.out.println(stringName);
		    
	}

}
