package reviews;

import java.util.StringJoiner;

public class StringJoiningExample {

	public static void main(String[] args) {

		StringJoiner mystring = new StringJoiner(",");
		
		 mystring.setEmptyValue("This is a default String");
		 
		 System.out.println("Default String: "+mystring); 
		 
		    mystring.add("Bharath");  
	        mystring.add("Adithya"); 
	        mystring.add("Gupta");
	        mystring.add("Phani");
	        
	        System.out.println(mystring);  
	        
	        int length = mystring.length();  
	        System.out.println("Length of the StringJoiner: "+length);
	        
	        String s = mystring.toString();  
	        System.out.println(s);
	        
	}

}
