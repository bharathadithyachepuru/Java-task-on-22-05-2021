package reviews;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Learners { 
	
	   int id;     
	   String name;    
	   int age;   
	   
	   public Learners(int id, String name, int age) { 
		   
	        this.id = id;    
	        this.name = name;         
	        this.age = age;     
	   } 
	}  

public class CollectorsForFetchingDataAsList {

	public static void main(String[] args) {

		List<Learners> studentlist = new ArrayList<Learners>();   
	           
	      studentlist.add(new Learners(1551,"Bharath",25));      
	      studentlist.add(new Learners(1551,"Adithya",25));        
	      studentlist.add(new Learners(1549,"kareem",23));        
	      studentlist.add(new Learners(1550,"Sumanth",23));         
	                       
	            
	      List<String> names = studentlist.stream().map(n->n.name).collect(Collectors.toList());
	      
	      System.out.println(names);         

	}

}
