package reviews;

import java.util.HashMap;
import java.util.Map;

public class ForEachToIterateMap {

	public static void main(String[] args) {

		 Map<Integer, String> hmap = new HashMap<Integer, String>();
	      hmap.put(1, "Bharath");
	      hmap.put(2, "Adithya"); 
	      hmap.put(3, "kareem");  
	      hmap.put(4, "Sumanth");   
	      
	      
	      hmap.forEach((key,value)->System.out.println(key+" - "+value));
	      
	      hmap.forEach((key,value)->{
	    	  
	          if(key == 2){ 
	        	  
	             System.out.println("Value associated with key 2 is: "+value); 
	          }  
	       });    
	      
	      
	      hmap.forEach((key,value)->{
	    	  
	          if("Bharath".equals(value)) { 
	        	  
	             System.out.println("Key associated with Value Bharath is: "+key);
	          }
	       }); 

	}

}
